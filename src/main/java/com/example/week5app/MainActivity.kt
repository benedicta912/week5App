package com.example.week5app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.week5app.adapters.FruitAdapter
import com.example.week5app.adapters.UserAdapter
import com.example.week5app.databinding.ActivityMainBinding
import com.example.week5app.models.Fruit
import com.example.week5app.models.User

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//adapter needs a list of users to display
        //recyclerview needs an adapter to control it
        //create data that adapter will use
        val users = arrayListOf<User>(
            User(R.drawable.ic_heart,
                "Jon",
                "Snow"
            ),
            User(R.drawable.ic__brownteddy,
                "Emmy",
                "Mike"
            ),
            User(R.drawable.ic__car,
                "Dinma",
                "Chuks"
            ),
            User(R.drawable.ic_daffodils,
                "Fum",
                "Victoria"
            ),
            User(R.drawable.ic__crucifix,
                "Nene",
                "Esther"
            ),
            User(R.drawable.ic_carkey,
            "Emma",
            "Onyema"
            ),
            User(R.drawable.ic_heart,
                "Sophia",
                "Chidinma"
            ),
            User(R.drawable.ic_trees,
                "Beautiful",
                "Wisdom"
            ),
            User(R.drawable.ic__brownteddy,
                "Wisdom",
                "Love"
            ),
            User(R.drawable.ic_daffodils,
                "Felicia",
                "Mama"
            ),
            User(R.drawable.ic_rubikscube,
                "Chinedu",
                "Miku"
            ),
            User(R.drawable.ic_wheel2,
                "Ekene",
                "Stephen"
            ),
            User(R.drawable.ic__crucifix,
                "Ogorchukwu",
                "Joan"
            ),
            User(R.drawable.ic_trees,
                "Queen",
                "Esther"
            ),
            User(R.drawable.ic__brownteddy,
                "Adaezebuego",
                "Joy"
            ),
            User(R.drawable.ic_eucharist,
                "Jesus",
                "Baby"
            ),
            User(R.drawable.ic__car,
                "Jonathan",
                "Papa"
            ),
            User(R.drawable.ic_heart,
                "Adanna",
                "Phils"
            ),
            User(R.drawable.ic_rubikscube,
                "Chile",
                "Kaosi"
            ),
            User(R.drawable.ic_roseflowers,
                "Benny",
                "Brown"
            ),
        )

        //instantiat or create the adapter
        val userAdapter = UserAdapter(users)
        binding.usersRecyclerview.layoutManager =
            LinearLayoutManager(this)
        binding.usersRecyclerview.adapter = userAdapter

//        val fruits = arrayListOf<Fruit>(
//            Fruit("Mango",
//            "Green"),
//
//            Fruit("Apple",
//                "Red"),
//
//            Fruit("Banana",
//                "Yellow"),
//
//            Fruit("Strawberry",
//                "Green"),
//
//            Fruit("Mango",
//                "Green"),
//        )
//
//        val fruitAdapter = FruitAdapter(fruits)
//        binding.usersRecyclerview.layoutManager = LinearLayoutManager(this)
//        binding.usersRecyclerview.adapter = fruitAdapter
    }
}