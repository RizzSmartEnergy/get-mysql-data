package com.example.electricity.overview

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProvider
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
import com.example.electricity.R
import com.example.electricity.databinding.FragmentOverviewBinding

class OverviewFragment : Fragment(){

    private val viewModel: OverviewViewModel by lazy {
        ViewModelProvider(this).get(OverviewViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentOverviewBinding.inflate(inflater)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        content()
        return binding.root
    }

    private fun content(){
        viewModel.getElectricityValue()
        refresh(1000)
    }

    private fun refresh(msec:Long){
        Handler().postDelayed(Runnable {
            content()
        }, msec)
    }

}