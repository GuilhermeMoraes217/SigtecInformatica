package com.sigtecinformatica.appteste.Utils;

import com.sigtecinformatica.appteste.Model.Persona;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PersonaService {

    @GET("listar/")
    Call<List<Persona>>getPersonas();
}
