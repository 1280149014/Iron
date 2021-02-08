package com.dahe.iron.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dahe.iron.App
import com.dahe.iron.R
import com.dahe.iron.adapter.BaseRecyclerAdapter

class  HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var mRecyclerView : RecyclerView
    private lateinit var mutableMapOf : MutableMap<String,Int>

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homeViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
        })

        mRecyclerView =  view.findViewById(R.id.recycle_view);
        mRecyclerView.layoutManager = LinearLayoutManager(activity)

        mutableMapOf = mutableMapOf()
        mutableMapOf.put(getString(R.string.normal_str_cal),1)
        mutableMapOf.put(getString(R.string.pillar_str),2)
        mutableMapOf.put(getString(R.string.scissor_wall_str),3)
        mutableMapOf.put(getString(R.string.beam_str_str),4)
        mutableMapOf.put(getString(R.string.stairs_wall_str),5)
        mutableMapOf.put(getString(R.string.floor_str_str),5)
        mutableMapOf.put(getString(R.string.founder_str_str),6)
        mutableMapOf.put(getString(R.string.pdefence_str_str),7)

        var myAdapter = activity?.let { BaseRecyclerAdapter(it, mutableMapOf) }

        myAdapter!!.setOnKotlinItemClickListener(object : BaseRecyclerAdapter.IKotlinItemClickListener{
            override fun onItemClickListener(position: Int) {
                Toast.makeText(App.appContext,"" + position,Toast.LENGTH_SHORT).show()
            }
        });

        mRecyclerView.adapter = myAdapter

    }




}