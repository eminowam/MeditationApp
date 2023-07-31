package com.example.myfinalproject.di

import com.example.myfinalproject.domain.profileusecase.CompleteAccountUseCase
import com.example.myfinalproject.domain.profileusecase.CreateNewUserUseCase
import org.koin.dsl.module

val domainModule = module {
    factory {
        CreateNewUserUseCase(repository = get())
    }

    factory {
        CompleteAccountUseCase(repository = get())
    }
}