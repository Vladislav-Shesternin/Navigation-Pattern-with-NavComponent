package com.veldan.navigationpattern.navigation

interface BaseRouter {

    fun execute(command: BaseCommand)

}