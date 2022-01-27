package com.example.cicdexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditTextView: EditText
    private lateinit var nameText: TextView
    lateinit var saveButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nameEditTextView = findViewById(R.id.name_view)
        nameText = findViewById(R.id.nameText)
        saveButton = findViewById(R.id.saveBtn)
        saveButton.text = "Update"

        saveButton.setOnClickListener {
            if (nameEditTextView.text.isNotBlank())
                nameText.text = nameEditTextView.text
        }

    }
}
