package com.example.mylibrary;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;

public interface RetrofitAPI {

    @GET("users")
    public void getUsers(
            Callback<DataModal> callback);


}
