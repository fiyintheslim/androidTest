package com.fiyin.exploringlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("i", "The app  is created")
        Toast.makeText(this, "The app is created at this point", Toast.LENGTH_SHORT).show()
        setContentView(R.layout.main_menu)
    }
    override fun onStart(){
        super.onStart()
        Log.i("i", "onStart is happening here")
        Toast.makeText(this, "The app is being created at this point", Toast.LENGTH_SHORT).show()
    }
    override fun onResume(){
        super.onResume()
        Log.i("i", "The app is resuming")
        Toast.makeText(this, "The app is reuming here", Toast.LENGTH_SHORT).show()
    }
    override fun onPause(){
        super.onPause()
        Log.i("i", "the app is being paused")
        Toast.makeText(this, "The app is being paused here", Toast.LENGTH_SHORT).show()
    }
    override fun onStop(){
        super.onStop()
        Log.i("i", "The app is stopping")
        Toast.makeText(this, "The app is stopping, so make changes", Toast.LENGTH_SHORT).show()
    }
    override fun onDestroy(){
        super.onDestroy()
        Log.i("i", "The app is detroyed so you all can be on your merry way")
        Toast.makeText(this, "No going back, the app is destroyed", Toast.LENGTH_SHORT).show()
    }
    fun loadConstraintLayout(v: View){
        setContentView(R.layout.activity_main)
    }

    fun loadTableLayout(v:View){
        setContentView(R.layout.my_table_layout)
    }

    fun goHome(v:View){
        setContentView(R.layout.main_menu)
    }
    fun displayCard(v:View){
        setContentView(R.layout.card_layout)
    }
}