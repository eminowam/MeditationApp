package com.example.myfinalproject.domain.profileusecase

import com.example.myfinalproject.domain.models.CompleteAccount
import com.example.myfinalproject.domain.repository.UserRepository

class CompleteAccountUseCase(private val repository: UserRepository) {
    suspend operator fun invoke(comleteAccount:CompleteAccount)=
        repository.completeAccount(completeAccount = comleteAccount)
}