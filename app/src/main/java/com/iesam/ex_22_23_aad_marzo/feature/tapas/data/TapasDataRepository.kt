package com.iesam.ex_22_23_aad_marzo.feature.tapas.data

import com.iesam.ex_22_23_aad_marzo.feature.tapas.data.remote.TapasRemoteDataSource
import com.iesam.ex_22_23_aad_marzo.feature.tapas.domain.Tapa

class TapasDataRepository(private val tapasRemoteDataSource: TapasRemoteDataSource) {

    suspend fun getTapas():List<Tapa>{
        return tapasRemoteDataSource.getTapas()
    }
}