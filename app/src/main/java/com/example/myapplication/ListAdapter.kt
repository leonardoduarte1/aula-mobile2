package com.example.myapplication

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_view.view.*

class ListAdapter(private val itens: List<String>,
                  private val context: Context) : Adapter<ListAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itens[position]
        holder?.title?.text = item
    }


    override fun getItemCount(): Int {
        return itens.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val title = itemView.item_title

        fun bindView(item: String) {
            val title = itemView.item_title

            title.text = item
        }

    }
}

