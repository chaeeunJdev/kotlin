package com.example.listview.home


import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.listview.R


class HomeActivity : AppCompatActivity() {
    var BoothList = arrayListOf<BoothList>(
        BoothList(R.drawable.logo1,"이름1","카테고리1","엄청맛있어욥"),
        BoothList(R.drawable.logo2,"이름2","카테고리2","우와아아아아"),
        BoothList(R.drawable.logo3,"이름3","카테고리3","잠온다"),
    )
    //배열을 만들어 사용자의 정보를 담아준다.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var Adapter = ListAdapter(this, BoothList)
        val list_view = findViewById<ListView>(R.id.list_view)
        list_view.adapter = Adapter
        //만들어둔 ListAdapter를 이용해 카드뷰 - 사용자 정보 - 리스트뷰를 연결시켜준다.
    }

}