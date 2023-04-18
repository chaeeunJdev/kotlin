package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // binding 부분
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.etAge?.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                Login(v)
                true
            } else false
        }

//        binding.btn.setOnClickListener{
//            Toast.makeText(this, "토스트", Toast.LENGTH_LONG).show()
//        }
    }

    fun Login(v: View) {
        if (binding.etEmail?.text.toString() == "test1@test.com" && binding.etPassword?.text.toString() == "testtest11!"
            && binding.etName?.text.toString() == "test1" && binding.etAge?.text.toString() == "25")
            Toast.makeText(this, "로그인 성공!", Toast.LENGTH_SHORT).show()
        else Toast.makeText(this, "로그인 실패 ㅠㅠ", Toast.LENGTH_SHORT).show()
    }
}