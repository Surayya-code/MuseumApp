package com.example.museumapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.museumapp.R
import com.example.museumapp.adapter.MuseumAdapter
import com.example.museumapp.api.ApiUtils
import com.example.museumapp.databinding.FragmentMuseumBinding


class MuseumFragment : Fragment() {
    private var _binding: FragmentMuseumBinding? = null
    private val binding get() = _binding!!
    private val args: MuseumFragmentArgs by navArgs()
    private val museumAdapter = MuseumAdapter()
    private val api = ApiUtils.getMuseumApi()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMuseumBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textView.text=args.cityName
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}