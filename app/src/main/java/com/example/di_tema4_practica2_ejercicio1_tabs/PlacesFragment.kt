package com.example.di_tema4_practica2_ejercicio1_tabs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class PlacesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        /*
        Root es una variable que contiene el layout, para acceder
        a cualquier view deberemos llamarlo. Despues se debe devolver root.
         */
        val root = inflater.inflate(R.layout.fragment_places, container, false)

        val listaPlaces = ArrayList<ItemPlaces>()
        listaPlaces.add(ItemPlaces(R.drawable.image1, R.string.card1))
        listaPlaces.add(ItemPlaces(R.drawable.image2, R.string.card2))
        listaPlaces.add(ItemPlaces(R.drawable.image3, R.string.card3))
        listaPlaces.add(ItemPlaces(R.drawable.image4, R.string.card4))
        listaPlaces.add(ItemPlaces(R.drawable.image5, R.string.card5))
        listaPlaces.add(ItemPlaces(R.drawable.image6, R.string.card6))
        listaPlaces.add(ItemPlaces(R.drawable.image7, R.string.card7))
        listaPlaces.add(ItemPlaces(R.drawable.image8, R.string.card8))
        listaPlaces.add(ItemPlaces(R.drawable.image9, R.string.card9))

        val recView = root.findViewById<RecyclerView>(R.id.recView)

        val adaptador = ItemPlacesAdapter(listaPlaces)
        recView.adapter = adaptador
        recView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        adaptador.onClick = {}

        return root
    }
}
