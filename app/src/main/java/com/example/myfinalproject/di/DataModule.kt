package com.example.myfinalproject.di

import com.example.myfinalproject.data.repositoryimple.UserRepositoryImple
import com.example.myfinalproject.domain.repository.UserRepository
import org.koin.dsl.module

val dataModule = module {
    single<UserRepository> {
        UserRepositoryImple(api = get())
    }
}