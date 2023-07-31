package com.example.myfinalproject.domain.repository

import com.example.myfinalproject.domain.models.CompleteAccount
import com.example.myfinalproject.domain.models.UserResponse
import com.example.myfinalproject.domain.models.UserSignUp

interface UserRepository {

    suspend fun createNewUser(userSignUp: UserSignUp): UserResponse

    suspend fun completeAccount(completeAccount: CompleteAccount):UserResponse
}