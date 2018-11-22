package com.example.jasas.materiald

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Toast.makeText(this, session.user, Toast.LENGTH_SHORT).show()
        txtUserSession.text = session.user
    }
}
