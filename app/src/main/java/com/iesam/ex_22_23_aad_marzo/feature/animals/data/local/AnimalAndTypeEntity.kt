package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local

import androidx.room.Embedded
import androidx.room.Relation

data class AnimalAndTypeEntity (
    @Embedded val type: AnimalTypeEntity,
    @Relation(
        parentColumn = "typeId",
        entityColumn = "typeId"
    )
    val listAnimal: List<AnimalEntity>
)