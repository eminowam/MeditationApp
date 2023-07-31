package com.example.myfinalproject.presentation.ui.firstscreen.onBoarding

import android.content.Intent
import android.os.Bundle
import android.text.Layout.Directions
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myfinalproject.R
import com.example.myfinalproject.databinding.FragmentOnBoardingBinding

class OnBoardingFragment : Fragment() {

    private val binding by lazy {
        FragmentOnBoardingBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        registerClick()
    }

    private fun goToOnBoarding1() {
        findNavController().navigate(
            OnBoardingFragmentDirections.actionOnBoardingGetStartedFragmentToOnBoarding1Fragment())
    }

    private fun registerClick() {
        binding.imageRegister.setOnClickListener {
            goToOnBoarding1()
        }
    }
}