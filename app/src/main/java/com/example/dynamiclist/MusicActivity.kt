package com.example.dynamiclist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MusicActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music)

        val recyclerView = findViewById<RecyclerView>(R.id.recycle_view)

        val adapter = MusicAdapter()

        val viewModel = ViewModelProvider(this).get(PlaylistViewModel::class.java)
        viewModel.playlistInfo.observe(this) { playlistInfo -> adapter.updateList(playlistInfo) }

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter

        viewModel.loadPlaylist()

    }
}