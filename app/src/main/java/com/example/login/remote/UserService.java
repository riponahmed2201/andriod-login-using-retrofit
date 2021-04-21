package com.example.login.remote;

import com.example.login.model.ResponseObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserService {

    @GET("login.php/{username}/{password}")
    Call<ResponseObject> login(@Path("username") String username, @Path("password") String password);
}
