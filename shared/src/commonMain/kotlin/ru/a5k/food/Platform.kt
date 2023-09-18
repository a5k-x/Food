package ru.a5k.food

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform