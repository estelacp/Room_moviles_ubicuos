package com.example.room

import androidx.room.*
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


//El DAO (Data Access Object) NameSurnameDao,
// que contendrá los métodos para realizar
// operaciones con los datos de la entidad.
// En este caso, necesitamos métodos para insertar y
// obtener los datos.
@Dao
interface NameSurnameDao {
    @Insert
    suspend fun insert(nameSurnames: NameSurname)

    @Query("SELECT name FROM nameSurnameTable")
    fun getAllNames(): List<String>

    @Query("SELECT surname FROM nameSurnameTable")
    fun getAllSurnames(): List<String>

    @Query("SELECT * FROM nameSurnameTable ORDER BY id DESC")
    fun getAll(): LiveData<List<NameSurname>>
}