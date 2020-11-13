package com.example.lovecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startKoin {
            modules(listOf(
                networkModule,
                presenterModule
            ))
            androidContext(this@MainActivity)
        }
    }
}
