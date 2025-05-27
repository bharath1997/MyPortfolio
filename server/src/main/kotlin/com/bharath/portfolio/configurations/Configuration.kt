package com.bharath.portfolio.configurations

import Greeting
import com.bharath.portfolio.socialmedia.SocialMedia
import com.bharath.portfolio.socialmedia.SocialMediaService
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.serialization.kotlinx.json.json
import io.ktor.server.application.install
import io.ktor.server.plugins.contentnegotiation.ContentNegotiation
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.http.content.staticResources
import io.ktor.server.request.contentType
import io.ktor.server.request.receive
import io.ktor.server.request.receiveParameters
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json()
    }
}

fun Application.configureRouting() {
    routing {
        staticResources("/static", "static")
        get("/") {
            call.respondText("Ktor: ${Greeting().greet()}")
        }
        get("/socialmedia") {
            try {
                call.respond(HttpStatusCode.OK, SocialMediaService.getSocialMediaList())
            } catch (e: Exception) {
                call.respondText(e.message.toString())
            }
        }

        post("/socialmedia") {
            val socialMedia = when (call.request.contentType()) {
                ContentType.Application.FormUrlEncoded -> {
                    val formContent = call.receiveParameters()
                    SocialMedia(
                        formContent["name"] ?: "",
                        formContent["link"] ?: "",
                        formContent["icon"] ?: ""
                    )
                }

                ContentType.Application.Json -> call.receive<SocialMedia>()
                else -> {
                    call.respond(HttpStatusCode.UnsupportedMediaType, "Unsupported content type")
                    return@post
                }
            }

            SocialMediaService.addSocialMedia(socialMedia)
            call.respond(HttpStatusCode.Created, socialMedia)
        }
    }
}