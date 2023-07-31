package com.example.myfinalproject.domain.profileusecase

import com.example.myfinalproject.domain.models.UserSignUp
import com.example.myfinalproject.domain.repository.UserRepository

class CreateNewUserUseCase(private val repository: UserRepository) {
    suspend operator fun invoke(userSignUp: UserSignUp) =
        repository.createNewUser(userSignUp = userSignUp)
}