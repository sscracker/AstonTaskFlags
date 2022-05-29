package com.example.astontaskflags

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import com.bumptech.glide.Glide

open class TaskTwoActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var imageView:ImageView
    private lateinit var text:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_two)
        imageView = findViewById(R.id.imageView2)
        button = findViewById(R.id.button)
        var editText:EditText = findViewById(R.id.edittext)
        text = editText.text.toString()
        onClick(button)

    }
  open  fun onClick(button: Button){
        Glide.with(this)
            .load(text)
            .into(imageView)
    }


}