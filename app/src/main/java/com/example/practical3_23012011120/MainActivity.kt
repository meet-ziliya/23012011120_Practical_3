package com.example.practical3_23012011120

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.provider.AlarmClock
import android.widget.Button
import android.content.Intent
import android.provider.MediaStore
import android.widget.EditText
import androidx.core.net.toUri


class MainActivity : AppCompatActivity() {
    @SuppressLint("IntentReset")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val editWeb = findViewById<EditText>(R.id.edittextweburl)
        val editPhone = findViewById<EditText>(R.id.edittextphone)

        findViewById<Button>(R.id.button1).setOnClickListener {
            var url = editWeb.text.toString().trim()
            if (url.isNotEmpty()) {
                if (!url.startsWith("http://") && !url.startsWith("https://")) {
                    url = "http://$url"   // default to http
                }
                val intent = Intent(Intent.ACTION_VIEW, url.toUri())
                startActivity(intent)
            }
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            val phone = editPhone.text.toString().trim()
            if (phone.isNotEmpty()) {
                val intent = Intent(Intent.ACTION_DIAL, "tel:$phone".toUri())
                startActivity(intent)
            }
        }

        findViewById<Button>(R.id.button3).setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = "content://call_log/calls".toUri()
            }
            startActivity(intent)
        }

       findViewById<Button>(R.id.button4).setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                type = "image/*"
                data = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            }
            startActivity(intent)
        }

        findViewById<Button>(R.id.button5).setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

        findViewById<Button>(R.id.button6).setOnClickListener {
            val intent = Intent(AlarmClock.ACTION_SHOW_ALARMS)
            startActivity(intent)
        }

        findViewById<Button>(R.id.button7).setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}