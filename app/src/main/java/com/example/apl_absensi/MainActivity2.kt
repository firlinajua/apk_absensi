package com.example.apl_absensi

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


    }
    fun itu(view: View){
        val vita = Intent(this,MainActivity3::class.java)
        startActivity(vita)
    }

    fun exitAppCLICK(view: View?) {
        finishAffinity()
        System.exit(0)
    }







}