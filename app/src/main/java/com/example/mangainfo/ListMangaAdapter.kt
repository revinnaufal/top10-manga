package com.example.mangainfo

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.core.app.ActivityOptionsCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlin.coroutines.coroutineContext

class ListMangaAdapter(private val listManga: ArrayList<Manga>) : RecyclerView.Adapter<ListMangaAdapter.ListViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).
            inflate(R.layout.item_mangas, parent,false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listManga.size
        //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        //Manga manga = listManga.get(position)
        val (manganame,mangasinopsis,photo,namaauthor,photoauthor,nilairating) = listManga[position]
        holder.parentlayout.setAnimation(AnimationUtils.loadAnimation(holder.parentlayout.context,R.anim.slide_right))

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(300,300))
            .into(holder.imgPhoto)

        holder.tvName.text = manganame
        holder.tvDetail.text = mangasinopsis

        holder.mangatitle = manganame
        holder.mangadetail = mangasinopsis
        holder.mangagambar = photo
        holder.namaauthor = namaauthor
        holder.photoatuhor = photoauthor
        holder.rating = nilairating
        holder.posisi = position




       //holder.parentlayout.setOnClickListener {
        //    Toast.makeText(Context,"aasdasd",Toast.LENGTH_SHORT)
        //}

    }


    inner class ListViewHolder(itemView: View, var mangatitle: String = "",
                               var mangadetail : String = "",
                               var mangagambar: String = "",
                               var namaauthor : String = "",
                               var photoatuhor : String = "",
                               var rating : String = "",
                               var posisi : Int = 0
                               ) : RecyclerView.ViewHolder(itemView){

        var tvName : TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail : TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto : ImageView = itemView.findViewById(R.id.img_item_photo)
        var parentlayout : RelativeLayout = itemView.findViewById(R.id.parent_layout)

        init {
            itemView.setOnClickListener {
                val moveintent = Intent(itemView.context,detail_list::class.java)
                moveintent.putExtra(detail_list.EXTRA_MANGA_JUDUL,mangatitle)
                moveintent.putExtra(detail_list.EXTRA_MANGA_SINOPSIS,mangadetail)
                moveintent.putExtra(detail_list.EXTRA_MANGA_GAMBAR,mangagambar)
                moveintent.putExtra(detail_list.EXTRA_MANGA_NAMAAUTHOR,namaauthor)
                moveintent.putExtra(detail_list.EXTRA_MANGA_PHOTOAUTHOR,photoatuhor)
                moveintent.putExtra(detail_list.EXtra_MANGA_RATING,rating)
                moveintent.putExtra(detail_list.EXTRA_MANGA_POSISI,posisi.toString())

                itemView.context.startActivity(moveintent)

                println("ASDASD")
                //Toast.makeText(itemView.context,posisi.toString(),Toast.LENGTH_SHORT).show()
                Toast.makeText(itemView.context,mangatitle,Toast.LENGTH_SHORT).show()


            }
        }




    }
}