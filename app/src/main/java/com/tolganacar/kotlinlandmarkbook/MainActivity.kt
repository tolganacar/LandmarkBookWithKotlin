package com.tolganacar.kotlinlandmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.tolganacar.kotlinlandmarkbook.databinding.ActivityDetailsBinding
import com.tolganacar.kotlinlandmarkbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        val anitkabir = Landmark("Anitkabir", "Türkiye",R.drawable.anitkabir)
        val pisa = Landmark("Pisa","Italy",R.drawable.pisa)
        val efes = Landmark("The Ancient City of Ephesus","Türkiye",R.drawable.efes)
        val yellowstone = Landmark("Yellowstone","USA",R.drawable.yellowstone)
        val kapadokya = Landmark("Cappadocia","Türkiye",R.drawable.kapadokya)
        val cologneCathedral = Landmark("Cologne Cathedral","Germany",R.drawable.koln)
        val pamukkale = Landmark("Pamukkale","Türkiye",R.drawable.pamukkale)

        landmarkList.add(anitkabir)
        landmarkList.add(pisa)
        landmarkList.add(efes)
        landmarkList.add(yellowstone)
        landmarkList.add(kapadokya)
        landmarkList.add(cologneCathedral)
        landmarkList.add(pamukkale)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter

    }
}