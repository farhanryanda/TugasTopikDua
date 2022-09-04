package com.farhanryanda.tugastopikdua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.farhanryanda.tugastopikdua.databinding.ActivityIntentBinding

class IntentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIntentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var umur = intent.getStringExtra("umur")
        var tinggi = intent.getStringExtra("tinggi")
        var berat = intent.getStringExtra("berat")
        var bmi = intent.getDoubleExtra("bmi",0.0)
        var kategori = intent.getStringExtra("kategori")

        binding.tvResultUmur.text = "Umur Anda\t: $umur tahun"
        binding.tvResultTinggi.text = "Tinggi\t: $tinggi cm"
        binding.tvResultBerat.text = "Berat Badan\t: $berat kg"
        binding.tvResultBmi.text = "BMI anda\t: %.2f".format(bmi)
        binding.tvResultKategori.text = "Kategori\t: $kategori"
    }
}