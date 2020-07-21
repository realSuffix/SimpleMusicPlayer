package com.linhard.martin.musicplayer.mainactivity

import android.util.Log
import android.view.View
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AlbumViewHolder(
    layout: View,
    var albumTitle: TextView,
    var albumPlayButton: ImageButton
) : RecyclerView.ViewHolder(layout) {
    private val layout: LinearLayout = layout as LinearLayout

    init {
        // Attach listener for playing an album
        this.albumPlayButton.setOnClickListener {
            onPlayButtonPressed(it)
        }

        // Attach listener for getting a detailed view of an album
        this.layout.setOnClickListener {
            onAlbumSelected()
        }
    }

    private fun onPlayButtonPressed(view: View) {
        Log.i("main", "Play button was pressed")
    }

    private fun onAlbumSelected() {
        Log.i("main", "Album was selected")
    }
}