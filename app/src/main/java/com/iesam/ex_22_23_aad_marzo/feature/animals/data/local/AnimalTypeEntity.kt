package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

const val TYPE_ENTITY ="type"
@Entity(tableName = TYPE_ENTITY)
data class AnimalTypeEntity (
    @PrimaryKey @ColumnInfo(name = "id") val id: Int?,
    @ColumnInfo(name = "type")val type: String?,
)