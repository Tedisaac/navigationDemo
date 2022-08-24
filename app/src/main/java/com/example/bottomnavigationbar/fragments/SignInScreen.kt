package com.example.bottomnavigationbar.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigationbar.MainActivity
import com.example.bottomnavigationbar.R


class SignInScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sign_in_screen, container, false)
        (activity as MainActivity).switchMenu(0)
        (activity as MainActivity).hideActionBar()
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val client = 0
        val signInText = view.findViewById<TextView>(R.id.sign_in_text)
        signInText.setOnClickListener {
            if (client == 0){
                findNavController().navigate(R.id.action_signInScreen_to_homeFragment)

            }
            else  findNavController().navigate(R.id.action_signInScreen_to_agentHomeFragment)
        }
    }


}