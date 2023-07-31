package com.example.myfinalproject.di

import com.example.myfinalproject.presentation.ui.firstscreen.signUp.CompleteAccountViewModel
import com.example.myfinalproject.presentation.ui.firstscreen.signUp.CreateAccountViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel {
        CreateAccountViewModel(createNewUserUseCase = get())
    }

    viewModel {
        CompleteAccountViewModel(completeAccountUseCase = get())
    }
}