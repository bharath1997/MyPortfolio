package com.bharath.portfolio.socialmedia

import kotlinx.serialization.Serializable

@Serializable
data class SocialMedia(
    val name:String,
    val link:String,
    val icon:String
)
