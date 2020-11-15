package com.example.projectenam

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_phone_detail.*
import kotlinx.android.synthetic.main.contact_list_item.*

class PhoneDetailActivity : AppCompatActivity() {
    override fun onCreate (savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_detail)

        var intentThatStartedThisActivity = intent

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)){
            showContent(intentThatStartedThisActivity)
        }
    }
        private fun showContent(intentThatStartedThisActivity: Intent){
            val namamakanan = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_INTENT)
            val deskripsimakanan = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            val gambarmakanan = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            val alamatmakanan = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            val hargamakanan = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)

            tv_name_detail.text= namamakanan
            pengertian.text= deskripsimakanan
            alamat_makanan.text= alamatmakanan
            harga.text= hargamakanan
            logoupn.contentDescription= namamakanan
            logoupn.setImageResource(gambarmakanan)
        }
}