package com.nextus.shared.data.search

import com.nextus.model.ImageSearchData
import com.nextus.shared.result.NetworkResult
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

interface ImageSearchRepository {
    fun searchImage(page: Int, query: String): Flow<NetworkResult<ImageSearchData>>
}

class DefaultImageSearchRepository @Inject constructor(
    private val kakaoImageSearchDataSource: KakaoImageSearchDataSource
): ImageSearchRepository {
    override fun searchImage(page: Int, query: String): Flow<NetworkResult<ImageSearchData>> {
        return kakaoImageSearchDataSource.searchImage(page, query)
    }
}