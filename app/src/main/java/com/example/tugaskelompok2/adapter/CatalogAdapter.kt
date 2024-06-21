package com.example.tugaskelompok2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.tugaskelompok2.R
import com.example.tugaskelompok2.databinding.ItemCatalogBinding
import com.example.tugaskelompok2.model.CatalogItem

class CatalogAdapter : RecyclerView.Adapter<CatalogAdapter.CatalogViewHolder>() {

    private val items = mutableListOf(
        CatalogItem(R.drawable.sampleimage1,"Headphone", "This is pink earphone"),
        CatalogItem(R.drawable.sampleimage2,"Lemon", "this is lemon cut in half"),
        CatalogItem(R.drawable.sampleimage3,"Rubick", "This is rubick"),
    )

    inner class CatalogViewHolder(private val binding: ItemCatalogBinding ) : ViewHolder(binding.root) {

        fun onBind(item: CatalogItem){
            with(binding){
                image2.setImageResource(item.img)
                tvTitle.text = item.title
                tvDesc.text = item.desc
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatalogViewHolder {
        return CatalogViewHolder(ItemCatalogBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: CatalogViewHolder, position: Int) {
        holder.onBind(items[position])
    }
}