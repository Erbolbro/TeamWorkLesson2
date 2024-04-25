package com.example.teamworklesson2.presentation.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.teamworklesson2.R
import com.example.teamworklesson2.databinding.FragmentRecyclerViewBinding
import com.example.teamworklesson2.presentation.ui.activity.Android15GroupViewMode
import com.example.teamworklesson2.presentation.ui.adapter.BleachAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class RecyclerViewFragment : Fragment(R.layout.fragment_recycler_view) {

    private val binding by viewBinding(FragmentRecyclerViewBinding::bind)
    private val viewModel by viewModels<Android15GroupViewMode>()
    private val bleachAdapter = BleachAdapter()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setupObserver()
    }

    private fun initialize() = with(binding) {
        rvBleachInteresting.adapter = bleachAdapter
    }

    private fun setupObserver() {
        lifecycleScope.launch {
            viewModel.fetchAndroid().collect {
                lifecycleScope.launch {
                    bleachAdapter.submitList(mutableListOf(it))
                }
            }
        }
    }
}