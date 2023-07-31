package com.example.myfinalproject.presentation.ui.homescreen.meditation

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myfinalproject.R
import com.example.myfinalproject.databinding.FragmentMeditationBinding

class MeditationFragment : Fragment() {

    private val binding by lazy {
        FragmentMeditationBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

}