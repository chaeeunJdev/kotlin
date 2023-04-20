package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
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
        // 키보드 숨기기
        var imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(v.windowToken,0)

        // 입력값 비교
        if (binding.etEmail?.text.toString() == "test1@test.com" && binding.etPassword?.text.toString() == "testtest11!"
            && binding.etName?.text.toString() == "test1" && binding.etAge?.text.toString() == "25") {
            Toast.makeText(this, "로그인 성공!", Toast.LENGTH_SHORT).show()

            // 현재 파일인 this(MainAcitivity)로부터 JavaActivity를 불러라
//            startActivity(Intent(this, JavaActivity::class.java))

            // 페이지 이동없이 바로 레이아웃 호출
            setContentView(R.layout.activity_java)

            // binding 대신 findViewBtId로 찾기
            val tvResult : TextView = findViewById(R.id.tv_result)
            tvResult.text = "고라니님 환영합니다."
        }
        else // 현재 파일인 this(MainAcitivity)로부터 JavaActivity를 불러라
//            startActivity(Intent(this, JavaActivity::class.java))

            // 페이지 이동없이 바로 레이아웃 호출
        {
            Toast.makeText(this, "로그인 실패 ㅠㅠ", Toast.LENGTH_SHORT).show()
        }
    }
}