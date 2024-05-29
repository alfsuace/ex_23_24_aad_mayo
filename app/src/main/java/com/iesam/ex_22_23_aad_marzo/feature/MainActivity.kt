package com.iesam.ex_22_23_aad_marzo.feature

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.google.firebase.database.FirebaseDatabase
import com.iesam.ex_22_23_aad_marzo.R
import com.iesam.ex_22_23_aad_marzo.feature.tapas.data.TapasDataRepository
import com.iesam.ex_22_23_aad_marzo.feature.tapas.data.remote.TapasRemoteDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button?>(R.id.action_delete_user).setOnClickListener {
            deleteLogin()
        }
        findViewById<Button?>(R.id.action_delete_animals).setOnClickListener {
            deleteAnimals()
        }
        initLogin()
        initAnimals()
        initAnimalBreed()
        initTapas()
    }

    private fun initLogin() {
        val email = "example@email.es"
        val password = "example_password"

        //Llamar al repositorio
        //LoginRepository loginRepository = ...
    }

    private fun deleteLogin() {
        //Eliminar datos del login.
    }

    private fun initAnimals() {
        thread {
            //Ejecutar código para obtener animales
        }
    }

    private fun initAnimalBreed() {
        thread {
            //Ejecutar código para obtener todas razas almacenadas en la base de datos (sin repetir)
        }
    }

    private fun deleteAnimals() {
        thread {
            //Elimino los animales de local..
        }
    }

    private fun initTapas() {
        thread {
            lifecycleScope.launch (Dispatchers.IO){
                val repo = TapasDataRepository(TapasRemoteDataSource(FirebaseDatabase.getInstance()))

                val tapasList=repo.getTapas()
                Log.d("debugA", tapasList[1].toString())
                val frenoDeManoDebugger=1
            }
        }
    }
}