package com.example.projectenam

import android.provider.Telephony
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_phone_detail.view.*
import kotlinx.android.synthetic.main.contact_list_item.view.*

class ContactAdapter (val phoneItemList: List<PhoneData>, val clickListener: (PhoneData)->Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.contact_list_item,parent,false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(phoneItemList[position], clickListener)
    }

    override fun getItemCount()= phoneItemList.size

    class PartViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        fun bind(phone : PhoneData, clickListener: (PhoneData) -> Unit){
            itemView.tv_nama_makanan.text = phone.nama_makanan
            itemView.logolist.setImageResource(phone.gambarmakanan)
            itemView.logolist.contentDescription = phone.nama_makanan
            itemView.setOnClickListener{clickListener(phone)}
        }
    }
}