package com.example.milliyetapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.milliyetapp.R
import com.example.milliyetapp.adapter.CategoryNewsAdapter
import com.example.milliyetapp.mock.MockData
import kotlinx.android.synthetic.main.activity_dashboard.*


class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        init()
    }

    private fun init() {
        vpNewsCategory.adapter =
            CategoryNewsAdapter(
                supportFragmentManager,
                MockData.getNewsCategoryFragment()
            )

        tabLayoutNewsCategory.setupWithViewPager(vpNewsCategory)
    }
}
