package com.example.milliyetapp.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.milliyetapp.R
import com.example.milliyetapp.adapter.NewsListAdapter
import com.example.milliyetapp.mock.MockData
import kotlinx.android.synthetic.main.fragment_news.*


class NewsFragment : Fragment(R.layout.fragment_news) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recycNewsList.adapter = NewsListAdapter(MockData.getNewsList(10)) { bigNewsModel ->

        }
    }


}
