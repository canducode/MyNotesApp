package com.ngoopy.mynotesapp

import android.view.View

class CustomOnItemClickListener(private val position: Int, private val onItemClickCallBack: OnItemClickCallback) : View.OnClickListener {
    interface OnItemClickCallback {
        fun onItemClicked(view: View, position: Int)
    }

    override fun onClick(v: View) {
        onItemClickCallBack.onItemClicked(v, position)
    }
}