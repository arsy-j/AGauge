package com.arsy.agauge
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.github.anastr.speedviewlib.SpeedView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.button)

        val speedView = findViewById<SpeedView>(R.id.speedView)
        button.setOnClickListener {
            val nilai = editText.text.toString().toFloat()
            speedView.speedTo(nilai)
        }
    }}