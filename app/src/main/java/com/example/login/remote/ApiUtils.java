package com.example.login.remote;

public class ApiUtils {
    public static final String BASE_URL = "localhost/auth/";

    public static UserService getUserService(){
        return RetrofitClient.getClient(BASE_URL).create(UserService.class);
    }
}
