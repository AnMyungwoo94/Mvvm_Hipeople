package com.myungwoo.datingappkotlinproject.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.myungwoo.datingappkotlinproject.ActivityForRegister.MainActivity
import com.myungwoo.datingappkotlinproject.databinding.ActivitySplashActivtyBinding
import com.myungwoo.datingappkotlinproject.viewmodel.SplashViewModel

class SplashActivty : AppCompatActivity() {
    lateinit var binding: ActivitySplashActivtyBinding
    private lateinit var viewModel: SplashViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashActivtyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Actionbar 제거
        supportActionBar?.hide()

        viewModel = ViewModelProvider(this).get(SplashViewModel::class.java)

        viewModel.navigateToMainEvent.observe(this, Observer {
            Intent(this, MainActivity::class.java).apply {
                startActivity(this)
                finish()
            }
        })

        viewModel.initiateSplashDelay()
    }
}
