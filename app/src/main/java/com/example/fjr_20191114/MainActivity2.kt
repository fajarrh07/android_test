package com.example.fjr_20191114

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fjr_20191114.ui.mainactivity2.MainActivity2Fragment

class MainActivity2 : AppCompatActivity(), RecyclerAdapter.RecylerInterface {

    private val users = ArrayList<User>()
    private var rv: RecyclerView? = null

    override fun onClickShowToast() {
        Toast.makeText(this, "add new user", Toast.LENGTH_SHORT).show()
    }

    override fun addUser() {
        users.add(User("Paul", "Mr"))
        rv?.adapter?.notifyDataSetChanged()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity2_activity)
        rv = findViewById(R.id.recycler_view)

        rv?.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        users.add(User("Paul", "Mr"))
        users.add(User("Jane", "Miss"))
        users.add(User("John", "Dr"))
        users.add(User("Amy", "Mrs"))

        val adapter = RecyclerAdapter(users, this)
        rv?.adapter = adapter

    }

}
