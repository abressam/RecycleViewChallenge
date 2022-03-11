package com.example.dynamiclist

import android.content.res.Resources

class MusicData {
    fun loadSongs(resources: Resources): List<Music> = listOf (
        Music(
            name = resources.getString(R.string.bad_habits),
            time = resources.getString(R.string.bad_habits_time),
            image = R.drawable.bad_habits_image,
            description = resources.getString(R.string.bad_habits_description)
        ),
        Music(
            name = resources.getString(R.string.shape_of_you),
            time = resources.getString(R.string.shape_of_you_time),
            image = R.drawable.shape_of_you_image,
            description = resources.getString(R.string.shape_of_you_description)
        ),
        Music(
            name = resources.getString(R.string.galway_girl),
            time = resources.getString(R.string.galway_girl_time),
            image = R.drawable.galway_girl_image,
            description = resources.getString(R.string.galway_girl_description)
        ),
        Music(
            name = resources.getString(R.string.faster_car),
            time = resources.getString(R.string.faster_car_time),
            image = R.drawable.faster_car_image,
            description = resources.getString(R.string.faster_car_description)
        ),
        Music(
            name = resources.getString(R.string.let_it_be),
            time = resources.getString(R.string.let_it_be_time),
            image = R.drawable.let_it_be_image,
            description = resources.getString(R.string.let_it_be_description)
        ),
        Music(
            name = resources.getString(R.string.here_comes_the_sun),
            time = resources.getString(R.string.here_comes_the_sun_time),
            image = R.drawable.here_comes_the_sum_image,
            description = resources.getString(R.string.here_comes_the_sun_description)
        ),
        Music(
            name = resources.getString(R.string.castle_on_the_hill),
            time = resources.getString(R.string.castle_on_the_hill_time),
            image = R.drawable.castle_on_the_hill_image,
            description = resources.getString(R.string.castle_on_the_hill_description)
        ),
        Music(
            name = resources.getString(R.string.go_your_on_way),
            time = resources.getString(R.string.go_your_on_way_time),
            image = R.drawable.go_your_own_way_image,
            description = resources.getString(R.string.go_your_on_way_description)
        ),
        Music(
            name = resources.getString(R.string.time_after_time),
            time = resources.getString(R.string.time_after_time_time),
            image = R.drawable.time_after_time_image,
            description = resources.getString(R.string.time_after_time_description)
        ),
    )
}