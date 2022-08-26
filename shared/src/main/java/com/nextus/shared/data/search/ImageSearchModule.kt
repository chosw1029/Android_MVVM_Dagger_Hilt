package com.nextus.shared.data.search

import com.nextus.shared.network.RemoteClient
import com.nextus.shared.network.api.ImageSearchApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class ImageSearchModule {

    @Provides
    fun provideImageSearchApi(): ImageSearchApi {
        return RemoteClient.createRetrofit().create(ImageSearchApi::class.java)
    }

    @Provides
    fun provideImageSearchDataSource(imageSearchApi: ImageSearchApi): ImageSearchDataSource {
        return KakaoImageSearchDataSource(imageSearchApi)
    }

    @Provides
    fun provideImageSearchRepository(kakaoImageSearchDataSource: KakaoImageSearchDataSource): ImageSearchRepository {
        return DefaultImageSearchRepository(kakaoImageSearchDataSource)
    }

}