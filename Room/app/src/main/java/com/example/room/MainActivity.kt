package com.example.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}


/*package com.example.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.room.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)
        viewModel = ViewModelProvider(this@MainActivity).get(MainViewModel::class.java)

        binding.viewModel = viewModel
        viewModel.list.observe(this, Observer {
            binding.nameSurnameText.text = viewModel.list.value.toString()
        })

        viewModel.initNameList()

        var name =""
        var surname = ""

        binding.editName.addTextChangedListener (object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                name = s.toString()
            }
            override fun afterTextChanged(s: Editable?) {
            }
        })

        binding.editSurname.addTextChangedListener (object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                surname = s.toString()
            }
            override fun afterTextChanged(s: Editable?) {
            }
        })

        binding.saveButton.setOnClickListener {
            viewModel.addNameAndSurname(name, surname)
            deleteEditText()
        }
    }

    fun  deleteEditText(){
        binding.editName.setText("")
        binding.editSurname.setText("")

    }
}*/