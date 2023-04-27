package com.example.room

import androidx.room.*
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


//El DAO NameSurnameDao,
// contiene los métodos para realizar
// operaciones con los datos de la entidad.
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

    @Query("DELETE FROM nameSurnameTable")
    suspend fun deleteAll()

}