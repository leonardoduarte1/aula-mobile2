package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main2.*


class Main2Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val recyclerView = list_recyclerview
        recyclerView.adapter = ListAdapter(itens(), this)
        val layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
    }

    private fun itens(): List<String> {
        val arrayList = ArrayList<String>()//Creating an empty arraylist
        arrayList.add("Item 1")//Adding object in arraylist
        arrayList.add("Item 2")
        arrayList.add("Item 3")
        arrayList.add("Item 4")
        arrayList.add("Item 5")
        return arrayList
    }
}