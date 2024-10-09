package com.example.e_ramotask.navigation

import com.example.e_ramotask.R

sealed class BottomNavItem(var title:String, var icon:Int, var screen_route:String) {

    data object Settings : BottomNavItem("Setting", R.drawable.settings, "settings")
    data object Home : BottomNavItem("Home", R.drawable.home, "home")
    data object Brand : BottomNavItem("Brand", R.drawable.brand, "brand")
    data object Category : BottomNavItem("Category", R.drawable.category, "category")
    data object Coupons : BottomNavItem("Coupons", R.drawable.coupon, "coupons")

}