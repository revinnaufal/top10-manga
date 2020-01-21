package com.example.mangainfo

import android.content.Intent
import android.graphics.Color
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvManga : RecyclerView
    private var list: ArrayList<Manga> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvManga = findViewById(R.id.recyvlerview_manga)
        rvManga.setHasFixedSize(true)
        //rvManga.setBackgroundColor(Color.BLUE)
        //rvManga.setNestedScrollingEnabled(false)

        list.addAll(MangaData.listData)
        showRecyclerList()

        //Custom Action Bar Start Here
        supportActionBar?.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM)
        supportActionBar?.setDisplayShowCustomEnabled(true)
        supportActionBar?.setCustomView(R.layout.custom_actiobar)
        //Custom Action Bar End Here

        var view = supportActionBar?.customView


        val profilepicture: ImageView = view?.findViewById(R.id.Actiobar_Foto)!!
        profilepicture.setOnClickListener {
            val detailprofileintent : Intent = Intent(this@MainActivity, detailprofile::class.java)
            startActivity(detailprofileintent)
            overridePendingTransition(R.anim.slide_left,R.anim.slide_out_left)
        }

    }
    private fun showRecyclerList(){
        rvManga.layoutManager = LinearLayoutManager(this)
        val listMangaAdapter = ListMangaAdapter(list)
        rvManga.adapter = listMangaAdapter
    }
}
