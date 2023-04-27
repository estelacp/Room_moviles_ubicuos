package com.example.room

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


// Con la clase MainViewModelFactory creamos instancias de
// MainViewModel ya que ViewModelProvider no puede crear
// instancias de ViewModels que tengan parámetros en su constructor.
class MainViewModelFactory(private val nameDao: NameSurnameDao): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(nameDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel")
    }
}

