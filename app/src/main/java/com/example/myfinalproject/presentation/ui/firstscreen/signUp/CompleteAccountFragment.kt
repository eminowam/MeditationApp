package com.example.myfinalproject.presentation.ui.firstscreen.signUp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myfinalproject.databinding.FragmentCompleteAccountBinding
import com.example.myfinalproject.domain.models.CompleteAccount
import org.koin.androidx.viewmodel.ext.android.viewModel

class CompleteAccountFragment : Fragment() {

    private val binding by lazy {
        FragmentCompleteAccountBinding.inflate(layoutInflater)
    }

    private val viewModel: CompleteAccountViewModel by viewModel()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        registerClick()
    }

    private fun goToWelcomeAccount() {
        findNavController().navigate(
            CompleteAccountFragmentDirections.actionCompleteAccauntFragmentToWelcomeFragment()
        )
    }

    private fun registerClick() {
        binding.registerToWelcome.setOnClickListener {
            startCreateNewUser()
        }
    }

    private fun startCreateNewUser() = with(binding) {
        val newUser = CompleteAccount(
            chooseGender = chooseGender.toString(),
            dateOfBirth = dateOfBirth.toString(),
            yourWeight = yourWeight.toString(),
            yourHeight = yourHeght.toString(),
        )
        viewModel.completeAccount(completeAccount = newUser)
        goToWelcomeAccount()
    }
}