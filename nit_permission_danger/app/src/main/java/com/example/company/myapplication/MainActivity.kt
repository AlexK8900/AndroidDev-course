package com.example.company.myapplication

import android.Manifest.permission.CAMERA
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {

            ActivityCompat.requestPermissions(this, arrayOf(CAMERA), 1)
//            val status = ContextCompat.checkSelfPermission(this, CAMERA)
        }


    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        if(requestCode == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
            textView.setText("Granted")
        }
        if(requestCode == 1 && grantResults[0] == PackageManager.PERMISSION_DENIED){
            textView.setText("Denied")
        }

    }
}
