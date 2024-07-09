package com.example.daysapp.data

import com.example.daysapp.R
import com.example.daysapp.model.Day

class Datasource {
    fun loadDays(): List<Day> {
        return listOf(
            Day("Day 1", R.string.title1, R.drawable.image1, R.string.description1),
            Day("Day 2", R.string.title1, R.drawable.image2, R.string.description1),
            Day("Day 3", R.string.title1, R.drawable.image3, R.string.description1),
            Day("Day 4", R.string.title1, R.drawable.image4, R.string.description1),
            Day("Day 5", R.string.title1, R.drawable.image5, R.string.description1),
            Day("Day 6", R.string.title1, R.drawable.image6, R.string.description1),
            Day("Day 7", R.string.title1, R.drawable.image7, R.string.description1)
        )
    }
}