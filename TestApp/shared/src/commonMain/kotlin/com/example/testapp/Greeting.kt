package com.example.testapp

class Greeting {
    fun greeting(): String {
        return "Moin Moin, ${Platform().platform}!"
    }
}