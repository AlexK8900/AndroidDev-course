package com.example.company.myapplication

import android.os.Bundle
import android.os.Environment
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        perform.setOnClickListener {
            if(Environment.getExternalStorageState() == Environment.MEDIA_MOUNTED){
                var count = 0
                var file = File(path.text.toString())
                if (file.isDirectory) {
                    var list = file.listFiles()
                    for (f in list) {
                        if (f.isFile) count++
                    }
                    result.setText("${count}")
                }
                else result.setText("Error")
            }
        }
    }
}
