package com.example.myapplication.Utils;

import com.example.myapplication.RetroClient;

public class Apis {

    public static UserService getUserService(){
        return RetroClient.getClient("localhost:8080")
                .create(UserService.class);
    }
}
