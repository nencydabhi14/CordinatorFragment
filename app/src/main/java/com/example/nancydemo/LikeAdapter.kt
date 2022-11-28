package com.example.nancydemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class LikeAdapter(
    var mainActivity: MainActivity,
    var city: ArrayList<QuotesModel>,
    var like: Array<Int>
) :
    RecyclerView.Adapter<LikeAdapter.ViewData>() {


    class ViewData(itemView: View) : ViewHolder(itemView) {
        var txtItem = itemView.findViewById<TextView>(R.id.txtItem)
        var imgItem = itemView.findViewById<ImageView>(R.id.imgItem)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewData {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.itemdata, parent, false)
        return ViewData(view)
    }


    override fun onBindViewHolder(holder: ViewData, position: Int) {
        holder.txtItem.text = city[position].quotes
        var db = DataBase(mainActivity)
        if (city[position].fav.equals("0")) {
            holder.imgItem.setImageResource(R.drawable.ic_baseline_favorite_border_24)
        } else {
            holder.imgItem.setImageResource(R.drawable.ic_baseline_favorite_24)
        }

        holder.imgItem.setOnClickListener {
            if (city[position].fav.equals("0")) {
//                holder.imgItem.setImageResource(R.drawable.ic_baseline_favorite_border_24)
                city[position] = QuotesModel(city[position].id, "1", city[position].quotes)
                db.updateData(QuotesModel(city[position].id, "1", city[position].quotes))
                notifyDataSetChanged()
            } else {
                db.updateData(QuotesModel(city[position].id, "0", city[position].quotes))
                city[position] = QuotesModel(city[position].id, "0", city[position].quotes)
//                holder.imgItem.setImageResource(R.drawable.ic_baseline_favorite_24)
                notifyDataSetChanged()

            }
        }
    }


    override fun getItemCount(): Int {
        return city.size
    }
}