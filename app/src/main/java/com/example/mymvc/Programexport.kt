package com.example.mymvc

class Programexport {
    fun getLanguage( feature: String): String {
        return when (feature) {
            "快速" -> "C"
            "容易" -> "Python"
            "新语言" -> "Kotlin"
            "面向对象" -> "Java"
            else -> "未知"
        }
    }
}
