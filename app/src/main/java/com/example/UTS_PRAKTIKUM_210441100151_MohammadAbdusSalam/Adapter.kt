package com.example.UTS_PRAKTIKUM_210441100151_MohammadAbdusSalam

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter (private val mahasiswa: ArrayList<DataMahasiswa>, private val context: Context
): RecyclerView.Adapter<Adapter.CourseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.CourseViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.grid_layout,
            parent, false
        )
        return CourseViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: Adapter.CourseViewHolder, position: Int) {
        holder.nama.text = mahasiswa.get(position).Name
        holder.nim.text = mahasiswa.get(position).Nim
        holder.umur.text = mahasiswa.get(position).Age
        holder.gambar.setImageResource(mahasiswa.get(position).Img)
    }

    override fun getItemCount(): Int {
        return mahasiswa.size
    }

    class CourseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gambar: ImageView = itemView.findViewById(R.id.idgambar)
        val nama: TextView = itemView.findViewById(R.id.idnama)
        val nim: TextView = itemView.findViewById(R.id.idnim)
        val umur: TextView = itemView.findViewById(R.id.idumur)
    }
}