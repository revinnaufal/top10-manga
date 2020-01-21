package com.example.mangainfo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.widget.NestedScrollView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_main.view.*
import org.w3c.dom.Text

class detail_list : AppCompatActivity() {
    private lateinit var rvReviewer : RecyclerView
    private var listreview : ArrayList<Review> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_list)
        val posision = intent.getStringExtra(EXTRA_MANGA_POSISI)
        var int_posision = posision.toInt()
        if (int_posision == 0){
            int_posision = int_posision
        }else{
            int_posision = int_posision*2
        }



        //RecyclerView buat Reviewer
        rvReviewer = findViewById(R.id.recycler_viewReviewer)
        rvReviewer.setHasFixedSize(true)
        rvReviewer.setFocusable(false)
        rvReviewer.setNestedScrollingEnabled(false)
        //rvReviewer.setBackgroundColor(Color.GRAY)

        listreview.addAll(ReviewData.listData)
        val listreviewadapter = detailreviewadapter(listreview,int_posision)
        rvReviewer.layoutManager = LinearLayoutManager(this)
        rvReviewer.adapter = listreviewadapter

        val manganame_tv : TextView = findViewById(R.id.detail_judulmanga)
        val sinopsis_tv : TextView = findViewById(R.id.sinopsis_detail)
        val manga_imageview : ImageView = findViewById(R.id.imageView_detail)
        val namaauthor_tv : TextView = findViewById(R.id.Author_name)
        val photoauthor_iv : ImageView = findViewById(R.id.author_imageview)
        val rating_tv : TextView = findViewById(R.id.reviewscore)
        val allofthem_relative : RelativeLayout = findViewById(R.id.relativeallofthem)
        val textview_sinopsis : TextView = findViewById(R.id.texview_sinopsis)

        val manganame = intent.getStringExtra(EXTRA_MANGA_JUDUL)
        val sinopsis = intent.getStringExtra(EXTRA_MANGA_SINOPSIS)
        val gambarlink = intent.getStringExtra(EXTRA_MANGA_GAMBAR)
        val namaauthor = intent.getStringExtra(EXTRA_MANGA_NAMAAUTHOR)
        val photoatuhor = intent.getStringExtra(EXTRA_MANGA_PHOTOAUTHOR)
        val rating = intent.getStringExtra(EXtra_MANGA_RATING)

        //println("asdasdasdasdasdasdas $int_posision")
        var allofthem : NestedScrollView = findViewById(R.id.allofthem)
        var popuptry = AnimationUtils.loadAnimation(this,R.anim.popuptry)
        manga_imageview.setAlpha(0f)


        manganame_tv.text = manganame
        sinopsis_tv.text = sinopsis
        namaauthor_tv.text = namaauthor
        rating_tv.text = rating
        Glide.with(applicationContext)
            .load(gambarlink)
            .into(manga_imageview)
        Glide.with(applicationContext)
            .load(photoatuhor)
            .into(photoauthor_iv)

        manga_imageview.setAlpha(1f)
        manga_imageview.startAnimation(popuptry)
        //ANIMASI TRY
        manganame_tv.setTranslationX(-1000f)
        sinopsis_tv.setTranslationX(-1000f)
        allofthem_relative.setTranslationX(-1000f)
        rvReviewer.setTranslationX(-1000f)
        textview_sinopsis.setTranslationX(-1000f)
        manganame_tv.animate().translationX(0f).setDuration(1000)
        textview_sinopsis.animate().translationX(0f).setDuration(1500)
        sinopsis_tv.animate().translationX(0f).setDuration(1800)
        allofthem_relative.animate().translationX(0f).setDuration(2000)
        rvReviewer.animate().translationX(0f).setDuration(2400)




    }
    companion object {
        const val EXTRA_MANGA_JUDUL = "extra_manga"
        const val EXTRA_MANGA_SINOPSIS = "extra_sinopsis"
        const val EXTRA_MANGA_GAMBAR = "extra_gambar"
        const val EXTRA_MANGA_NAMAAUTHOR = "extra_author"
        const val EXTRA_MANGA_PHOTOAUTHOR = "extra_photoauthor"
        const val EXtra_MANGA_RATING = "extra_rating"
        const val EXTRA_MANGA_POSISI = "extra_posisi"
    }
}
