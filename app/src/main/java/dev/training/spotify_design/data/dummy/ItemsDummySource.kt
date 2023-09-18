package dev.training.spotify_design.data.dummy

import dev.training.spotify_design.data.models.Category
import dev.training.spotify_design.data.models.Music

object ItemsDummySource {

    val musics: List<Music>
        get() {
            return mutableListOf(
                Music(
                    1,
                    "get from drawable dumb-ass",
                    "set a proper id referring to drawable dir"
                ),
                Music(
                    2,
                    "get from drawable dumb-ass",
                    "set a proper id referring to drawable dir"
                ),
                Music(
                    3,
                    "get from drawable dumb-ass",
                    "set a proper id referring to drawable dir"
                ),
            )
        }

    val categories: List<Category>
        get() {
            return mutableListOf(
                Category(
                    1,
                    1,
                    ""
                ),
                Category(
                    2,
                    2,
                    ""
                ),
                Category(
                    3,
                    3,
                    ""
                ),
            )
        }
}