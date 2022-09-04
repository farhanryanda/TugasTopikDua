package com.farhanryanda.tugastopikdua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.farhanryanda.tugastopikdua.databinding.ActivityParcelableBinding

class ParcelableActivity : AppCompatActivity() {

    private lateinit var binding: ActivityParcelableBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParcelableBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var data = intent.getParcelableExtra("dataparcel") as DataParcelable?
        binding.tvResultUmur.text = "Umur Anda\t: ${data?.umur} tahun"
        binding.tvResultTinggi.text = "Tinggi\t: ${data?.tinggi} cm"
        binding.tvResultBerat.text = "Berat Badan\t: ${data?.berat} kg"
        binding.tvResultBmi.text = "BMI anda\t: %.2f".format(data?.bmi)
        binding.tvResultKategori.text = "Kategori\t: ${data?.kategori}"
    }
}