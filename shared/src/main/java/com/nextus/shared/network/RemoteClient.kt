package com.nextus.shared.network

import com.nextus.shared.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object RemoteClient {

    private const val baseUrl = "https://dapi.kakao.com/v2/search/"

    // TODO: kakao Application 의 REST API Key 입력
    private const val kakaoToken = BuildConfig.API_KEY

    fun createRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(
                provideOkHttpClient(
                    provideLoggingInterceptor()
                )
            )
            .addCallAdapterFactory(RxJava2CallAdapterFactory.createAsync())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    // 네트워크 통신에 사용할 클라이언트 객체를 생성합니다.
    private fun provideOkHttpClient(interceptor: HttpLoggingInterceptor): OkHttpClient {
        val b = OkHttpClient.Builder()
        // 이 클라이언트를 통해 오고 가는 네트워크 요청/응답을 로그로 표시하도록 합니다.
        b.addInterceptor(interceptor)

        // header 에 정보를 추가해 준다.
        b.addInterceptor { chain ->
            val request = chain.request().newBuilder()
                    .addHeader("Authorization", kakaoToken)
                    .build()

            chain.proceed(request)
        }
        return b.build()
    }

    // 네트워크 요청/응답을 로그에 표시하는 Interceptor 객체를 생성합니다.
    private fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        val logging = HttpLoggingInterceptor()
        logging.level = if (BuildConfig.DEBUG)
            HttpLoggingInterceptor.Level.BODY
        else
            HttpLoggingInterceptor.Level.NONE
        return logging
    }

}