package com.linhard.martin.musicplayer.albumdetailactivity

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.linhard.martin.musicplayer.R
import com.linhard.martin.musicplayer.beans.Song

class SongAdapter(private var songs: List<Song>) : RecyclerView.Adapter<SongViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.song_item, parent, false)
        val albumTitle = layout.findViewById<TextView>(R.id.song_title)
        return SongViewHolder(layout, albumTitle)
    }

    override fun getItemCount(): Int {
        return this.songs.size
    }

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        holder.songTitle.text = this.songs[position].name
    }
}