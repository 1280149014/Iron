package com.dahe.iron.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dahe.iron.R
import com.dahe.iron.adapter.BaseRecyclerAdapter.MyViewHolder


/**
 * author : charile yuan
 * date   : 20-12-15
 * desc   :
 */
public class BaseRecyclerAdapter(mainActivity: Activity,
                                 mutableMap:MutableMap<String,Int>
    ) : RecyclerView.Adapter<MyViewHolder>() {

    var datas = mutableMap
    var activity = mainActivity
    var alist = ArrayList<String>()
    var blist = ArrayList<Int>()

    init {
        for (data in datas.keys){
            alist.add(data)
            blist.add(datas[data]!!)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var inflater = LayoutInflater.from(activity).inflate(R.layout.item_layout,null,false)
        return MyViewHolder(inflater)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tv_item_text.setText(alist[position])
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var tv_item_text : TextView = itemView.findViewById(R.id.text)
        var layout : View = itemView.findViewById(R.id.text)
    }


}