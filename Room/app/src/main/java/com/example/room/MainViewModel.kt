package com.example.room

import kotlinx.coroutines.launch
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope


// Modificamos la clase MainViewModel para
// utilizar la base de datos y
// agregar los datos mediante el DAO.
class MainViewModel(val nameDao: NameSurnameDao): ViewModel() {
    var name= ""
    var surname= ""

    private val namesurname = nameDao.getAll()

    val getNameSurname = Transformations.map(namesurname) {
        namesurname -> obtainAllNamesSurnames(namesurname)
    }

    fun addNameSurname(){
        viewModelScope.launch {
            val namesurname = NameSurname()
            namesurname.name = name
            namesurname.surname = surname
            nameDao.insert(namesurname)
        }
    }

    fun obtainNameSurname(namesurname: NameSurname): String {
        var namesurn = "${namesurname.name}" +" "
        namesurn += "${namesurname.surname}" +"\n"
        return namesurn
    }

    fun obtainAllNamesSurnames(namessurnames: List<NameSurname>): String {
        return namessurnames.fold("") {
            namesurn, new -> namesurn + '\n' + obtainNameSurname(new)
        }
    }

    fun deleteAllNamesSurnames(){
        viewModelScope.launch {
            nameDao.deleteAll()
        }
    }
}


