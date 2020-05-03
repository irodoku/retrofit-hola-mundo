package com.example.myapplication.Utils;

import android.util.Log;

import com.example.myapplication.RetroClient;

public class Apis {

    public static NegocioService getNegocioService(){
        Log.e("Apis","getNegocioService");
        return RetroClient.getClient("http://192.168.0.103:8080/demo/")//192.168.0.103 http://192.168.0.103/
                .create(NegocioService.class);
    }
}
