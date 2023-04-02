package com.example.logowanko

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toolbar
import com.example.logowanko.databinding.ActivityMainBinding
import com.example.logowanko.inf.inf_uzytkownicy

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.zaloguj.setOnClickListener {
            binding.toolbar1.title = binding.login.text.toString() + " " + binding.haslo.text.toString()
        }



    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.open_informacje -> {
                val intent = Intent(this, inf_uzytkownicy::class.java)
                startActivity(intent)
                true
            }
            R.id.open_oceny -> {
                // Do something for action_share
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}