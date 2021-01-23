package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a = Toast.makeText(applicationContext,"Can't increase more than 9.", Toast.LENGTH_LONG)
        val b = Toast.makeText(applicationContext,"Can't decrease more than 0.", Toast.LENGTH_LONG)
        val c = Toast.makeText(applicationContext,"The number has been reset.", Toast.LENGTH_LONG)
        var count = 0

        button.setOnClickListener(){
            if (count >= 0 && count < 9){
                count++
                textView.setText("$count")
            }else{
                a.show()
            }
        }
        button2.setOnClickListener(){
            if (count > 0 && count <= 9){
                count--
                textView.setText("$count")
            }else{
                b.show()
            }
        }
        button3.setOnClickListener(){
            count = 0
            textView.setText("$count")
            c.show()
        }
    }
}

