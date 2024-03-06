package com.firstapp.androidsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.firstapp.androidsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun convertCurrency(view: View) {
//        val dollarText: EditText = findViewById(R.id.dollarText)
//        val textView: TextView = findViewById(R.id.textView)
        if (binding.dollarText.text.isNotEmpty()){
            val dollarvalue = binding.dollarText.text.toString().toFloat()
            val euroValue = dollarvalue * 0.85F
            binding.textView.text = euroValue.toString()
        } else {
            binding.textView.text = getString(R.string.no_value_string)
        }
    }

}