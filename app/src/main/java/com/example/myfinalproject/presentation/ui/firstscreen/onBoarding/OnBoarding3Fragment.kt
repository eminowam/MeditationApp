package com.example.myfinalproject.presentation.ui.firstscreen.onBoarding

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myfinalproject.R
import com.example.myfinalproject.databinding.FragmentOnBoarding3Binding

class OnBoarding3Fragment : Fragment() {

    private val binding by lazy {
        FragmentOnBoarding3Binding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        registerClick()
    }

    private fun goToCreateAccaunt() {
        findNavController().navigate(OnBoarding3FragmentDirections.actionOnBoarding3FragmentToCreateAccauntFragment())
    }

    private fun registerClick(){
        binding.toBtn.setOnClickListener{
            goToCreateAccaunt()
        }
    }
}