package com.truongbx.demonavigationcomponent.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.truongbx.demonavigationcomponent.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnClick.setOnClickListener {
            val action =
                HomeFragmentDirections.actionHomeFragmentToLoveFragment()
            findNavController().navigate(action)
        }
    }

}