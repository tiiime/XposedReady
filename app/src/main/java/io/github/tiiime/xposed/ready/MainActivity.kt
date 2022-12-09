package io.github.tiiime.xposed.ready

import android.app.Activity
import android.os.Bundle
import io.github.tiiime.xposed.ready.R

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}