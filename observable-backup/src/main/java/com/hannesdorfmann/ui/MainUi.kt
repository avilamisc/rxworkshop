package com.hannesdorfmann.ui

import javafx.application.Application

class MainUi : tornadofx.App() {
    override val primaryView = ButtonView::class

    init {
        Thread.setDefaultUncaughtExceptionHandler(Thread.UncaughtExceptionHandler {a, throwable ->
            throwable.printStackTrace()
            System.exit(1)})
    }
}

fun main(vararg args : String){

    Application.launch(MainUi::class.java, *args)

}