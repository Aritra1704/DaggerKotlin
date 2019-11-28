package com.example.daggertest.modules.data

class Warrior(private var weapon: Weapon) { // Example of Constructor injection
    // If a object has public setter methods for setting up data that is field injection
//    private var weapon: Weapon = Weapon("Sword")

    fun attack() {
        println("Attacked with ${weapon.description}")
    }
}