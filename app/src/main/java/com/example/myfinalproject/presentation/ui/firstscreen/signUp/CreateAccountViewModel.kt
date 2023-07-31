package com.example.myfinalproject.presentation.ui.firstscreen.signUp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myfinalproject.domain.models.CompleteAccount
import com.example.myfinalproject.domain.models.UserSignUp
import com.example.myfinalproject.domain.profileusecase.CreateNewUserUseCase
import kotlinx.coroutines.launch

class CreateAccountViewModel(private val createNewUserUseCase: CreateNewUserUseCase) : ViewModel() {

    fun createNewUser(userSignUp: UserSignUp) = viewModelScope.launch {
        createNewUserUseCase(userSignUp = userSignUp)
    }
}
