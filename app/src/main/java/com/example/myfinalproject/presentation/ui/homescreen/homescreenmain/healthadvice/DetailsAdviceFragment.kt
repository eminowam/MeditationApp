package com.example.myfinalproject.presentation.ui.homescreen.homescreenmain.healthadvice

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myfinalproject.R

class DetailsAdviceFragment : Fragment() {

    companion object {
        fun newInstance() = DetailsAdviceFragment()
    }

    private lateinit var viewModel: DetailsAdviceViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_details_advice, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DetailsAdviceViewModel::class.java)
        // TODO: Use the ViewModel
    }

}