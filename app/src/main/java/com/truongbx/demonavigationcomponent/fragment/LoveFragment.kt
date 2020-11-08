package com.truongbx.demonavigationcomponent.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.truongbx.demonavigationcomponent.R
import kotlinx.android.synthetic.main.fragment_love.*

class LoveFragment : Fragment(R.layout.fragment_love) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnOpenWelCome.setOnClickListener {
            val username = edtUsername.text.toString()
            val password = edtPassword.text.toString()

            val action =
                LoveFragmentDirections.actionLoveFragmentToWelcomeFragment(
                    username,
                    password.toLong()
                )
            findNavController().navigate(action)
        }
    }

}