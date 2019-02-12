package com.example.qbuser.architecturecomponenttutorial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            if(editText.text.toString().length > 0){
                textView.text = textView.text.toString()+ "\n" + editText.text.toString()
                editText.text = null
            }
        }
    }
}
