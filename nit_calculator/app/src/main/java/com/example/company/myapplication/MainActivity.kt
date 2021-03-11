package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        add.setOnClickListener {

            try {
                val one = arg1.text.toString().toInt()
                val two = arg2.text.toString().toInt()
                answer.setText("${one + two}")
            }
            catch (e: Exception) { answer.setText("Input Error") }
        }
        subtr.setOnClickListener {

            try {
                val one = arg1.text.toString().toInt()
                val two = arg2.text.toString().toInt()
                answer.setText("${one - two}")
            }
            catch (e : Exception){ answer.setText("Input Error")}
        }
        mul.setOnClickListener {

            try {
                val one = arg1.text.toString().toInt()
                val two = arg2.text.toString().toInt()
                answer.setText("${one * two}")
            }
            catch (e : Exception){ answer.setText("Input Error")}
        }
        divide.setOnClickListener {

            try {

                val one = arg1.text.toString().toInt()
                val two = arg2.text.toString().toInt()
                if(two == 0) answer.setText("Div by zero")
                else answer.setText("${one / two}")


            }
            catch (e : Exception){ answer.setText("Input Error")}
        }
    }
}
