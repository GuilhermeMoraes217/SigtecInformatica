package com.sigtecinformatica.appteste.Utils;

public class Apis {

    //public static final String URL_001 = "http://192.168.1.175:8080/";
    public static final String URL_001 = "http://127.0.0.1:8080/";

    public static PersonaService getPersonaService(){
        return Cliente.getCliente(URL_001).create(PersonaService.class);
    }
}
