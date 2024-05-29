package com.iesam.ex_22_23_aad_marzo.feature.tapas.data.remote

import com.google.firebase.database.PropertyName
import com.iesam.ex_22_23_aad_marzo.feature.tapas.domain.Establishment
import com.iesam.ex_22_23_aad_marzo.feature.tapas.domain.PhotoTapas

data class TapasRemoteModel (
    @get:PropertyName("id") @set:PropertyName("id") var id: Int=0,
    @get:PropertyName("name") @set:PropertyName("name") var name: String="",
    @get:PropertyName("description") @set:PropertyName("description") var description: String="",
    @get:PropertyName("establishment") @set:PropertyName("establishment") var establishment: Establishment=Establishment(0,"default"),
    @get:PropertyName("photoTapas") @set:PropertyName("photoTapas") var listPhotoTapas: List<PhotoTapas>,


)