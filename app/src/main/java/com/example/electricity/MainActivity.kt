package com.example.electricity

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.commit
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.electricity.overview.OverviewFragment

class MainActivity : AppCompatActivity() {

    @SuppressLint("DetachAndAttachSameFragment")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // var fragment : Fragment = null
//
//        val fragmentTransaction : FragmentTransaction = supportFragmentManager.beginTransaction()
//
//        fragmentTransaction.detach()
//        fragmentTransaction.attach()
//        fragmentTransaction.commit()

//        val fragment: OverviewFragment = supportFragmentManager.findFragmentByTag("OverviewFragment") as OverviewFragment
//
//        val fragmentTransaction : FragmentTransaction = supportFragmentManager.beginTransaction()
//        fragmentTransaction.detach(fragment)
//        fragmentTransaction.attach(fragment)
//        fragmentTransaction.commit()

//        val fragment = supportFragmentManager.findFragmentById(R.id.navHost) as Fragment
//
//
//        supportFragmentManager.commit {
//            detach(fragment)
//            attach(fragment)
//        }

    }
}