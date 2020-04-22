package com.example.milliyetapp.util

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

infix fun <T> AppCompatActivity.extStartActivity(ClassName: Class<T>) {
    startActivity(Intent(this, ClassName))
}