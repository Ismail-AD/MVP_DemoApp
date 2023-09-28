package com.acdev.mvp_demoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.acdev.mvp_demoapp.databinding.ActivityMainBinding

// Responsible for drawing the UI on the screen and passing all the user interactions to Presenter Layer.
class MainActivity : AppCompatActivity(), Contract.View {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val presenter = Presenter(this)
        binding.Button.setOnClickListener {
            presenter.onClickCheckEligible(
                binding.nameEditText.text.toString().trim(),
                binding.ageEditText.text.toString().trim()
            )
        }
    }

    override fun showToastForEligible() {
        Toast.makeText(this, R.string.success, Toast.LENGTH_SHORT).show()
        startActivity(Intent(this, HomeActivity::class.java))
        finish()
    }

    override fun showToastForNotEligible() {
        Toast.makeText(this, R.string.invalid_credentials_error, Toast.LENGTH_SHORT).show()
    }
}