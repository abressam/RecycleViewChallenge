package com.example.dynamiclist

import androidx.annotation.DrawableRes

data class Music (
    val name: String,
    val time: String,
    @DrawableRes
    val image: Int?,
    val description: String
    )
