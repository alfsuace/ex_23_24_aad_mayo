package com.iesam.ex_22_23_aad_marzo.feature.tapas.data.remote

import com.google.firebase.database.FirebaseDatabase
import com.iesam.ex_22_23_aad_marzo.feature.tapas.domain.Tapa
import kotlinx.coroutines.tasks.await

class TapasRemoteDataSource(private val fireBase: FirebaseDatabase) {

    suspend fun getTapas(): List<Tapa> {
        return fireBase.getReference("tapas").get().await().children.map {
            it.getValue(TapasRemoteModel::class.java)!!.toModel()
        }
    }


}