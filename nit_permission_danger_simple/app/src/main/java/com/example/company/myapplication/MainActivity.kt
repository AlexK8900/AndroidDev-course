package com.example.company.myapplication

import android.Manifest
import android.Manifest.permission.CAMERA
import android.content.Intent
import android.content.pm.ActivityInfo
import android.content.pm.PackageManager
import android.content.pm.PackageManager.PERMISSION_GRANTED
import android.graphics.Camera
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val REQ_CODE = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        val status = ContextCompat.checkSelfPermission(this, arrayOf(CAMERA).toString())
        if(status != PERMISSION_GRANTED){ActivityCompat.requestPermissions(this, arrayOf(CAMERA), REQ_CODE)}
//        if(status != PERMISSION_GRANTED){
//        val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS, Uri.fromParts("package", packageName, null))
//        startActivity(intent)}

    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) =
            when(requestCode){
                REQ_CODE -> {textView.setText("Ok")}
                else -> {

                }
            }
}
