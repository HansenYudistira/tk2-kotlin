package com.example.tugaskelompok2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tugaskelompok2.adapter.CatalogAdapter
import com.example.tugaskelompok2.databinding.ActivityCatalogBinding

class CatalogActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCatalogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCatalogBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            rvCatalog.adapter = CatalogAdapter()
        }
    }
}