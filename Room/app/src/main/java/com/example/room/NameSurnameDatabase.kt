package com.example.room

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

//La clase abstracta NameSurnameDatabase
// representa la base de datos
// y contiene una instancia del DAO.
@Database(entities = [NameSurname::class], version = 1, exportSchema = false)
abstract class NameSurnameDatabase : RoomDatabase() {
    abstract fun nameSurnameDao(): NameSurnameDao

    companion object {
        @Volatile
        private var INSTANCE: NameSurnameDatabase? = null

        fun getInstance(context: Application): NameSurnameDatabase {
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

