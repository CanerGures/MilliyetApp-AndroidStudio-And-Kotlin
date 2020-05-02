package com.example.milliyetapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.milliyetapp.R
import com.example.milliyetapp.model.BigNewsModel
import kotlinx.android.synthetic.main.adapter_item_bignews.view.*

class BigNewsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(
        R.layout.adapter_item_bignews,
        parent,
        false
    )
) {
    fun bind(
        bigNewsModel: BigNewsModel,
        onItemClickListener: (BigNewsModel) -> Unit
    ) {
        Glide.with(itemView.context)
            .load(bigNewsModel.newsImageUrl)
            .centerCrop()
            .into(itemView.imgNews)
        itemView.txtNews.text = bigNewsModel.newsTitle

        itemView.setOnClickListener {
            onItemClickListener(bigNewsModel)
        }
    }
}