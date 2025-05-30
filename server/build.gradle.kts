plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.ktor)
    application
    kotlin("plugin.serialization") version "2.1.0"
}

group = "com.bharath.portfolio"
version = "1.0.0"
application {
    mainClass.set("com.bharath.portfolio.ApplicationKt")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=${extra["io.ktor.development"] ?: "false"}")
}

dependencies {
    implementation(projects.shared)
    implementation(libs.logback)
    implementation(libs.ktor.server.core)
    implementation(libs.ktor.server.netty)
    implementation(libs.ktor.server.negotiation)
    implementation(libs.ktor.json.serialization)
    implementation(libs.ktor.cbor.serialization)
    implementation(libs.ktor.protobuf.serialization)
    testImplementation(libs.ktor.server.tests)
    testImplementation(libs.kotlin.test.junit)
}