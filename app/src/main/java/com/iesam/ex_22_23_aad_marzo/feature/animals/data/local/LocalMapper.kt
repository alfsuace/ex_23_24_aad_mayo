package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local

import androidx.core.view.WindowInsetsCompat.Type
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.Animal
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.AnimalBreed
import com.iesam.ex_22_23_aad_marzo.feature.animals.domain.AnimalType

fun AnimalEntity.toModel(type: AnimalType, breed: AnimalBreed):Animal{
    return Animal(
        this.id,
        this.name,
        type,
        breed
    )
}
fun Animal.ToEntity(cache: Long):AnimalEntity{
    return AnimalEntity(
        this.id,
        cache,
        this.name,
        this.type.id,
        this.animalBreed.id
    )
}

fun BreedEntity.toModel():AnimalBreed{
    return AnimalBreed(
        this.id,
        this.type,
        this.country
    )
}

fun AnimalBreed.ToEntity():BreedEntity{
    return BreedEntity(
        this.id,
        this.name,
        this.country
    )
}

fun AnimalTypeEntity.toModel():AnimalType{
    return AnimalType(
        this.id,
        this.type
    )
}

fun AnimalType.toEntity():AnimalTypeEntity{
    return AnimalTypeEntity(
        this.id,
        this.type
    )
}