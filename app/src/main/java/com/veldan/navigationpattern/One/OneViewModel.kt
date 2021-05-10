package com.veldan.navigationpattern.One

import androidx.lifecycle.ViewModel
import com.veldan.navigationpattern.navigation.BaseCommand
import com.veldan.navigationpattern.navigation.BaseRouterImpl

class OneViewModel(
    private val router: BaseRouterImpl
) : ViewModel() {

    fun navigateTo() {
        router.execute(BaseCommand.Navigate(OneScreen()))
    }

}