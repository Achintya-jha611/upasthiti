package com.example.upasthiti

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var currentTV: TextView
        lateinit var currentDate:TextView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        val formatter1 = SimpleDateFormat(" 'Date: 'MM-dd-yyyy")
        val formatter = SimpleDateFormat(" 'Time: 'kk:mm:ss a")
        val buttonC = findViewById<Button>(R.id.proceed)
        val buttonLogout=findViewById<Button>(R.id.logoutFromPage)
        val date = formatter.format(Date())
        val time = formatter.format(Date())
        val date2=formatter1.format(Date())
        currentDate=findViewById(R.id.TD1)
        currentDate.text=date2
        currentTV = findViewById(R.id.TD)
        currentTV.text=time
        val deadline="09:00:00"
        if (time<deadline){
            buttonC.setEnabled(false)
            Toast.makeText(this,"You have missed the deadline",Toast.LENGTH_SHORT).show()
            Toast.makeText(this,"Tap on logout button to log out",Toast.LENGTH_LONG).show()
        }
        else{
        buttonC.setOnClickListener {
            val intent = Intent(this, MainActivity8::class.java)
            startActivity(intent)

        }}

        buttonLogout.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }



       // val sdf = SimpleDateFormat("'Date: 'dd-MM-yyyy '\nTime:  'HH:mm:ss z")
        //val currentDateAndTime = sdf.format(Date())
        //currentTV.text = currentDateAndTime

    }
}