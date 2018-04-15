package com.lonelyyhu.exercise.android_deeplink

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun showIntent(view: View) {

        Log.wtf("MainActivity", "onCreate => ${intent.action}")
        Log.wtf("MainActivity", "onCreate => ${intent.data}")

        intent.data?.let {

            Log.wtf("MainActivity", "showIntent => ${it.path}")
            Log.wtf("MainActivity", "showIntent => ${it.queryParameterNames}")
            Log.wtf("MainActivity", "showIntent => ${it.getQueryParameter("id")}")

        }

    }


}
