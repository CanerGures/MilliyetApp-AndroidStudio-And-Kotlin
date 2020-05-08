package com.example.milliyetapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.milliyetapp.R
import com.example.milliyetapp.model.NewsModel
import kotlinx.android.synthetic.main.adapter_item_bignews.view.*

class SmallNewsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(
        R.layout.adapter_item_smallnews,
        parent,
        false
    )
) {
    fun bind(
        newsModel: NewsModel,
        onItemClickListener: (NewsModel) -> Unit
    ) {
        Glide.with(itemView.context)
            .load(newsModel.newsImageUrl)
            .centerCrop()
            .into(itemView.imgNews)
        itemView.txtNews.text = newsModel.newsTitle

        itemView.setOnClickListener {
            onItemClickListener(newsModel)
        }
    }
}