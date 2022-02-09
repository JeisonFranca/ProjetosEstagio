package com.example.identidade20;

import android.content.Intent;
import android.os.Bundle;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;



public interface FunService {

    @GET("Sample.php") Call<List<Funcionarios>> buscarFuncionarioPorSetor(
                                                @Query("action") String action,
                                                @Query("setor") String setor);

    @GET("Sample.php") Call<List<Funcionarios>> buscarFuncionarioPorMatricula(
                                                @Query("action") String action,
                                                @Query("matricula") String matricula);

}





