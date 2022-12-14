package com.example.bottomnavigationbar.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bottomnavigationbar.MainActivity
import com.example.bottomnavigationbar.R

class AgentHomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        (activity as MainActivity).setNavBarVisibility()
        (activity as MainActivity).hideActionBar()
        return inflater.inflate(R.layout.fragment_agent_home, container, false)
    }


}