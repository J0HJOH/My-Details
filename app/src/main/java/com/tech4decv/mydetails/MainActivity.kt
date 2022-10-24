package com.tech4decv.mydetails

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import com.hbb20.CountryCodePicker

class MainActivity : AppCompatActivity() {
    private lateinit var countryCodePicker: CountryCodePicker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countryCodePicker = findViewById(R.id.country)

       countryCodePicker.setOnClickListener {
           countryCodePicker.setOnCountryChangeListener {
               val selected = countryCodePicker.defaultCountryCodeWithPlus
               selected
           }
       }

    }
}