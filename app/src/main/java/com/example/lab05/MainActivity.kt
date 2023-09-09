package com.example.lab05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //Se crea una arreglo de string con los valores que se asginaran a la lista

    var arrSO = arrayOf(
        "Android", "iPhone", "Windows Phone", "Blackberry", "Firefox OS", "Amazon World", "Nokia"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //se obtiene el list view
        val lsvSistemasOperativos: ListView = findViewById<View>(R.id.lsvSO) as ListView
        //Se crea un adaptador para llenar la lista
        val adaptador: Any? =
            ArrayAdapter<Any?>(this,android.R.layout.simple_list_item_1,arrSO)
        //Se asigna el adaptador a la view
        lsvSistemasOperativos.adapter = adaptador as ListAdapter?
        //Se genera el metodo setOnItemCLickListener de la view

        lsvSistemasOperativos.setOnItemClickListener { parent, view, position, id ->
            println("Aquí mostrare un mensaje al usuario")
            Toast.makeText(
                applicationContext,
                "Posición: $position",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}