package com.example.mylibrary

import android.content.Context
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class ToasterMessage {

    private fun postData(c: Context?) {
//
//        val call: Call<DataModal> = retrofitAPI.createPost(modal)
//
//        call.enqueue(object : Callback<DataModal?> {
//            override fun onResponse(call: Call<DataModal?>, response: Response<DataModal?>) {
//                Toast.makeText(this@APIActivity, "Data added to API", Toast.LENGTH_SHORT).show()
//                loadingPB.setVisibility(View.GONE)
//                jobEdt.setText("")
//                nameEdt.setText("")
//                val responseFromAPI = response.body()
//                val responseString = """
//             Response Code : ${response.code()}
//             Name : ${responseFromAPI.getName()}
//             Job : ${responseFromAPI.getJob()}
//             """.trimIndent()
//                responseTV.setText(responseString)
//            }
//
//            override fun onFailure(call: Call<DataModal?>, t: Throwable) {
//                responseTV.setText("Error found is : " + t.message)
//            }
//        })

        Api.getClient().getUsers(object : Callback<DataModal?>  {
            override fun onResponse(call: Call<DataModal?>, response: Response<DataModal?>) {
                val responseFromAPI = response.body()
                Toast.makeText(c, responseFromAPI?.email, Toast.LENGTH_SHORT).show()
            }

            override fun onFailure(call: Call<DataModal?>, t: Throwable) {
                Toast.makeText(c, t.message, Toast.LENGTH_SHORT).show()
            }

        })

//        val retrofit = Retrofit.Builder()
//            .baseUrl("https://reqres.in/api/")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//        val retrofitAPI = retrofit.create(RetrofitAPI::class.java)
//        val modal = DataModal(name, job)
//        val call: Call<DataModal> = retrofitAPI.createPost(modal)
//        call.enqueue(object : Callback<DataModal?> {
//            override fun onResponse(call: Call<DataModal?>, response: Response<DataModal?>) {
//                Toast.makeText(this@APIActivity, "Data added to API", Toast.LENGTH_SHORT).show()
//
//                val responseFromAPI = response.body()
//                val responseString = """
//                 Response Code : ${response.code()}
//                 Name : ${responseFromAPI.getName()}
//                 """.trimIndent()
//            }
//
//            override fun onFailure(call: Call<DataModal?>, t: Throwable) {
//                responseTV.setText("Error found is : " + t.message)
//            }
//        })

//        Api.getClient().getUsersList(object : Callback<List<UserListResponse?>?> {
//            fun success(userListResponses: List<UserListResponse?>, response: Response<*>?) {
//                // in this method we will get the response from API
//                progressDialog.dismiss() //dismiss progress dialog
//                userListResponseData = userListResponses
//                setDataInRecyclerView() // call this method to set the data in adapter
//            }
//
//            fun failure(error: RetrofitError) {
//                // if error occurs in network transaction then we can get the error in this method.
//                Toast.makeText(this@MainActivity, error.toString(), Toast.LENGTH_LONG).show()
//                progressDialog.dismiss() //dismiss progress dialog
//            }
//        })
    }
    fun s(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}