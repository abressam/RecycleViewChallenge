package com.example.dynamiclist

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Music (
    @StringRes
    val name: Int,
    @StringRes
    val time: Int,
    @DrawableRes
    val image: Int,
    @StringRes
    val description: Int
    )
