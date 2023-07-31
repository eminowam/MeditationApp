package com.example.myfinalproject.data.networks

import com.example.myfinalproject.data.networks.Endpoints.POST_USER_SIGN_IN
import com.example.myfinalproject.domain.models.CompleteAccount
import com.example.myfinalproject.domain.models.UserResponse
import com.example.myfinalproject.domain.models.UserSignUp
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface UserApi {


    @POST("users")
    suspend fun createUS(

    )

    @POST(POST_USER_SIGN_IN)
    suspend fun createNewUser(
        @Body user: UserSignUp,
    ): UserResponse

    @POST(POST_USER_SIGN_IN)
    suspend fun completeAccount(
        @Body completeAccount: CompleteAccount
    ): UserResponse

}