package dev.nakayiza.womansafetyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class Register_Page : AppCompatActivity() {
    lateinit var etName:TextInputEditText
    lateinit var etNumber:TextInputEditText
    lateinit var tv3:TextView
    lateinit var tv4:TextView
    lateinit var tv5:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page)
        etName=findViewById(R.id.etName)
        etNumber=findViewById(R.id.etNumber)
        tv3=findViewById(R.id.tv3)
        tv4=findViewById(R.id.tv4)
        tv5=findViewById(R.id.tv5)

        tv4.setOnClickListener {
            val intent=Intent(this,Instructions_page::class.java)
            startActivity(intent)
        }
    }
}