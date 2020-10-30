package com.example.dtm

import android.content.Context
import android.widget.Toast

fun Context.toast(toast:String){
    Toast.makeText(this,toast,Toast.LENGTH_SHORT).show()
}