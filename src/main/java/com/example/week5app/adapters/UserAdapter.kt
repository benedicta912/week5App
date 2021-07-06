package com.example.week5app.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.week5app.databinding.UserItemBinding
import com.example.week5app.models.User

class UserAdapter(val users: List<User>)
    : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    class UserViewHolder(var binding: UserItemBinding)
        : RecyclerView.ViewHolder(binding.root) {
        fun bind(user: User) {
            binding.firstname.text = user.firstname
            binding.lastname.text = user.lastname
            //binding.image.setImageResource
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            UserViewHolder {
        var binding = UserItemBinding.inflate(LayoutInflater.from
            (parent.context))
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int)
    {
        holder.bind(users[position])
    }

    override fun getItemCount(): Int {
        return users.size
    }
}