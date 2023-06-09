package com.example.museumapp.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.museumapp.R
import com.example.museumapp.adapter.CityAdapter
import com.example.museumapp.api.ApiUtils
import com.example.museumapp.databinding.FragmentCityBinding
import com.example.museumapp.model.CityResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class CityFragment : Fragment() {
    private var _binding: FragmentCityBinding? = null
    private val binding get() = _binding!!
    private val cityAdapter=CityAdapter()
    private val api=ApiUtils.getMuseumApi()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCityBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecycler()
       getCityData()
    }

    private fun getCityData(){
        api.getAllCity().enqueue(object : Callback<CityResponse> {
            override fun onResponse(call: Call<CityResponse>, response: Response<CityResponse>) {
                if (response.isSuccessful) {
                    if (response.body()?.status == "success") {
                        response.body()?.let {
                            cityAdapter.updateList(it.data)
                        }
                    }
                }
            }

            override fun onFailure(call: Call<CityResponse>, t: Throwable) {
               Log.e("Xeta",t.message.toString())
            }

        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }

    private fun setRecycler(){
        with(binding.rvCity){
            layoutManager=LinearLayoutManager(context)
            adapter=cityAdapter
        }
    }
}