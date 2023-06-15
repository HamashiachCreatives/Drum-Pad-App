package com.example.drumpad

import android.graphics.Color
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getSoundAndColor(view: View){

        var btnClicked: Button = view as Button

        var mediaPlayer: MediaPlayer = MediaPlayer.create(this, resources.getIdentifier(
            btnClicked.tag.toString(), "raw", packageName))
        val randomColor = getRandomColor()
        btnClicked.setBackgroundColor(randomColor)
        mediaPlayer.start()

    }

    fun getRandomColor(): Int {
        val red = (0..255).random()
        val green = (0..255).random()
        val blue = (0..255).random()
        return Color.rgb(red, green, blue)
    }
}