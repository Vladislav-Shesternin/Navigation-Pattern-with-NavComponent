package com.veldan.navigationpattern.navigation

import androidx.navigation.NavController

class BaseRouterImpl(
    private val navController: NavController
) : BaseRouter {

    override fun execute(command: BaseCommand) {
        when (command) {
            is BaseCommand.Back -> {
                navController.popBackStack()
            }
            is BaseCommand.Navigate -> {
                command.screen.navigateTo(navController)
            }
        }
    }

}