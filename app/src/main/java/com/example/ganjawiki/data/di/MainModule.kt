package com.example.ganjawiki.data.di

import com.example.ganjawiki.ListViewMoldel
import com.example.ganjawiki.data.GanjaApi
import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

val mainModule = module {
    viewModel {
        ListViewMoldel(get())
    }
}

val apiModule = module {
    fun provideUseApi(retrofit: Retrofit): GanjaApi {
        return retrofit.create(GanjaApi::class.java)
    }

    single { provideUseApi(get()) }
}

val retrofitModule = module {
    fun provideGson(): Gson {
        return GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).create()
    }

    fun provideHttpClient(): OkHttpClient {
        val okHttpClientBuilder = OkHttpClient.Builder()
        return okHttpClientBuilder.build()
    }

    fun provideRetrofit(factory: Gson, client: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.otreeba.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }

    single { provideGson() }
    single { provideHttpClient() }
    single { provideRetrofit(get(), get()) }
}