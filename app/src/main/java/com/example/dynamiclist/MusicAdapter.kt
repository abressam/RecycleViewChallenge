package com.example.dynamiclist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MusicAdapter (private val playlist: List<Music>) : RecyclerView.Adapter<MusicViewHolder>() {
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
}

class MusicViewHolder (private val view: View) : RecyclerView.ViewHolder(view) {
    fun bind (music: Music) {
        view.apply {
            findViewById<TextView>(R.id.music_name).text = music.name
            findViewById<TextView>(R.id.music_time).text = music.time
        }
    }
}