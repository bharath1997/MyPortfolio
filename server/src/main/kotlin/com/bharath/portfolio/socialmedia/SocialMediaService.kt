package com.bharath.portfolio.socialmedia

object SocialMediaService {
    private val socialMediaList = mutableListOf(SocialMedia(
        name = "LinkedIn",
        link = "www.linkedin.com/in/bharathvenkatesan",
        icon = "linkedIn"
    ))
    fun getSocialMediaList(): List<SocialMedia> = socialMediaList

    fun addSocialMedia(socialMedia: SocialMedia) {
        socialMediaList.add(socialMedia)
    }
}