package com.example.company.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.io.IOException
import java.lang.Exception
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            var thr = object : Thread() {

                override fun run() {
                    try{
                        var url = "${editText.text.toString()}"
                        var connection: HttpURLConnection? = null
                        connection = URL(url).openConnection() as HttpURLConnection
                        connection.connect()
                        val code = connection.responseCode
                        runOnUiThread{
                            if (code != 1) textView.setText("Ok")
                            else textView.setText("Failed")

                        }
                }
                    catch(e : IOException){textView.setText("Failed")}
                }

            }
            thr.start()
            thr.join()
        }

    }
}
