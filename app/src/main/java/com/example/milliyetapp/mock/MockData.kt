package com.example.milliyetapp.mock

import com.example.milliyetapp.model.BigNewsModel
import com.example.milliyetapp.model.FragmentModel
import com.example.milliyetapp.ui.NewsFragment

object MockData {
    private const val newsCategorySize = 7
    fun getNewsCategoryFragment(): List<FragmentModel> {
        val fragmentList = ArrayList<FragmentModel>()

        repeat(newsCategorySize) { position ->
            val newsFragment = NewsFragment()

            val fragmentModel = FragmentModel(
                position,
                getFragmentTitle(position),
                newsFragment
            )

            fragmentList.add(fragmentModel)
        }
        return fragmentList
    }

    private fun getFragmentTitle(position: Int): String {
        return when (position) {
            0 -> "Anasayfa"
            1 -> "Yazarlar"
            2 -> "Gündem"
            3 -> "Ekonomi"
            4 -> "Spor"
            5 -> "Cadde"
            6 -> "Eğitim"
            else -> "2"
        }
    }

    fun getNewsList(newListSize: Int): List<BigNewsModel> {
        val bigNewsList = ArrayList<BigNewsModel>()
        repeat(newListSize) {
            val bigNewsModel = BigNewsModel(
                "https://i4.hurimg.com/i/hurriyet/75/900x350/5eacf215d3806c22c88d4b6e.jpg",
                "Ertelendi! Kolay Alınmış Bir Karar Değil"
            )
            bigNewsList.add(bigNewsModel)
        }
        return bigNewsList
    }
}