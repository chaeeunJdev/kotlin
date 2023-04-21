package com.example.festo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.festo.customer_ui.home.HomeActivity
import com.example.festo.customer_ui.mypage.MypageActivity
import com.example.festo.customer_ui.orderlist.OrderlistActivity
import com.example.festo.customer_ui.recent.RecentActivity
import com.example.festo.customer_ui.search.SearchActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}