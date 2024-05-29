package com.iesam.ex_22_23_aad_marzo.feature.tapas.data.remote

import com.iesam.ex_22_23_aad_marzo.feature.tapas.domain.Tapa

fun TapasRemoteModel.toModel():Tapa{
    return Tapa(
        this.id,
        this.name,
        this.description,
        this.establishment,
        this.listPhotoTapas
    )
}

