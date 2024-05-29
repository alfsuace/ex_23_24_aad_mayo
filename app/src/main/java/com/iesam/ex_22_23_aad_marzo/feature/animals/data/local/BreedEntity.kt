package com.iesam.ex_22_23_aad_marzo.feature.animals.data.local

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

const val BREED_TABLE="breed"
data class BreedEntity (
    @PrimaryKey @ColumnInfo(name = "id") val id: Int?,
    @ColumnInfo(name = "type")val type: String?,
    @ColumnInfo(name = "country")val country: String?,

)