package dev.nakayiza.womansafetyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class Register_mobile_number_Activity : AppCompatActivity() {
    lateinit var etphonenumber:TextInputEditText
    lateinit var tv14:TextView
    lateinit var tv15:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_mobile_number)
        etphonenumber=findViewById(R.id.etphonenumber)
        tv14=findViewById(R.id.tv14)
        tv15=findViewById(R.id.tv15)


    }
}