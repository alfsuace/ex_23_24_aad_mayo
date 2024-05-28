package com.iesam.ex_22_23_aad_marzo.feature.tapas.domain

data class Tapa(
    val id: Int,
    val name: String,
    val description: String,
    val establishment: Establishment,
    val photoTapas: List<PhotoTapas>
)

data class Establishment(val id: Int, val name: String)
data class PhotoTapas(val id: Int, val url: String)