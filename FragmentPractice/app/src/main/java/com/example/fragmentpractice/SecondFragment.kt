package com.example.fragmentpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.fragmentpractice.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

private val args : SecondFragmentArgs by navArgs()
private lateinit var binding : FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater,container,false)
        initViews()
        return binding.root
    }

    private fun initViews() {
        val name = args.name
        binding.name.text = name
    }


}