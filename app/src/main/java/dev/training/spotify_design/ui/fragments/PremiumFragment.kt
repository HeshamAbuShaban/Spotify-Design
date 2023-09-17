package dev.training.spotify_design.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.training.spotify_design.databinding.FragmentPremiumBinding

class PremiumFragment : Fragment() {
    private lateinit var binding: FragmentPremiumBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentPremiumBinding.inflate(layoutInflater)
        return binding.root
    }

}