package com.pardeep.implementactivitylife_cycle

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    // decleration of var using null
    var username : EditText? = null
    var rollnumber : EditText? = null
    var next : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this ,"oncreate",Toast.LENGTH_SHORT ).show()
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // initilization of var
        username = findViewById(R.id.username)
        rollnumber = findViewById(R.id.rollnumber)
        next = findViewById(R.id.next)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        next?.setOnClickListener() {
            var intent = Intent(this, SecondActivity::class.java)
            startActivities(arrayOf(intent))
            this.finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this , "on" ,Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onresume",Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onpause",Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"onStop",Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"onrestart",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this ,"onfinishe",Toast.LENGTH_SHORT).show()
    }
}