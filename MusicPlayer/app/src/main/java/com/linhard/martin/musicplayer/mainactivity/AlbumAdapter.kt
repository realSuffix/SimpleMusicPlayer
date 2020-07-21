package com.linhard.martin.musicplayer.mainactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.linhard.martin.musicplayer.R
import com.linhard.martin.musicplayer.beans.Album

class AlbumAdapter(
    private var albums: List<Album>
) : RecyclerView.Adapter<AlbumViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.album_item, parent, false)
        val albumPlayImage = layout.findViewById<ImageButton>(R.id.album_play_button)
        val albumTitle = layout.findViewById<TextView>(R.id.album_title)
        return AlbumViewHolder(layout, albumTitle, albumPlayImage)
    }

    override fun getItemCount(): Int {
        return this.albums.size
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        holder.albumTitle.text = this.albums[position].name
        holder.albumPlayButton.setImageResource(R.drawable.ic_baseline_play_arrow_24)
    }
}