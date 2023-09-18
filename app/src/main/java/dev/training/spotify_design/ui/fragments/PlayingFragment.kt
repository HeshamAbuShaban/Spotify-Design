package dev.training.spotify_design.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.training.spotify_design.databinding.FragmentPlayingBinding

class PlayingFragment : Fragment() {
    private lateinit var binding: FragmentPlayingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentPlayingBinding.inflate(layoutInflater)
        return binding.root
    }


}