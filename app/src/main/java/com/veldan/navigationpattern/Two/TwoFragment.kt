package com.veldan.navigationpattern.Two

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.veldan.navigationpattern.databinding.FragmentTwoBinding

class TwoFragment : Fragment() {

    private lateinit var binding: FragmentTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return initBinding()
    }

    private fun initBinding(): View {
        FragmentTwoBinding.inflate(layoutInflater).apply {
            binding = this
            return root
        }
    }

}