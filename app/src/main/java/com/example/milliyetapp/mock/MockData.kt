package com.example.milliyetapp.mock

import com.example.milliyetapp.model.FragmentModel
import com.example.milliyetapp.ui.NewsFragment

object MockData {
    fun getNewsCategoryFragment(fragmentSize: Int): List<FragmentModel> {
        val fragmentList = ArrayList<FragmentModel>()

        repeat(fragmentSize) { position ->
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
}