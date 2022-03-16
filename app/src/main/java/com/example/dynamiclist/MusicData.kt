package com.example.dynamiclist

class MusicData {

    fun loadSongs(): List<Music> = listOf (
        Music(
            name = R.string.bad_habits,
            time = R.string.bad_habits_time,
            image = R.drawable.bad_habits_image,
            description = R.string.bad_habits_description
        ),
       Music(
            name = R.string.shape_of_you,
            time = R.string.shape_of_you_time,
            image = R.drawable.shape_of_you_image,
            description = R.string.shape_of_you_description
        ),
        Music(
            name = R.string.galway_girl,
            time = R.string.galway_girl_time,
            image = R.drawable.galway_girl_image,
            description = R.string.galway_girl_description
        ),
        Music(
            name = R.string.faster_car,
            time = R.string.faster_car_time,
            image = R.drawable.faster_car_image,
            description = R.string.faster_car_description
        ),
        Music(
            name = R.string.let_it_be,
            time = R.string.let_it_be_time,
            image = R.drawable.let_it_be_image,
            description = R.string.let_it_be_description
        ),
        Music(
            name = R.string.here_comes_the_sun,
            time = R.string.here_comes_the_sun_time,
            image = R.drawable.here_comes_the_sum_image,
            description = R.string.here_comes_the_sun_description
        ),
        Music(
            name = R.string.castle_on_the_hill,
            time = R.string.castle_on_the_hill_time,
            image = R.drawable.castle_on_the_hill_image,
            description = R.string.castle_on_the_hill_description
        ),
        Music(
            name = R.string.go_your_on_way,
            time = R.string.go_your_on_way_time,
            image = R.drawable.go_your_own_way_image,
            description = R.string.go_your_on_way_description
        ),
        Music(
            name = R.string.time_after_time,
            time = R.string.time_after_time_time,
            image = R.drawable.time_after_time_image,
            description = R.string.time_after_time_description
        ),
    )
}