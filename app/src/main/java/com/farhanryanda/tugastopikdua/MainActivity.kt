package com.farhanryanda.tugastopikdua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import com.farhanryanda.tugastopikdua.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var editUmur: EditText
    lateinit var editTinggi: EditText
    lateinit var editBerat: EditText
    lateinit var btnCalculate: Button
    lateinit var btnReset: Button

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        editUmur = findViewById(R.id.edt_umur)
        editTinggi = findViewById(R.id.edt_tinggi)
        editBerat = findViewById(R.id.edt_berat)
        btnCalculate = findViewById(R.id.btn_calculate)
        btnReset = findViewById(R.id.btn_reset)

        btnReset.setOnClickListener {
            resetData()
        }

        binding.btnIntent.setOnClickListener {
            editBerat.onEditorAction(EditorInfo.IME_ACTION_DONE)
            editUmur.onEditorAction(EditorInfo.IME_ACTION_DONE)
            editTinggi.onEditorAction(EditorInfo.IME_ACTION_DONE)
            var inputUmur = editUmur.text.toString()
            var inputTinggi = editTinggi.text.toString()
            var inputBerat = editBerat.text.toString()
            var isEmptyFields = false
            if (inputUmur.isEmpty()) {
                isEmptyFields = true
                editUmur.error = "Umur Tidak Boleh Kosong"
            }
            if (inputTinggi.isEmpty()) {
                isEmptyFields = true
                editTinggi.error = "Tinggi Tidak Boleh Kosong"
            }
            if (inputBerat.isEmpty()) {
                isEmptyFields = true
                editBerat.error = "Berat Tidak Boleh Kosong"
            }
            if (!isEmptyFields) {
                var bmi = inputBerat.toDouble() / ((inputTinggi.toDouble()/100) * (inputTinggi.toDouble()/100))
                var kategori = ""
                if (bmi < 16) {
                    kategori = "Terlalu Kurus"
                } else if (bmi in 16.0..17.0) {
                    kategori = "Cukup Kurus"
                } else if (bmi in 17.0..18.5) {
                    kategori = "Sedikit Kurus"
                } else if (bmi in 18.5..25.0) {
                    kategori = "Normal"
                } else if (bmi in 25.0..30.0) {
                    kategori = "Gemuk"
                } else if (bmi in 30.0..35.0) {
                    kategori = "Obesitas Kelas 1"
                } else if (bmi in 35.0..40.0) {
                    kategori = "Obesitas Kelas 2"
                } else if (bmi > 40) {
                    kategori = "Obesitas Kelas 3"
                }

                var intent = Intent(this,IntentActivity::class.java)
                intent.putExtra("umur",inputUmur)
                intent.putExtra("tinggi",inputTinggi)
                intent.putExtra("berat",inputBerat)
                intent.putExtra("bmi",bmi)
                intent.putExtra("kategori",kategori)
                startActivity(intent)
            }
        }

        binding.btnBundle.setOnClickListener {
            editBerat.onEditorAction(EditorInfo.IME_ACTION_DONE)
            editUmur.onEditorAction(EditorInfo.IME_ACTION_DONE)
            editTinggi.onEditorAction(EditorInfo.IME_ACTION_DONE)
            var inputUmur = editUmur.text.toString()
            var inputTinggi = editTinggi.text.toString()
            var inputBerat = editBerat.text.toString()
            var isEmptyFields = false
            if (inputUmur.isEmpty()) {
                isEmptyFields = true
                editUmur.error = "Umur Tidak Boleh Kosong"
            }
            if (inputTinggi.isEmpty()) {
                isEmptyFields = true
                editTinggi.error = "Tinggi Tidak Boleh Kosong"
            }
            if (inputBerat.isEmpty()) {
                isEmptyFields = true
                editBerat.error = "Berat Tidak Boleh Kosong"
            }
            if (!isEmptyFields) {
                var bmi = inputBerat.toDouble() / ((inputTinggi.toDouble()/100) * (inputTinggi.toDouble()/100))
                var kategori = ""
                if (bmi < 16) {
                    kategori = "Terlalu Kurus"
                } else if (bmi in 16.0..17.0) {
                    kategori = "Cukup Kurus"
                } else if (bmi in 17.0..18.5) {
                    kategori = "Sedikit Kurus"
                } else if (bmi in 18.5..25.0) {
                    kategori = "Normal"
                } else if (bmi in 25.0..30.0) {
                    kategori = "Gemuk"
                } else if (bmi in 30.0..35.0) {
                    kategori = "Obesitas Kelas 1"
                } else if (bmi in 35.0..40.0) {
                    kategori = "Obesitas Kelas 2"
                } else if (bmi > 40) {
                    kategori = "Obesitas Kelas 3"
                }

                var bundle = Bundle()
                var intent = Intent(this,BundleActivity::class.java)
                bundle.putString("umur",inputUmur)
                bundle.putString("tinggi",inputTinggi)
                bundle.putString("berat",inputBerat)
                bundle.putDouble("bmi",bmi)
                bundle.putString("kategori",kategori)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }

        binding.btnSerializable.setOnClickListener {
            editBerat.onEditorAction(EditorInfo.IME_ACTION_DONE)
            editUmur.onEditorAction(EditorInfo.IME_ACTION_DONE)
            editTinggi.onEditorAction(EditorInfo.IME_ACTION_DONE)
            var inputUmur = editUmur.text.toString()
            var inputTinggi = editTinggi.text.toString()
            var inputBerat = editBerat.text.toString()
            var isEmptyFields = false
            if (inputUmur.isEmpty()) {
                isEmptyFields = true
                editUmur.error = "Umur Tidak Boleh Kosong"
            }
            if (inputTinggi.isEmpty()) {
                isEmptyFields = true
                editTinggi.error = "Tinggi Tidak Boleh Kosong"
            }
            if (inputBerat.isEmpty()) {
                isEmptyFields = true
                editBerat.error = "Berat Tidak Boleh Kosong"
            }
            if (!isEmptyFields) {
                var bmi = inputBerat.toDouble() / ((inputTinggi.toDouble()/100) * (inputTinggi.toDouble()/100))
                var kategori = ""
                if (bmi < 16) {
                    kategori = "Terlalu Kurus"
                } else if (bmi in 16.0..17.0) {
                    kategori = "Cukup Kurus"
                } else if (bmi in 17.0..18.5) {
                    kategori = "Sedikit Kurus"
                } else if (bmi in 18.5..25.0) {
                    kategori = "Normal"
                } else if (bmi in 25.0..30.0) {
                    kategori = "Gemuk"
                } else if (bmi in 30.0..35.0) {
                    kategori = "Obesitas Kelas 1"
                } else if (bmi in 35.0..40.0) {
                    kategori = "Obesitas Kelas 2"
                } else if (bmi > 40) {
                    kategori = "Obesitas Kelas 3"
                }

                var intent = Intent(this,SeriazableActivity::class.java)
                var data = DataSerializable(inputUmur,inputTinggi,inputBerat,bmi,kategori)
                intent.putExtra("data",data)
                startActivity(intent)
            }
        }

        binding.btnParcelable.setOnClickListener {
            editBerat.onEditorAction(EditorInfo.IME_ACTION_DONE)
            editUmur.onEditorAction(EditorInfo.IME_ACTION_DONE)
            editTinggi.onEditorAction(EditorInfo.IME_ACTION_DONE)
            var inputUmur = editUmur.text.toString()
            var inputTinggi = editTinggi.text.toString()
            var inputBerat = editBerat.text.toString()
            var isEmptyFields = false
            if (inputUmur.isEmpty()) {
                isEmptyFields = true
                editUmur.error = "Umur Tidak Boleh Kosong"
            }
            if (inputTinggi.isEmpty()) {
                isEmptyFields = true
                editTinggi.error = "Tinggi Tidak Boleh Kosong"
            }
            if (inputBerat.isEmpty()) {
                isEmptyFields = true
                editBerat.error = "Berat Tidak Boleh Kosong"
            }
            if (!isEmptyFields) {
                var bmi = inputBerat.toDouble() / ((inputTinggi.toDouble()/100) * (inputTinggi.toDouble()/100))
                var kategori = ""
                if (bmi < 16) {
                    kategori = "Terlalu Kurus"
                } else if (bmi in 16.0..17.0) {
                    kategori = "Cukup Kurus"
                } else if (bmi in 17.0..18.5) {
                    kategori = "Sedikit Kurus"
                } else if (bmi in 18.5..25.0) {
                    kategori = "Normal"
                } else if (bmi in 25.0..30.0) {
                    kategori = "Gemuk"
                } else if (bmi in 30.0..35.0) {
                    kategori = "Obesitas Kelas 1"
                } else if (bmi in 35.0..40.0) {
                    kategori = "Obesitas Kelas 2"
                } else if (bmi > 40) {
                    kategori = "Obesitas Kelas 3"
                }

                var intent = Intent(this,ParcelableActivity::class.java)
                var dataParcel = DataParcelable(inputUmur,inputTinggi,inputBerat,bmi,kategori)
                intent.putExtra("dataparcel",dataParcel)
                startActivity(intent)
            }
        }
    }

    fun resetData() {
        editBerat.setText("")
        editUmur.setText("")
        editTinggi.setText("")
    }


}