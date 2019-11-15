package com.example.fjr_20191114

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.inflate
import com.example.fjr_20191114.databinding.FragmentFirstBinding
import kotlinx.android.synthetic.main.fragment_second.view.*

/**
 * A simple [Fragment] subclass.
 */
class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = inflate(inflater, R.layout.fragment_first, container, false)
//        binding.dataText = ""
//
//        binding.textBebas.doOnTextChanged { text, start, count, after ->
//            binding.dataText = text.toString()
//        }
//
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.btnBebas.setOnClickListener {
            this@FirstFragment.context?.let {
                val intent = Intent(context, MainActivity2::class.java)
                startActivity(intent)

            }
            // start your next activity
        }
    }

}
