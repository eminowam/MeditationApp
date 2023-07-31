package com.example.myfinalproject.presentation.ui.firstscreen.signUp

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myfinalproject.R
import com.example.myfinalproject.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    private val binding by lazy {
        FragmentWelcomeBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        welcomeHomeClick()
    }

    private fun goToHomeScreen() {
        findNavController().navigate(
            WelcomeFragmentDirections.actionWelcomeFragmentToHomeScreenFragment()
        )
    }

    private fun welcomeHomeClick() {
        binding.goToHomeImg.setOnClickListener {
            goToHomeScreen()
        }
    }
}