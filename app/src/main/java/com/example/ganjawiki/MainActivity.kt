package com.example.ganjawiki

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.ganjawiki.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var listViewModel : ListViewMoldel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        listViewModel = ViewModelProvider(this)[ListViewMoldel::class.java]

        listViewModel.ganja.observe(this){
            binding.listRecyclerView.adapter = ListAdapter(it.info,this)
        }


    }
}