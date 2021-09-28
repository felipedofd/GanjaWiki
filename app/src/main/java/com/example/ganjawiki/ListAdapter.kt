package com.example.ganjawiki

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.ganjawiki.data.Data
import ganjawiki.databinding.ItemOnSelectedListBinding

class ListAdapter(private val data: List<Data>, private val context: Context) : Adapter<ListAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemOnSelectedListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Data) {
            binding.strainName.text = data.name
            binding.description.text = data.genetics.names
            binding.ganjaSource.text = data.
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemOnSelectedListBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}