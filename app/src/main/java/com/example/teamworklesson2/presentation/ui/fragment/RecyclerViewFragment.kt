package com.example.teamworklesson2.presentation.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.teamworklesson2.databinding.FragmentRecyclerViewBinding

class RecyclerViewFragment : Fragment() {
    private val binding by viewBinding(FragmentRecyclerViewBinding::bind)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}