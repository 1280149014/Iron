package com.dahe.iron.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dahe.iron.R
import com.dahe.iron.adapter.BaseRecyclerAdapter

class  HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    lateinit var mRecyclerView : RecyclerView
    lateinit var mutableMapOf : MutableMap<String,Int>

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
//        val textView: TextView = root.findViewById(R.id.text_home)
//        homeViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })

        mRecyclerView =  root.findViewById(R.id.recycle_view);
        mRecyclerView.layoutManager = LinearLayoutManager(activity)


        mutableMapOf = mutableMapOf()
        mutableMapOf.put("a",1)
        mutableMapOf.put("b",2)
        mutableMapOf.put("c",3)
        mutableMapOf.put("d",4)
        mutableMapOf.put("2",1)
        mutableMapOf.put("2",2)
        mutableMapOf.put("2",3)
        mutableMapOf.put("a",4)

        var i = 0 ;
        while (i < 100){
            mutableMapOf.put("" + i , i)
            i++
        }


        var myAdapter = activity?.let { BaseRecyclerAdapter(it, mutableMapOf) }

        mRecyclerView.adapter = myAdapter

        return root
    }
}