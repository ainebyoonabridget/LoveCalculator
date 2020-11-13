package com.example.lovecalculator

import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val networkModule = module {
    single { ApiService.create(androidContext()) }
}
//val presenterModule = module {
//    factory { (view: MainContract.View) ->
//        MainPresenter(
//            view
//        )
//    }
//}