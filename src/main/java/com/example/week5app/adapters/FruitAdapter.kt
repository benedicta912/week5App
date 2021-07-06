package com.example.week5app.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.week5app.databinding.FruitItemBinding
import com.example.week5app.models.Fruit

//implement the adapter class
//the adapter constructor should accept a list of fruits e.g fruits: List<Fruit>
//implement the view holder using view binding
class FruitAdapter(val fruits: List<Fruit>):
 RecyclerView.Adapter<FruitAdapter.FruitViewHolder>(){

     class FruitViewHolder(var binding: FruitItemBinding)
         :RecyclerView.ViewHolder(binding.root){
             fun bind(fruit: Fruit){
                 binding.fruitname.text = fruit.name
                 binding.fruitcolor.text = fruit.color
             }
         }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            FruitViewHolder {
        var binding = FruitItemBinding.inflate(LayoutInflater.from
            (parent.context))
        return  FruitViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int
    ) {
      holder.bind(fruits[position])
    }

    override fun getItemCount(): Int {
        return fruits.size
    }
}
