package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UsersMessage {
    public void getMessageData(Context c){
        APIInterface apiInterface;
        apiInterface = APIClient.getClient().create(APIInterface.class);

        Call<UserList> call = apiInterface.doGetUserList();
        call.enqueue(new Callback<UserList>() {
            @Override
            public void onResponse(Call<UserList> call, Response<UserList> response) {

                UserList userList = response.body();
                Integer text = userList.page;
                Integer total = userList.total;
                Integer totalPages = userList.totalPages;
                List<UserList.Datum> datumList = userList.data;
//                Toast.makeText(c, text + " page\n" + total + " total\n" + totalPages + " totalPages\n", Toast.LENGTH_SHORT).show();

                for (UserList.Datum datum : datumList) {
                    Toast.makeText(c, "id : " + datum.id + " name: " + datum.first_name + " " + datum.last_name + " avatar: " + datum.avatar, Toast.LENGTH_SHORT).show();
                }


            }

            @Override
            public void onFailure(Call<UserList> call, Throwable t) {
                call.cancel();
            }
        });

    }
}
