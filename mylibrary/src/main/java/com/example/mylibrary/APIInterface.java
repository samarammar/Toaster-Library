package com.example.mylibrary;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;

public interface APIInterface {

//    @GET("/users")
//    public void getUsers(
//             Callback<DataModal> callback);

    @GET("/api/users?page=2")
    Call<UserList> doGetUserList();

}
