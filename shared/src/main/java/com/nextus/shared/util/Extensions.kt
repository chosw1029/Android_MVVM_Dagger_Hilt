package com.nextus.shared.util

import com.nextus.shared.result.NetworkResult
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response

fun <T: Any> safeApiCall(call: () -> Response<T>): Flow<NetworkResult<T>> {
    return flow {
        emit(NetworkResult.Loading)
        val response = call()
        when {
            response.isSuccessful -> {
                response.body()?.let { emit(NetworkResult.Success(it)) }
            }
            else -> emit(NetworkResult.Error(Exception("NetworkError")))
        }
    }
}