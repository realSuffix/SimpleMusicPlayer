package com.linhard.martin.musicplayer.albumdetailactivity

import android.util.Log
import android.view.View
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SongViewHolder(
    layout: View,
    var songTitle: TextView
) : RecyclerView.ViewHolder(layout) {
    private val layout: LinearLayout = layout as LinearLayout

    init {
        // Attach listener for getting a detailed view of an album
        this.layout.setOnClickListener {
            onSongSelected()
        }
    }

    private fun onSongSelected() {
        Log.i("main", "Song was was selected")
    }
}