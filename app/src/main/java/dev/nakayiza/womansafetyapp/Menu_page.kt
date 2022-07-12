package dev.nakayiza.womansafetyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class Menu_page: AppCompatActivity() {
    lateinit var tilRegister : TextInputLayout
    lateinit var tilInstructions : TextInputLayout
    lateinit var tilViewRegistered : TextInputLayout
    lateinit var tilRegistermn : TextInputLayout
    lateinit var etRegister : TextInputEditText
    lateinit var etInstructions : TextInputEditText
    lateinit var etViewRegistered : TextInputEditText
    lateinit var etRegistermn : TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_page)
        tilRegister=findViewById(R.id.tilRegister)
        tilInstructions=findViewById(R.id.tilInstructions)
        tilViewRegistered=findViewById(R.id.tilViewRegistered)
        tilRegistermn=findViewById(R.id.tilRegistermn)
        etRegister=findViewById(R.id.etRegister)
        etInstructions=findViewById(R.id.etInstructions)
        etViewRegistered=findViewById(R.id.tilViewRegistered)
        etRegistermn=findViewById(R.id.etRegistermn)

        tilRegister.setOnClickListener {
            val intent = Intent(this,Register_Page::class.java)
            startActivity(intent)

        }
    }


}