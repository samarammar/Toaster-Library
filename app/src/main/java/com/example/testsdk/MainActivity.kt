package com.example.testsdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.UsersMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//       ToasterMessage().postData(this)

        UsersMessage().getMessageData(this)
    }
}