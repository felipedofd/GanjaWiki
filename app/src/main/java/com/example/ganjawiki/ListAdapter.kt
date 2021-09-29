package com.example.ganjawiki

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.ganjawiki.data.Data
import com.squareup.picasso.Picasso
import ganjawiki.databinding.ItemOnSelectedListBinding

class ListAdapter(private val data: List<Data>, private val context: Context) : Adapter<ListAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemOnSelectedListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Data) {
            binding.strainName.text = data.name
            binding.description.text = data.genetics.names
            Picasso.get().load(data.image).into(binding.budImage)

            
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemOnSelectedListBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)

        val _url = data[position].url
        holder.binding.root.setOnClickListener { v ->
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(data[position].url)
            v.context.startActivity(i)
        }



    }



    override fun getItemCount(): Int {
        return data.size
    }
}