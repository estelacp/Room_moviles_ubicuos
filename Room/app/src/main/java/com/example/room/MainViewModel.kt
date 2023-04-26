package com.example.room
//modificamos la clase MainViewModel para que
// utilice la base de datos y
// agregue los datos mediante el DAO.
import androidx.lifecycle.*
import kotlinx.coroutines.launch
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

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

}





/*
package com.example.room

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _list = MutableLiveData<String>()
    val list: LiveData<String>
        get() = _list

    fun initNameList() {
        if(_list.value == null){
            _list.value = ""
        }
    }

    fun addNameAndSurname(name: String, surname: String) {
        _list.value = _list.value.toString() + name + " " + surname + "\n"
    }
}
}*/

