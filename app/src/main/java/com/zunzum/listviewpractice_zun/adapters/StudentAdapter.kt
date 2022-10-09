package com.zunzum.listviewpractice_zun.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.zunzum.listviewpractice_zun.da.Student

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {
}