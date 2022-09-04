package com.farhanryanda.tugastopikdua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.farhanryanda.tugastopikdua.databinding.ActivityBundleBinding

class BundleActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBundleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBundleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var bundle = intent.extras
        binding.tvResultUmur.text = "Umur Anda\t: ${bundle!!.getString("umur")} tahun"
        binding.tvResultTinggi.text = "Tinggi\t: ${bundle!!.getString("tinggi")} cm"
        binding.tvResultBerat.text = "Berat Badan\t: ${bundle!!.getString("berat")} kg"
        binding.tvResultBmi.text = "BMI anda\t: %.2f".format(bundle!!.getDouble("bmi"))
        binding.tvResultKategori.text = "Kategori\t: ${bundle!!.getString("kategori")}"

    }
}