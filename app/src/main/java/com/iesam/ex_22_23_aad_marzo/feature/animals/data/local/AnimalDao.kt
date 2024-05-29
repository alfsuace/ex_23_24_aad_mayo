package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface AnimalDao {
    @Query("SELECT * FROM $ANIMAL_TABLE")
    fun getAllAnimals():List<AnimalEntity>

    @Insert
    fun insertAllAnimlas(vararg animals: AnimalEntity)

    @Query("DELETE FROM $ANIMAL_TABLE")
    fun deleteAnimals()


    //Breed
    @Query("SELECT * FROM $BREED_TABLE")
    fun getAllBreeds():List<BreedEntity>

    @Query("SELECT * FROM $BREED_TABLE WHERE id IN (:idBredd)")
    fun getBreedById(idBredd: Int):BreedEntity

    @Insert
    fun insertAllBreeds(vararg breeds: BreedEntity)

    //Type

    @Query("SELECT * FROM $TYPE_ENTITY")
    fun getAllType():List<AnimalTypeEntity>

    @Query("SELECT * FROM $TYPE_ENTITY WHERE id IN (:idType)")
    fun getTypeyId(idType: Int):AnimalTypeEntity
    @Insert
    fun insertAllType(vararg types: AnimalTypeEntity)

    //
    @Transaction
    @Query("SELECT * FROM $TYPE_ENTITY")
    fun getAnimalWithType(): List<AnimalAndTypeEntity>

    @Transaction
    @Query("SELECT * FROM $BREED_TABLE")
    fun getAnimalWithBreed(): List<AnimalAndBreedEntity>




}