package com.example.festo.customer_ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import com.example.festo.R
import com.example.festo.customer_ui.mypage.MypageActivity
import com.example.festo.customer_ui.orderlist.OrderlistActivity
import com.example.festo.customer_ui.recent.RecentActivity
import com.example.festo.customer_ui.search.SearchActivity
import com.example.festo.databinding.ActivityHomeBinding
import com.example.festo.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.page_home -> {
//                supportFragmentManager.beginTransaction().replace(R.id.linearLayout , HomeFragment()).commitAllowingStateLoss()
                startActivity(Intent(this, HomeAct  ivity::class.java))
                return true
            }
            binding.page_search -> {
//              startActivity(Intent(this, SearchActivity::class.java))
                setContentView(R.layout.activity_search)
                return true

            }
            R.id.page_recent -> {
                startActivity(Intent(this, RecentActivity::class.java))
                return true
            }
            R.id.page_orderlist -> {
                startActivity(Intent(this, OrderlistActivity::class.java))
                return true
            }
            R.id.page_mypage -> {
                startActivity(Intent(this, MypageActivity::class.java))
                return true
            }
        }

        return false
    }

}