package com.example.testmapkit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yandex.mapkit.MapKitFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MapKitFactory.setApiKey("b2f6dc37-186a-4496-949f-e5c4b14a59ba")
        setContentView(R.layout.fragment_of_map)
    }
}