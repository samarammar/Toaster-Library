package com.example.mylibrary;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {
    public static RetrofitAPI getClient() {

        // change your base URL
        Retrofit adapter = new Retrofit.Builder()
                .baseUrl("https://reqres.in/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
                ///Finally building the adapter

        //Creating object for our interface
        RetrofitAPI api = adapter.create(RetrofitAPI.class);
        return api; // return the APIInterface object
    }
}
