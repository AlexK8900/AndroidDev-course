package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (editText.text.toString().isEmpty()) {
                    status.text = "error"
                }
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(p0: Editable?) {
             if(editText.isFocused()){
                    try{
                        editText2.setText("${editText.text.toString().toFloat() / 39370}")
                        status.setText("")
                    }
                    catch(e: NumberFormatException){status.setText("error")}
               }
            }
        })
        editText2.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (editText2.text.toString().isEmpty()) {
                    status.text = "error"
                }
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(p0: Editable?) {
                if(editText2.isFocused()){
                    try{
                        editText.setText("${editText2.text.toString().toFloat() * 39370}")
                        status.setText("")
                    }
                    catch(e: NumberFormatException){status.setText("error")}
              }
            }
        })
    }
}
