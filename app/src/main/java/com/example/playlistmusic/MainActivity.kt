package com.example.playlistmusic

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // button fb
        btn_fb.setOnClickListener({
            val i=Intent(Intent.ACTION_VIEW, Uri.parse("http://wwww.facebook.com/furqon fauzi"))
                startActivity(i)
        })
        btn_ig.setOnClickListener({
            val i=Intent(Intent.ACTION_VIEW, Uri.parse("http://wwww.instagram.com/furqonfauzi_17"))
            startActivity(i)
        })
        //deklarasi media player

        var MediaPlayer:MediaPlayer?=MediaPlayer.create(this,R.raw.asking_dear_insaniy)

        //button play
        btn_play.setOnClickListener{
            MediaPlayer?.start()
        }
        btn_pause.setOnClickListener{
            MediaPlayer?.pause()
        }
        btn_stop.setOnClickListener{
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }
    }
}
