package com.jeff.carhub.utility

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.jeff.carhub.R
import com.jeff.carhub.databinding.ItemCarsBinding
import com.jeff.carhub.model.CarData

class carAdapter(private val carList: List<CarData>):
    RecyclerView.Adapter<carAdapter.CarViewHolder>() {
    inner class CarViewHolder(val v:ItemCarsBinding):RecyclerView.ViewHolder(v.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val v = DataBindingUtil.inflate<ItemCarsBinding>(inflater,R.layout.item_cars, parent, false)
        return CarViewHolder(v)

    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
       val carList = carList[position]
        holder.v.isCarList = carList
        holder.v.carImg.setImageResource(carList.carImg)
    }

    override fun getItemCount(): Int {
        return carList.size
    }
}