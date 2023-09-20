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

                ivMusicCover.setImageResource(music.img)
                tvMusicTitle.text = music.title

                if (music.subtitle.length > 25) {
                    val partOne = music.subtitle.substring(0, 25)
                    val partTwo = music.subtitle.substring(25, music.subtitle.length)
                    // set them
                    tvSubtitleP1.text = partOne
                    tvSubtitleP2.text = partTwo
                } else {
                    //.. normal set to first tv
                    tvSubtitleP1.text = music.subtitle
                }

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

    var musics: List<Music>
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