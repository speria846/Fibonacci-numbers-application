package com.speria.fibonacci_series_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import com.speria.fibonacci_series_activity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayNames()

    }
    fun displayNames(){
        val nameList= listOf(1,2,3,5,8,11,19,30,49,79,128)
        binding.rvNames.layoutManager= LinearLayoutManager(this)
        val namesAdapter=NumberRecyclerViewAdapter(nameList)
        binding.rvNames.adapter=namesAdapter
    }
}