package com.example.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
//La entidad NameSurname, que representará
// los datos que se almacenarán en la base de datos.
// Para este caso, solo necesitamos dos campos:
// name y surname.
@Entity(tableName = "nameSurnameTable")
data class NameSurname(
    @PrimaryKey(autoGenerate = true) var id: Long = 0L,
    @ColumnInfo(name = "name") var name: String = "",
    @ColumnInfo(name = "surname") var surname: String = ""
)
