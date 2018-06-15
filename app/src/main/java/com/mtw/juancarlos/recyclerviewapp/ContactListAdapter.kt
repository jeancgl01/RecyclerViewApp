package com.mtw.juancarlos.recyclerviewapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.contacto_list_item.view.*

class ContactListAdapter(private val contactosList:ArrayList<Contacto>) : RecyclerView.Adapter<ContactListAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactListAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.contacto_list_item,parent,false))
    }

    override fun onBindViewHolder(holder: ContactListAdapter.ViewHolder, position: Int) {
        holder.bind(contactosList[position])
    }

    override fun getItemCount(): Int = contactosList.size

    class ViewHolder (itemView:View) : RecyclerView.ViewHolder(itemView) {
        fun bind (contacto:Contacto){
            itemView.tvNombre.text = contacto.nombre
            itemView.tvTelefono.text = contacto.telefono
            itemView.setOnClickListener {
                Toast.makeText(it.context,"Clicked " + contacto.nombre,Toast.LENGTH_LONG).show()
            }
        }
    }

}