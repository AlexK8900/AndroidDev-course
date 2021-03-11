package com.example.company.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
    override fun onPause() {
        super.onPause()
        intent.putExtra("name",editText.text.toString())
        editText.setText("")
    }

    override fun onResume() {
        super.onResume()
        textView.setText(intent.getStringExtra("name"))
    }
}
