package com.example.sho_sakai.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("太郎", 53, "趣味")

        human.say()
        Log.d("kotlintest", "私の名前は" + human.name + "です。")
        Log.d("kotlintest", "年は" + human.age + "歳です。")

        human.think()
        Log.d("kotlintest", "私は" + human.hobby + "について考える。")

        val str3 = "Hello"
        val length = str3.length
        Log.d("kotlintest", length.toString())
        }

    }
