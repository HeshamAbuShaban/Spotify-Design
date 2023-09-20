package dev.training.spotify_design.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.training.spotify_design.adapters.CategoryAdapter
import dev.training.spotify_design.adapters.MusicAdapter
import dev.training.spotify_design.data.dummy.ItemsDummySource
import dev.training.spotify_design.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        setupRecyclers()
    }

    private fun setupRecyclers() {
        setupMusicsRec()
        setupCategoriesRec()
    }

    private fun setupMusicsRec() {
        with(binding.recyclerViewMusics) {
            adapter = MusicAdapter().apply {
                musics = ItemsDummySource.musics
            }
        }
    }

    private fun setupCategoriesRec() {
        with(binding.recyclerViewCategories) {
            adapter = CategoryAdapter().apply {
                categories = ItemsDummySource.categories
            }
        }
    }
}