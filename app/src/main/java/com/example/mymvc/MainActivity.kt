package com.example.mymvc

import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // 初始化 button、spinner 和 textView
        val button: Button = findViewById(R.id.button2)
        val spinner: Spinner = findViewById(R.id.spinner2)
        val textView: TextView = findViewById(R.id.textView2)
        val export = Programexport()
        button.setOnClickListener {
            val selectedFeature = spinner.selectedItem.toString()
            textView.text = export.getLanguage(spinner.selectedItem.toString())
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
