package com.example.fjr_20191114

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doOnTextChanged
import androidx.databinding.DataBindingUtil
import com.example.fjr_20191114.databinding.ActivityMainBinding


@SuppressLint("SetTextI18n")
class MainActivity : AppCompatActivity() {

//    private var bebasTextView: TextView? = null
//    private var bebasEditText: EditText? = null
//    private var bebastext: String? = ""

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)
        binding.dataText = ""

        binding.textBebas.doOnTextChanged { text, start, count, after ->
            binding.dataText = text.toString()
        }

        binding.btnBebas.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            // start your next activity
            startActivity(intent)
        }

//        bebastext = "${bebasEditText?.text}"
//        bebasTextView?.text = "${bebasTextView?.text}, On Create "
    }


    override fun onStart() {
        super.onStart()
//        bebasTextView?.text = "${bebasTextView?.text}, On Start "
        Toast.makeText(this, "Siklus hidup onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
//        bebasTextView?.text = "${bebasTextView?.text}, On Resume "
        Toast.makeText(this, "Siklus hidup onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
//        bebasTextView?.text = "${bebasTextView?.text}, On Pause "
        Toast.makeText(this, "Siklus hidup onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
//        bebasTextView?.text = "${bebasTextView?.text}, On Stop "
        Toast.makeText(this, "Siklus hidup onStop", Toast.LENGTH_SHORT).show()
    }
}
