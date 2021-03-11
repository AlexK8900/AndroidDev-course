package com.example.company.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = MutableList(0, {""})
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data)
        spinner.adapter = adapter

        editText.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(p0: Editable?) {
                try{
                    data.clear()
                    for (i in 1..editText.text.toString().toInt()) data.add("$i")
                    adapter.notifyDataSetChanged()

                }
                catch(e : NumberFormatException){
                    data.clear()
                    adapter.notifyDataSetChanged()
                }
            }
        })

    }
}
