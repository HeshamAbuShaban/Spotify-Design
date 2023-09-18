package dev.training.spotify_design.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import dev.training.spotify_design.data.models.Music
import dev.training.spotify_design.databinding.ItemMusicBinding

class MusicAdapter : RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {
    inner class MusicViewHolder(private val binding: ItemMusicBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindData(music: Music) {
            with(binding) {
                root.background
            }
        }
    }

    private val musicDiffer: AsyncListDiffer<Music> = AsyncListDiffer(this, DifferMusicImpl())

    private class DifferMusicImpl : DiffUtil.ItemCallback<Music>() {
        override fun areItemsTheSame(oldItem: Music, newItem: Music): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }

        override fun areContentsTheSame(oldItem: Music, newItem: Music): Boolean {
            return oldItem.subtitle == newItem.subtitle
        }

    }

    private var musics: MutableList<Music>
        get() = musicDiffer.currentList
        set(value) {
            musicDiffer.submitList(value)
        }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): MusicAdapter.MusicViewHolder = MusicViewHolder(
        ItemMusicBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun getItemCount(): Int = musics.size

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        val music = musics[position]
        holder.bindData(music)
    }

}