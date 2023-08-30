package com.example.fragmentpractice

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fragmentpractice.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding : FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater,container,false)
        initViews()
        return binding.root
    }

    private fun initViews() {
        val action = FirstFragmentDirections.goToFrag2("name")
        binding.fragm2.setOnClickListener{
            findNavController().navigate(action)
        }
    }


}