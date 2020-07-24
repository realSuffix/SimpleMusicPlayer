package com.linhard.martin.musicplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.linhard.martin.musicplayer.albumdetailactivity.SongAdapter
import com.linhard.martin.musicplayer.beans.Album
import com.linhard.martin.musicplayer.beans.Song
import com.linhard.martin.musicplayer.mainactivity.AlbumAdapter

class AlbumDetailActivity : AppCompatActivity() {
    lateinit var songRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_album_detail)

        val songs = mutableListOf<Song>()
        songs.add(Song("Temple to the Art God"))

        songRecyclerView = findViewById(R.id.songs_rv)
        songRecyclerView.layoutManager = LinearLayoutManager(this.applicationContext)
        songRecyclerView.adapter = SongAdapter(songs)
    }
}