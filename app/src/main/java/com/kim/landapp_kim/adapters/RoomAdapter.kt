package com.kim.landapp_kim.adapters

import android.content.Context
import android.content.LocusId
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.kim.landapp_kim.R
import com.kim.landapp_kim.data.Room

class RoomAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Room>) : ArrayAdapter<Room> (mContext, resId, mList){

        val inflater = LayoutInflater.from(mContext)
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if(tempRow == null){

            tempRow = inflater.inflate(R.layout.room_list_item,null)

        }

        val row = tempRow!!

        val roomData = mList[position]
        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressAndFloorTxt = row.findViewById<TextView>(R.id.addressAndFloorTxt)
        val descriptionTxt = row.findViewById<TextView>(R.id.descriptionTxt)

        priceTxt.text = roomData.getFormattedPrice()
        descriptionTxt.text = roomData.description
        addressAndFloorTxt.text = "${roomData.address},${roomData.getFormattedFloor()}"

        return row
    }
}