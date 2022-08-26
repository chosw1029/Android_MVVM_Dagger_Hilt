package com.nextus.shared.domain.search

import com.nextus.model.ImageSearchData
import com.nextus.shared.data.search.ImageSearchRepository
import com.nextus.shared.di.IoDispatcher
import com.nextus.shared.domain.FlowUseCase
import com.nextus.shared.result.NetworkResult
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

open class ImageSearchUseCase @Inject constructor(
    private val imageSearchRepository: ImageSearchRepository,
    @IoDispatcher dispatcher: CoroutineDispatcher
) : FlowUseCase<Unit, ImageSearchData>(dispatcher) {

    override fun execute(parameters: Unit): Flow<NetworkResult<ImageSearchData>> {
        return imageSearchRepository.searchImage(1, "IU").map { result ->
            when(result) {
                is NetworkResult.Success -> NetworkResult.Success(result.data)
                else -> result
            }
        }
    }

}