package com.example.bottomnavigationbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bottomnavigationbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        navController = findNavController(R.id.navHostLoggedOutView)

        setupActionBarWithNavController(navController)
        mainBinding.bottomNav.setupWithNavController(navController)

        mainBinding.bottomNav.isVisible = false






    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    fun switchMenu(clientType: Int){
        if (clientType == 0){
            mainBinding.bottomNav.maxItemCount
            mainBinding.bottomNav.inflateMenu(R.menu.bottom_menu)
        }
        else {
            mainBinding.bottomNav.maxItemCount
            mainBinding.bottomNav.inflateMenu(R.menu.agent_bottom_menu)
        }
    }

    fun setNavBarVisibility(){
        mainBinding.bottomNav.isVisible = true
    }

    fun hideActionBar(){
        supportActionBar?.hide()
    }

    fun showActionBar(){
        supportActionBar?.show()
    }
}