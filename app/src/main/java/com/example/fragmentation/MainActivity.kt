package com.example.fragmentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.annotation.SuppressLint
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : ComponentActivity() {
    private lateinit var editTextFirstName: EditText
    private lateinit var editTextLastName: EditText
    private lateinit var buttonApply: Button
    private lateinit var textViewFullName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextFirstName = findViewById(R.id.editText_firstName)
        editTextLastName = findViewById(R.id.editText_lastName)
        buttonApply = findViewById(R.id.button_apply)
        textViewFullName = findViewById(R.id.textView_fullName)

        buttonApply.setOnClickListener {
            showText(editTextFirstName.text.toString(), editTextLastName.text.toString())
        }
    }

    @SuppressLint("SetTextI18n")
    private fun showText(firstName: String?, lastName: String?) {
        textViewFullName.text = "$firstName $lastName"
    }
}
