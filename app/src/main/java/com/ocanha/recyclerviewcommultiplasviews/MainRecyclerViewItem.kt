package com.ocanha.recyclerviewcommultiplasviews

sealed class MainRecyclerViewItem {

    data class Cabecalho(
        val imgae: Int,
    ) : MainRecyclerViewItem()

    data class Ator(
        val nome: String,
        val papel: String,
        val image: Int
    ) : MainRecyclerViewItem()
}