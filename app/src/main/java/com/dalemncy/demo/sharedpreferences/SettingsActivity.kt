package com.dalemncy.demo.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dalemncy.demo.sharedpreferences.databinding.ActivitySettingsBinding
import com.dalemncy.demo.sharedpreferences.datastore.SharedPref

class SettingsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPref = SharedPref(this)

        binding.title.setText(sharedPref.title)

        binding.save.setOnClickListener {
            val title = binding.title.text
            sharedPref.title = "$title"

            finish()
        }
    }
}