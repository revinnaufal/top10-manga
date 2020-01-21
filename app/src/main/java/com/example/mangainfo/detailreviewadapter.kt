package com.example.mangainfo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

@Suppress("UNREACHABLE_CODE")
class detailreviewadapter(private val listreviewdata: ArrayList<Review>, private val potition:Int) : RecyclerView.Adapter<CustomViewHolder>() {

    var dummy_posisi : Int = potition


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val isidarireview = layoutInflater.inflate(R.layout.item_review,parent,false)
        return CustomViewHolder(isidarireview)

    }

    override fun getItemCount(): Int {
        return 2;
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {


        val (namareview,isireview) = listreviewdata[dummy_posisi]

        println(namareview)

        holder.tvdetailreview.text = isireview
        holder.tvnamereviewer.text = namareview
        println("ASDASDASDASDASD $dummy_posisi")
        dummy_posisi++


    }
}


class CustomViewHolder(v: View):RecyclerView.ViewHolder(v) {

    var tvnamereviewer : TextView = v.findViewById(R.id.reviewername)
    var tvdetailreview : TextView = v.findViewById(R.id.reviewdetail)

}
