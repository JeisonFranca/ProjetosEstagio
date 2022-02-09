package com.example.identidade20;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConfig {

    private Retrofit retrofit;

    public RetrofitConfig(){
        this.retrofit = new Retrofit.Builder()
                .baseUrl("https://")
                .client(ContornaCertificado.getUnsafeOkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    //todo pega a interface e faz um metodo para instanciar
    public FunService getFunService(){
        //todo cria uma classe para a interface
        return this.retrofit.create(FunService.class);
    }
}
