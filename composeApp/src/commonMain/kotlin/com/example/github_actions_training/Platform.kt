package com.example.github_actions_training

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform