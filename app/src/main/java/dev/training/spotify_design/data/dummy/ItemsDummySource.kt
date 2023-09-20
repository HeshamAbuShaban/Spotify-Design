package dev.training.spotify_design.data.dummy

import dev.training.spotify_design.R
import dev.training.spotify_design.data.models.Category
import dev.training.spotify_design.data.models.Music

object ItemsDummySource {

    val musics: List<Music>
        get() {
            return mutableListOf(
                Music(
                    R.drawable.cover_ksi_,
                    "Sideman",
                    "Ksi, simon, tyler the creator, mr.Beast"
                ),
                Music(
                    R.drawable.cover_ksi_all_over_place,
                    "PewDiePia",
                    "MarkPlayer, Irish-Guy, JackStickily, but can you do this"
                ),
                Music(
                    R.drawable.cover_ksi_pc_gaming,
                    "Dream",
                    "hello my name is clay other known as dream"
                ),
                Music(
                    R.drawable.cover_savage21_a_lot,
                    "Don Pol-lo",
                    "i love ohio i love da chicken"
                ),
                Music(
                    R.drawable.cover_savage21_old,
                    "Quandl-dingle",
                    "its been a year daddy mommy says we miss you"
                ),
            )
        }

    val categories: List<Category>
        get() {
            return mutableListOf(
                Category(
                    R.drawable.cover_ksi_, R.color.smooth_green, "Started the fire", "show-me-why"
                ),
                Category(
                    R.drawable.cover_savage21_old, R.color.smooth_yellow, "Savage21", "A-lot"
                ),
                Category(
                    R.drawable.cover_ksi_all_over_place,
                    R.color.smooth_blue,
                    "KSI",
                    "all over the place"
                ),
            )
        }
}