package com.example.dialogfragments

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager


class MainActivity : AppCompatActivity() {
    companion object{
        var fragManager: FragmentManager? = null
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        fragManager = this.supportFragmentManager
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val frame: FrameLayout = findViewById(R.id.frame)
        frame.setOnClickListener {
            TestCheckboxDialog().show(supportFragmentManager, "TestCheckboxDialog")
        }
    }
}