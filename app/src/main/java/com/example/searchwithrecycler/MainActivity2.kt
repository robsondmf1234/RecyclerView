package com.example.searchwithrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity2 : AppCompatActivity() {
    var arrayList = ArrayList<Model3>()
    val displayList = ArrayList<Model3>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        arrayList = Mock().getLista()
        displayList.addAll(Mock().getLista())

        val myAdapter = MyAdapter2(displayList, this)

        recyclerView_main.layoutManager = LinearLayoutManager(this)
        recyclerView_main.adapter = myAdapter

    }
}