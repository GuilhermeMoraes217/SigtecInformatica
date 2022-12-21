package com.sigtecinformatica.appteste;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.sigtecinformatica.appteste.Model.Persona;

import java.util.List;

public class PersonaAdapter extends ArrayAdapter<Persona> {
    private Context context;
    private List<Persona> personas;

    public PersonaAdapter(@NonNull Context context, int resource, @NonNull List<Persona> objects) {
        super(context, resource, objects);
        this.context = context;
        this.personas = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater  layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = layoutInflater.inflate(R.layout.content_main, parent, false);

        TextView textId = (TextView) rowView.findViewById(R.id.textId);
        TextView textNome = (TextView) rowView.findViewById(R.id.textNome);
        TextView textApelido = (TextView) rowView.findViewById(R.id.textApelido);

        textId.setText(String.format("ID:%s", personas.get(position).getId()));
        textId.setText(String.format("Nome:%s", personas.get(position).getNomes()));
        textId.setText(String.format("Apelido:%s", personas.get(position).getApelidos()));

        return rowView;

    }
}
