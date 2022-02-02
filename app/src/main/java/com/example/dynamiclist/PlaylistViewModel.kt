package com.example.dynamiclist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlaylistViewModel() : ViewModel () {
    private val _playlistInfo: MutableLiveData<List<Music>> = MutableLiveData()
    val playlistInfo: LiveData<List<Music>> = _playlistInfo

    fun loadPlaylist () {
        _playlistInfo.value = MusicData().loadSongs()
    }
}