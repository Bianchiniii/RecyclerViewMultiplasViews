package com.ocanha.recyclerviewcommultiplasviews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.ocanha.recyclerviewcommultiplasviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val mainRecyclerViewAdapter = MainRecyclerViewAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainRecyclerViewAdapter.setData(getFakeData())

        with(binding.rvMain) {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = mainRecyclerViewAdapter
        }
    }

    private fun getFakeData(): MutableList<MainRecyclerViewItem> {
        return mutableListOf(
            MainRecyclerViewItem.Cabecalho(R.drawable.header),
            MainRecyclerViewItem.Ator(
                "Cleber",
                "Homem Aranha",
                R.drawable.a45985411b88d1353587540854140bde
            ),
            MainRecyclerViewItem.Ator(
                "Cleber",
                "Homem Aranha",
                R.drawable.a45985411b88d1353587540854140bde
            ),
            MainRecyclerViewItem.Ator(
                "Cleber",
                "Homem Aranha",
                R.drawable.a45985411b88d1353587540854140bde
            ),
            MainRecyclerViewItem.Ator(
                "Cleber",
                "Homem Aranha",
                R.drawable.a45985411b88d1353587540854140bde
            ),
            MainRecyclerViewItem.Cabecalho(R.drawable.header),
            MainRecyclerViewItem.Ator(
                "Cleber",
                "Homem Aranha",
                R.drawable.a45985411b88d1353587540854140bde
            ),
            MainRecyclerViewItem.Ator(
                "Cleber",
                "Homem Aranha",
                R.drawable.a45985411b88d1353587540854140bde
            ),
            MainRecyclerViewItem.Ator(
                "Cleber",
                "Homem Aranha",
                R.drawable.a45985411b88d1353587540854140bde
            ),
            MainRecyclerViewItem.Ator(
                "Cleber",
                "Homem Aranha",
                R.drawable.a45985411b88d1353587540854140bde
            ),
            MainRecyclerViewItem.Cabecalho(R.drawable.header),
            MainRecyclerViewItem.Ator(
                "Cleber",
                "Homem Aranha",
                R.drawable.a45985411b88d1353587540854140bde
            ),
            MainRecyclerViewItem.Cabecalho(R.drawable.header),
            MainRecyclerViewItem.Ator(
                "Cleber",
                "Homem Aranha",
                R.drawable.a45985411b88d1353587540854140bde
            )
        )
    }
}