package com.veldan.navigationpattern.One

import androidx.navigation.NavController
import com.veldan.navigationpattern.navigation.BaseScreen

class OneScreen: BaseScreen {

    override fun navigateTo(navController: NavController) {
        val action = OneFragmentDirections.actionOneFragmentToTwoFragment()
        navController.navigate(action)
    }

}