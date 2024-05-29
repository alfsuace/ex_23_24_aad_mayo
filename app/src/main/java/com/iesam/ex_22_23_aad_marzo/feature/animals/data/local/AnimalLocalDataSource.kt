package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local

import android.content.Context
import androidx.room.Room
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.Animal
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.AnimalBreed
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.AnimalType

class AnimalLocalDataSource(private val context: Context) {

    val db = Room.databaseBuilder(
        context,
        AnimalDataBase::class.java, "AnimalBD"
    ).build()

    val dao = db.animalDao()

    fun getAnimals():List<AnimalEntity> {
        return dao.getAllAnimals()
    }

    fun saveAnimals(animals: List<Animal>){
        val animalEntity=mutableListOf<AnimalEntity>()
        val time = System.currentTimeMillis()
        animals.forEach{
            animalEntity.add(it.ToEntity(time))
        }
        //dao.insertAllAnimlas(animalEntity.toTypedArray())
        //
    }

    fun getAllBreed():List<AnimalBreed>{
        return dao.getAllBreeds().map {
            it.toModel()
        }
    }

    fun getAllTypes():List<AnimalType>{
        return dao.getAllType().map {
            it.toModel()
        }
    }

}