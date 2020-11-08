package com.truongbx.demonavigationcomponent.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.truongbx.demonavigationcomponent.R
import com.truongbx.demonavigationcomponent.model.User
import com.truongbx.demonavigationcomponent.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    private lateinit var binding: FragmentWelcomeBinding
    private val args: WelcomeFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_welcome, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.user = createUser(args.username, args.password)
        binding.btnFinish.setOnClickListener() {
            findNavController().navigate(R.id.action_welcomeFragment_to_homeFragment)
        }
    }

    private fun createUser(username: String, password: Long) = User()
        .apply {
        this.name = username
        this.password = password
    }

}