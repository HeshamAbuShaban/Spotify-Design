package dev.training.spotify_design.dump

import android.view.View
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import dev.training.spotify_design.data.models.Category
import dev.training.spotify_design.data.models.Music

abstract class BaseAppAdapter :
    RecyclerView.Adapter<BaseAppAdapter.BaseAppViewHolder>() {

    abstract val layoutRoot: View
    inner class BaseAppViewHolder : RecyclerView.ViewHolder(layoutRoot)

    abstract val musicDiffer: AsyncListDiffer<Music>
    abstract val categoryDiffer: AsyncListDiffer<Category>

    protected class DifferMusicImpl : DiffUtil.ItemCallback<Music>() {
        override fun areItemsTheSame(oldItem: Music, newItem: Music): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }

        override fun areContentsTheSame(oldItem: Music, newItem: Music): Boolean {
            return oldItem.subtitle == newItem.subtitle
        }

    }

    protected class DifferCategoryImpl : DiffUtil.ItemCallback<Music>() {
        override fun areItemsTheSame(oldItem: Music, newItem: Music): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }

        override fun areContentsTheSame(oldItem: Music, newItem: Music): Boolean {
            return oldItem.subtitle == newItem.subtitle
        }

    }


    var musics: MutableList<Music>
        get() = musicDiffer.currentList
        set(value) {
            musicDiffer.submitList(value)
        }
    var category: MutableList<Category>
        get() = categoryDiffer.currentList
        set(value) {
            categoryDiffer.submitList(value)
        }

}