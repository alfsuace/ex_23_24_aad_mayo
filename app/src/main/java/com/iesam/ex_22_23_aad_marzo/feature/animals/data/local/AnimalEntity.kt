package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

const val ANIMAL_TABLE="animal"
@Entity(tableName = ANIMAL_TABLE)
data class AnimalEntity (
    @PrimaryKey @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "cache")val cache: Long,
    @ColumnInfo(name = "name")val name: String,
    @ColumnInfo(name = "typeId") val typeId: Int,
    @ColumnInfo(name = "breedId") val breedId: Int,
)