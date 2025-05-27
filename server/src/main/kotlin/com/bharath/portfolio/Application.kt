package com.bharath.portfolio

import SERVER_PORT
import com.bharath.portfolio.configurations.configureRouting
import com.bharath.portfolio.configurations.configureSerialization
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*


fun main() {
    embeddedServer(Netty, port = SERVER_PORT, host = "localhost") {
        module()
    }.start(wait = true)
}

fun Application.module() {
    configureSerialization()
    configureRouting()
}