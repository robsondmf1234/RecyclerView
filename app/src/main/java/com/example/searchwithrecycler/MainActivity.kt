package com.example.searchwithrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val arrayList = ArrayList<Model>()
    val displayList = ArrayList<Model>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        arrayList.add(Model("Cnn", "Canal de Noticia CNN", R.drawable.sbt))
        arrayList.add(Model("Globo", "Canal de Noticia Globo", R.drawable.sbt))
        arrayList.add(Model("SBT", "Canal de Noticia SBT", R.drawable.sbt))
        arrayList.add(Model("Record", "Canal de Noticia Record", R.drawable.sbt))
        arrayList.add(Model("Band", "Canal de Noticia Band", R.drawable.sbt))
        arrayList.add(Model("Cnn", "Canal de Noticia CNN", R.drawable.sbt))
        arrayList.add(Model("Globo", "Canal de Noticia Globo", R.drawable.sbt))
        arrayList.add(Model("SBT", "Canal de Noticia SBT", R.drawable.sbt))
        arrayList.add(Model("Record", "Canal de Noticia Record", R.drawable.sbt))
        arrayList.add(Model("Band", "Canal de Noticia Band", R.drawable.sbt))
        arrayList.add(Model("Cnn", "Canal de Noticia CNN", R.drawable.sbt))
        arrayList.add(Model("Globo", "Canal de Noticia Globo", R.drawable.sbt))
        arrayList.add(Model("SBT", "Canal de Noticia SBT", R.drawable.sbt))
        arrayList.add(Model("Record", "Canal de Noticia Record", R.drawable.sbt))
        arrayList.add(Model("Band", "Canal de Noticia Band", R.drawable.sbt))

        displayList.addAll(arrayList)

        val myAdapter = MyAdapter(displayList, this)

        recyclerView_main.layoutManager = LinearLayoutManager(this)
        recyclerView_main.adapter = myAdapter

    }
}