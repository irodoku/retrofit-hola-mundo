package com.example.myapplication.Utils;


import com.example.myapplication.Model.Negocio;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NegocioService {
    @GET ("negos/")
    Call<List<Negocio>> getNegocio();
}
