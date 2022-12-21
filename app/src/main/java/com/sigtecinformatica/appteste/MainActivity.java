package com.sigtecinformatica.appteste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.sigtecinformatica.appteste.Model.Persona;
import com.sigtecinformatica.appteste.Utils.PersonaService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    PersonaService personaService;
    List<Persona> listPersonas = new ArrayList<>();
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializaComponentes();
        listarPersonas();
    }

    public void listarPersonas () {
        Call<List<Persona>> call = personaService.getPersonas();
        call.enqueue(new Callback<List<Persona>>() {
            @Override
            public void onResponse(Call<List<Persona>> call, Response<List<Persona>> response) {
                listPersonas = response.body();
                listView.setAdapter(new PersonaAdapter(MainActivity.this, R.layout.content_main, listPersonas));
            }

            @Override
            public void onFailure(Call<List<Persona>> call, Throwable t) {
                Log.e("Erro", t.getMessage());
            }
        });
    }

    public void inicializaComponentes () {
        listView = findViewById(R.id.listView);
    }
}