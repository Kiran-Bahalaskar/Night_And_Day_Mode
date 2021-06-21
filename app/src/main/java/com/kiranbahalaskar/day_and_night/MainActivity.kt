package com.kiranbahalaskar.day_and_night

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.SwitchCompat
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    private lateinit var day_night_switch: SwitchCompat
    private lateinit var bg: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        day_night_switch = findViewById(R.id.day_night_switch)
        bg = findViewById(R.id.bg)

        day_night_switch.setOnCheckedChangeListener { buttonView, isChecked ->

            if (isChecked){
                bg.setBackgroundResource(R.drawable.ic_night)
            }else{
                bg.setBackgroundResource(R.drawable.ic_day)
            }
        }
    }
}