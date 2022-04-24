package com.example.testapp

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}