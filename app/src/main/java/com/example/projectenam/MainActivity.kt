package com.example.projectenam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = BuatMakanan()
        rv_part.layoutManager = LinearLayoutManager(this)
        rv_part.setHasFixedSize(true)
        supportActionBar?. title="Daftar Makanan Favorit di Surabaya"
        rv_part.adapter = ContactAdapter(testData, {phoneItem : PhoneData -> phoneItemClicked (phoneItem) })

    }
    private fun phoneItemClicked(phoneItem : PhoneData){
        val showDetailActivityIntent = Intent (this, PhoneDetailActivity::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_INTENT, phoneItem.nama_makanan)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, phoneItem.deskripsimakanan)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, phoneItem.gambarmakanan)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, phoneItem.alamatmakanan)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, phoneItem.hargamakanan )
        startActivity(showDetailActivityIntent)

    }
}