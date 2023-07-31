package com.example.myfinalproject.presentation.ui.firstscreen.signUp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myfinalproject.domain.models.CompleteAccount
import com.example.myfinalproject.domain.profileusecase.CompleteAccountUseCase
import kotlinx.coroutines.launch

class CompleteAccountViewModel(private val completeAccountUseCase: CompleteAccountUseCase) :
    ViewModel() {
    fun completeAccount(completeAccount: CompleteAccount) = viewModelScope.launch {
        completeAccountUseCase(comleteAccount = completeAccount)
    }
}