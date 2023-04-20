package com.janders.thecatsapi

import android.app.Application
import android.content.Context

class TheCatsApp : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        private lateinit var instance: TheCatsApp

        fun getInstance(): TheCatsApp {
            return instance
        }

        fun getAppContext(): Context {
            return instance.applicationContext
        }
    }
}