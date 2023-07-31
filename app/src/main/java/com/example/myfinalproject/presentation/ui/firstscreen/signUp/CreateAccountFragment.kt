package com.example.myfinalproject.presentation.ui.firstscreen.signUp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myfinalproject.databinding.FragmentCreateAccountBinding
import com.example.myfinalproject.domain.models.UserSignUp
import org.koin.androidx.viewmodel.ext.android.viewModel

class CreateAccountFragment : Fragment() {

    private val binding by lazy {
        FragmentCreateAccountBinding.inflate(layoutInflater)
    }

    private val viewModel: CreateAccountViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        registerClick()
    }

    private fun goToCompleteAccount() {
        findNavController().navigate(
            CreateAccountFragmentDirections.actionCreateAccauntFragmentToCompleteAccauntFragment()
        )
    }

    private fun registerClick() {
        binding.registerToComplete.setOnClickListener {
            startCreateNewUser()
        }
    }

    private fun startCreateNewUser() = with(binding) {
        val newUser = UserSignUp(
            userName = fullNameEtSignUp.toString(),
            phoneNumber = phoneNumberEtSignUp.toString(),
            email = emailEtSignUp.toString(),
            password = passwordEtSignUp.toString(),
        )
        viewModel.createNewUser(userSignUp = newUser)
        goToCompleteAccount()
    }
}