package com.example.room

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.room.databinding.FragmentNameSurnameBinding


class NameSurnameFragment : Fragment() {

    private lateinit var binding: FragmentNameSurnameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_name_surname, container, false)


        val application = requireNotNull(this.activity).application
        val nameDao = NameSurnameDatabase.getInstance(application).nameSurnameDao()
        val viewModelFactory = MainViewModelFactory(nameDao)
        val viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)

        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        binding.saveButton.setOnClickListener {
            viewModel.addNameSurname()
            binding.editName.setText("")
            binding.editSurname.setText("")
        }

        binding.removeButton.setOnClickListener {
            viewModel.deleteAllNamesSurnames()
        }

        return binding.root
    }
}