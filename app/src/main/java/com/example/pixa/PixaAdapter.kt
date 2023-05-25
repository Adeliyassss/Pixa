package com.example.pixa

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import coil.load
import com.example.pixa.databinding.ItemImageBinding

class PixaAdapter (var list: ArrayList<ImageModel>) : Adapter<PixaAdapter.PixaViewHolder>(){

    class PixaViewHolder(var binding: ItemImageBinding) : RecyclerView.ViewHolder(binding.root){
        fun onBind(imageModel: ImageModel) {
            binding.imagePickView.load(imageModel.largeImageUrl)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PixaViewHolder {
        return PixaViewHolder(ItemImageBinding.inflate(
            LayoutInflater.from(
            parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: PixaViewHolder, position: Int) {
        holder.onBind(list[position])
    }
}