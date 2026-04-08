package com.example.topsoccerteams

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Arrays

class MainActivity : AppCompatActivity() {


    val teams = arrayOf<String>("Mamelodi Sundowns FC", "Orlando Pirates",
        "Bidvest Wits", "Stellenbosch FC",
        "Sehukune united FC")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val teamsOutput = findViewById<TextView>(R.id.txtOutput)

        //changes the value of position - in the array
        teams[0] = "Mamelodi Sundowns FC :3"

        //displays array in the textview
        var teamsDisplay = ""
        var counter = 0
        while (counter < teams.count()) {
            teamsDisplay += "${teams[counter]}\n"
            counter++

        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}