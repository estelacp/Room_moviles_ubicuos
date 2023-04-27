package com.example.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


//La entidad NameSurname representa
// los datos que se almacenan en la base de datos.
@Entity(tableName = "nameSurnameTable")
data class NameSurname(
    @PrimaryKey(autoGenerate = true) var id: Long = 0L,
    @ColumnInfo(name = "name") var name: String = "",
    @ColumnInfo(name = "surname") var surname: String = ""
)
