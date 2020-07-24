package com.linhard.martin.musicplayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.linhard.martin.musicplayer.beans.Album
import com.linhard.martin.musicplayer.mainactivity.AlbumAdapter

class MainActivity : AppCompatActivity() {

    lateinit var albumRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val albums = mutableListOf<Album>()
        albums.add(Album("A Maze of Recycled Creed", "37226db1-c4f2-4c1d-8856-dbd89a529109"))

        albumRecyclerView = findViewById(R.id.album_rv)
        albumRecyclerView.layoutManager = LinearLayoutManager(this.applicationContext)
        albumRecyclerView.adapter = AlbumAdapter(albums, this.applicationContext)
    }
}