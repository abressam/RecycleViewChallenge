package com.example.dynamiclist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MusicAdapter : RecyclerView.Adapter<MusicViewHolder>() {

    private lateinit var playlist: List<Music>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.playlist_music, parent, false)
        return MusicViewHolder(view)
    }

    override fun onBindViewHolder (holder: MusicViewHolder, position: Int) {
        val music = playlist[position]
        holder.bind(music)
    }

    override fun getItemCount(): Int = playlist.size

    fun updateList(playlist: List<Music>) {
        this.playlist = playlist
    }
}

class MusicViewHolder(
    private val view: View
    ) : RecyclerView.ViewHolder(view) {
        fun bind (song: Music) {
            view.apply {
                findViewById<TextView>(R.id.music_name).setText(song.name)
                findViewById<TextView>(R.id.music_time).setText(song.time)
                findViewById<ImageView>(R.id.music_image).setImageResource(song.image)
            }
        }
    }