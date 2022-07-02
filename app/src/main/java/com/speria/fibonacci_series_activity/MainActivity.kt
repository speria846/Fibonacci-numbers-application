package com.speria.fibonacci_series_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import com.speria.fibonacci_series_activity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var numberList=Addition(100)
        print(numberList)
        binding.rvNames.layoutManager=LinearLayoutManager(this)
        binding.rvNames.adapter=NumberRecyclerViewAdapter(numberList)

    }

    fun Addition(size: Int): List<Int> {
        var list = ArrayList<Int>()
        var n1 = 1
        var n2 = 0
        var a = 0
        while (a <= size) {
            print(n1)
            var sum =n1+n2
            n1=n2
            n2=sum
            a++
            list+=sum
        }
        return list

    }
}
