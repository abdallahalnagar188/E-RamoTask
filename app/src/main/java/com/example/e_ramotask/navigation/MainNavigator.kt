package com.example.e_ramotask.navigation

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.e_ramotask.category.BrandsScreen
import com.example.e_ramotask.category.CategoryScreen
import com.example.e_ramotask.category.CouponsScreen
import com.example.e_ramotask.category.SettingsScreen
import com.example.e_ramotask.content.HomeScreen

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreenView(navController: NavHostController) {
    Scaffold(
        bottomBar = { MyBottomNavigation(navController = navController) }
    ) {
        NavigationGraph(navController = navController)
    }
}

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable(BottomNavItem.Home.screen_route) {
            HomeScreen(navController)
        }
        composable(BottomNavItem.Brand.screen_route) {
            BrandsScreen()
        }
        composable(BottomNavItem.Category.screen_route) {
            CategoryScreen()
        }
        composable(BottomNavItem.Settings.screen_route) {
            SettingsScreen()
        }
        composable(BottomNavItem.Coupons.screen_route) {
            CouponsScreen()
        }
    }
}
