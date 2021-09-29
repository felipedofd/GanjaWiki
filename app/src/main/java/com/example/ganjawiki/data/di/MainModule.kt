package com.example.ganjawiki.data.di

import com.example.ganjawiki.ListViewMoldel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {
    viewModel {
        ListViewMoldel()
    }
}



