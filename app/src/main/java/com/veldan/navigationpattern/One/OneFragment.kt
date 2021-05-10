package com.veldan.navigationpattern.One

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.veldan.navigationpattern.databinding.FragmentOneBinding

class OneFragment : Fragment() {

    private lateinit var binding: FragmentOneBinding
    private val viewModel: OneViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return initBinding()
    }

    private fun initBinding(): View {
        FragmentOneBinding.inflate(layoutInflater).apply {
            binding = this
            return root
        }
    }

    override fun onResume() {
        super.onResume()

        binding.root.setOnClickListener {
            viewModel.navigateTo()
        }

    }

}