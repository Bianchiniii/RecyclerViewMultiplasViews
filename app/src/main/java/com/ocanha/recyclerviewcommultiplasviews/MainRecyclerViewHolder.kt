package com.ocanha.recyclerviewcommultiplasviews

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.ocanha.recyclerviewcommultiplasviews.databinding.ResAtorBinding
import com.ocanha.recyclerviewcommultiplasviews.databinding.ResCabecalhoBinding

sealed class MainRecyclerViewHolder(binding: ViewBinding) : RecyclerView.ViewHolder(binding.root) {

    class CabecalhoViewHolder(
        private val _binding: ResCabecalhoBinding
    ) : MainRecyclerViewHolder(_binding) {

        fun bind(cabecalho: MainRecyclerViewItem.Cabecalho) {
            _binding.imgHeaders.setImageResource(cabecalho.imgae)
        }
    }

    class AtorViewHolder(
        private val _binding: ResAtorBinding
    ) : MainRecyclerViewHolder(_binding) {

        fun bind(ator: MainRecyclerViewItem.Ator) {
            with(_binding) {
                tvAtor.text = ator.nome
                tvAtorPapel.text = ator.papel
                imgAtor.setImageResource(ator.image)
            }
        }
    }
}