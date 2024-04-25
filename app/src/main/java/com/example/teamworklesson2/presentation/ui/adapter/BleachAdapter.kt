package com.example.teamworklesson2.presentation.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.teamworklesson2.databinding.ItemNameAndDescriptionBinding
import com.example.teamworklesson2.presentation.data.model.NameAndDescriptionResponse

class BleachAdapter :
    ListAdapter<NameAndDescriptionResponse, BleachAdapter.BleachViewHolder>(DiffUtilCallback()) {

    class BleachViewHolder(private val binding: ItemNameAndDescriptionBinding) :
        ViewHolder(binding.root) {
        fun onBind(bleach: NameAndDescriptionResponse) = with(binding) {
            tvNameAuthor.text = bleach.author
            tvHistory.text = bleach.quote
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BleachViewHolder {
        return BleachViewHolder(
            ItemNameAndDescriptionBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: BleachViewHolder, position: Int) {
        getItem(position).let {
            holder.onBind(it)
        }
    }

    companion object {
        class DiffUtilCallback : DiffUtil.ItemCallback<NameAndDescriptionResponse>() {
            override fun areItemsTheSame(
                oldItem: NameAndDescriptionResponse,
                newItem: NameAndDescriptionResponse
            ): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(
                oldItem: NameAndDescriptionResponse,
                newItem: NameAndDescriptionResponse
            ): Boolean {
                return oldItem == newItem
            }
        }
    }
}