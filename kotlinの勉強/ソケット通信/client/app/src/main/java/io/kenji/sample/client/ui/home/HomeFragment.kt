package io.kenji.sample.client.ui.home

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import io.kenji.sample.client.R
import io.kenji.sample.client.databinding.FragmentBinding


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override  fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        initView()
        return binding.root
    }

    private fun initView() {
        binding.connectButton.setOnClickListener {
            val imm = activity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view?.windowToken, 0)
            val ip = binding.ip.text.toString()
            val port = binding.port.text.toString().toInt()
            findNavController().navigate(
                HomeFragmentDirections.actionHomeFragmentToResultFragment(
                    ip = ip,
                    port = port
                )
            )
        }
    }

    companion object {
        const val TAG = "HomeFragment"
    }
}