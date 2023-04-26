package com.example.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

//La clase abstracta NameSurnameDatabase,
// que representará la base de datos en sí misma
// y contendrá una instancia del DAO.
@Database(entities = [NameSurname::class], version = 1, exportSchema = false)
abstract class NameSurnameDatabase : RoomDatabase() {
    abstract fun nameSurnameDao(): NameSurnameDao

    companion object {
        @Volatile
        private var INSTANCE: NameSurnameDatabase? = null

        fun getInstance(context: Context): NameSurnameDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        NameSurnameDatabase::class.java,
                        "Namesurname_database"
                    ).build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}

        /*fun getDatabase(context: Context): NameSurnameDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    NameSurnameDatabase::class.java,
                    "name_surname_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }*/

