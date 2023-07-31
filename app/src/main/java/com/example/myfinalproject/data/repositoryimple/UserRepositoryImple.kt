package com.example.myfinalproject.data.repositoryimple

import com.example.myfinalproject.data.networks.UserApi
import com.example.myfinalproject.domain.models.CompleteAccount
import com.example.myfinalproject.domain.models.UserResponse
import com.example.myfinalproject.domain.models.UserSignUp
import com.example.myfinalproject.domain.repository.UserRepository

class UserRepositoryImple(private val api: UserApi) : UserRepository {

    override suspend fun createNewUser(userSignUp: UserSignUp) =
        api.createNewUser(user = userSignUp)

    override suspend fun completeAccount(completeAccount: CompleteAccount): UserResponse =
        api.completeAccount(completeAccount = completeAccount)
}