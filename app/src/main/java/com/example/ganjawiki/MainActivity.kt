package com.example.ganjawiki

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ganjawiki.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel as viewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val listViewModel : ListViewMoldel by viewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listViewModel.getStrain()

        // ação da api "mostrar as strains na recyclerview" //

        listViewModel.ganja.observe(this){
            binding.listRecyclerView.adapter = ListAdapter(it.data,this)
        }


    }
}