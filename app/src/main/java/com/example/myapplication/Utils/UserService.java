package com.example.myapplication.Utils;


import com.example.myapplication.Model.User;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserService {
    @GET ("getthis/")
    Call<User> getUser();
}
