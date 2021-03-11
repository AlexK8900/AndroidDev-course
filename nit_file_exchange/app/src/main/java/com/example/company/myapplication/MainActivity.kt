package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        perform.setOnClickListener {
            if(Environment.getExternalStorageState() == Environment.MEDIA_MOUNTED){
                val path = Environment.getExternalStorageDirectory()
                var flag = false


                try { val fileContent1 = File(path, filepath.text.toString()).readText() }
                catch (e: FileNotFoundException) { filepath.setText("error") }
                try { val fileContent2 = File(path, filepath2.text.toString()).readText() }
                catch (e: FileNotFoundException) { filepath2.setText("error") }
                try{
                    val fileContent1 = File(path, filepath.text.toString()).readText()
                    val fileContent2 = File(path, filepath2.text.toString()).readText()
                    flag = true
                }
                catch(e : FileNotFoundException){flag = false}

                if (flag) {
                    val file1 = File(path, filepath.text.toString())
                    val file2 = File(path, filepath2.text.toString())
                    val fileContent1 = file1.readText()
                    val fileContent2 = file2.readText()
                    val bufferedWriter1 = BufferedWriter(FileWriter(file1))
                    val bufferedWriter2 = BufferedWriter(FileWriter(file2))
                    bufferedWriter1.write(fileContent2)
                    bufferedWriter1.close()
                    bufferedWriter2.write(fileContent1)
                    bufferedWriter2.close()
                }
            }

        }
    }
}
