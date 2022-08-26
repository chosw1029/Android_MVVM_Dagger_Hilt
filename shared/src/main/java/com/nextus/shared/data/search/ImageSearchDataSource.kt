package com.nextus.shared.data.search

import com.nextus.model.ImageSearchData
import com.nextus.shared.network.api.ImageSearchApi
import com.nextus.shared.result.NetworkResult
import com.nextus.shared.util.safeApiCall
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

interface ImageSearchDataSource {
    fun searchImage(page: Int, query: String): Flow<NetworkResult<ImageSearchData>>
}

class KakaoImageSearchDataSource @Inject constructor(private val imageSearchApi: ImageSearchApi) :
    ImageSearchDataSource {
    override fun searchImage(page: Int, query: String): Flow<NetworkResult<ImageSearchData>> {
        return safeApiCall { imageSearchApi.searchImage(page, query).execute() }
    }
}