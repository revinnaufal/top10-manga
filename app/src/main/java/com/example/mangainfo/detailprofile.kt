package com.example.mangainfo

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AccelerateInterpolator
import android.view.animation.LinearInterpolator
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class detailprofile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailprofile)

        var imageview : ImageView = findViewById(R.id.image_photoProfile)
        var nama : TextView = findViewById(R.id.nama_lengkap)
        var email : TextView = findViewById(R.id.email)
        ObjectAnimator.ofFloat(imageview, View.ALPHA, 0f, 1f).setDuration(2000).start()
        ObjectAnimator.ofFloat(nama, View.ALPHA, 0f, 1f).setDuration(2000).start()
        ObjectAnimator.ofFloat(email, View.ALPHA, 0f, 1f).setDuration(2000).start()

        //imageview.animate().alpha(1f).setDuration(10000).setInterpolator(AccelerateInterpolator()).start()

        /*//Start Animation
        val valueanimation :ValueAnimator= ValueAnimator.ofFloat(0f)
        valueanimation.addUpdateListener {
            val value = it.animatedValue as Float
            imageview.translationX = value

        }
        valueanimation.interpolator = LinearInterpolator()
        valueanimation.duration = 5

        valueanimation.start()
        **/

        /**var imageview: ImageView = findViewById(R.id.image_photoProfile)
        Picasso.with(this)
            .load(R.drawable.pp)
            .into(imageview)
        **/
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_right,R.anim.slide_out_right)
    }
}
