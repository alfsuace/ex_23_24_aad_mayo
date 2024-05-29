package com.iesam.ex_22_23_aad_marzo.feature.animals.data

import com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.AnimalLocalDataSource
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.local.toModel
import com.iesam.ex_22_23_aad_marzo.feature.animals.data.remote.AnimalRemoteDataSource
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.Animal

class AnimalDataRepository(private val animalLocalDataSource: AnimalLocalDataSource, private val animalRemoteDataSource: AnimalRemoteDataSource) {

    fun getAllAnimals():List<Animal>{
        if (animalLocalDataSource.getAnimals().isEmpty() || animalLocalDataSource.getAnimals().get(0).cache>=5000){
            animalRemoteDataSource.getAnimals()
        }else{
            val animals = animalLocalDataSource.getAnimals()
            val animalsModel = mutableListOf<Animal>()
            animals.map {
                animalsModel.add(
                    it.toModel(
                        //faltaria coger por id
                        animalLocalDataSource.getTypeyId(it.id).toModel(),
                        dao.getBreedById(it.id).toModel()
                    )
                )
            }
        }
    }
}