package com.example.company.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        convertButton.setOnClickListener {
            try{
                if(systemOfCalculus.text.toString().toInt() < 37
                        && systemOfCalculus.text.toString().toInt() > 1 )
                    convertResult.setText("${number.text.toString().toInt().toString(
                            systemOfCalculus.text.toString().toInt())}")
                else convertResult.setText("Error")
            }
            catch(e: NumberFormatException){convertResult.setText("Error")}
        }

    }
}
