package com.zoran.kobwebwebsite.utils.CustomClasses

import Resources

enum class SocialIcon(
    val icon: String,
    val link: String
) {
    Github(
        icon = Resources.Icon.GITHUB,
        link = "https://github.com/stevdza-san"
    ),
    GithubLight(
        icon = Resources.Icon.GITHUB_LIGHT,
        link = "https://github.com/stevdza-san"
    ),
    Gitlab(
        icon = Resources.Icon.GITLAB,
        link = "https://gitlab.com"
    ),
    GitlabLight(
        icon = Resources.Icon.GITLAB_LIGHT,
        link = "https://gitlab.com"
    ),
    Instagram(
        icon = Resources.Icon.INSTAGRAM,
        link = "https://www.instagram.com/stevdza_san"
    ),
    InstagramLight(
        icon = Resources.Icon.INSTAGRAM_LIGHT,
        link = "https://www.instagram.com/stevdza_san"
    )
}