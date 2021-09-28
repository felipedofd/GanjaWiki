package com.example.ganjawiki

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.ganjawiki.databinding.ItemOnSelectedListBinding

class ListAdapter(private val items: List<ListItems>, private val context: Context) : Adapter<ListAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemOnSelectedListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(list: ListItems) {
            binding.strainName.text = "Colombian Gold"
            binding.budImage.
            binding.description.text = "The most powerfull cannabis of the world"
            binding.ganjaSource.text = "GOD"
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