package com.fiyin.exploringlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu)
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
}