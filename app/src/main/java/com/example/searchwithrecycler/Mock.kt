package com.example.searchwithrecycler

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Model3(val title: String, val des: String, val image: Int) : Parcelable

class Mock{
    fun getLista(): ArrayList<Model3>{

        val arrayList = ArrayList<Model3>()

        arrayList.add(Model3("Cnn", "Canal de Noticia CNN", R.drawable.sbt))
        arrayList.add(Model3("Globo", "Canal de Noticia Globo", R.drawable.sbt))
        arrayList.add(Model3("SBT", "Canal de Noticia SBT", R.drawable.sbt))
        arrayList.add(Model3("Record", "Canal de Noticia Record", R.drawable.sbt))
        arrayList.add(Model3("Cnn", "Canal de Noticia CNN", R.drawable.sbt))
        arrayList.add(Model3("Globo", "Canal de Noticia Globo", R.drawable.sbt))
        arrayList.add(Model3("SBT", "Canal de Noticia SBT", R.drawable.sbt))
        arrayList.add(Model3("Record", "Canal de Noticia Record", R.drawable.sbt))
        arrayList.add(Model3("Cnn", "Canal de Noticia CNN", R.drawable.sbt))
        arrayList.add(Model3("Globo", "Canal de Noticia Globo", R.drawable.sbt))
        arrayList.add(Model3("SBT", "Canal de Noticia SBT", R.drawable.sbt))

        return arrayList
    }
}