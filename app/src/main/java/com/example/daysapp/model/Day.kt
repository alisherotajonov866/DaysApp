package com.example.daysapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Day(
    val time: String,
    @StringRes val title: Int,
    @DrawableRes val imageRecourseId: Int,
    @StringRes val description: Int
)
