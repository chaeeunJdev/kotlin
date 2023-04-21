package com.example.festo.customer_ui.recent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.festo.R
import com.example.festo.customer_ui.home.HomeActivity
import com.example.festo.customer_ui.mypage.MypageActivity
import com.example.festo.customer_ui.orderlist.OrderlistActivity
import com.example.festo.customer_ui.search.SearchActivity

class RecentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recent)
    }
    fun onNavigationItemSelected(item: MenuItem): Boolean {

        when(item.itemId) {
            R.id.page_home -> {
//                supportFragmentManager.beginTransaction().replace(R.id.linearLayout , HomeFragment()).commitAllowingStateLoss()
                startActivity(Intent(this, HomeActivity::class.java))
                return true
            }
            R.id.page_search -> {
                startActivity(Intent(this, SearchActivity::class.java))
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