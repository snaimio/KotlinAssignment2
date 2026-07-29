package org.example.characters

/**
 * GameCharacter Superclass
 * Base class for all game characters.
 *
 * @property name The character's name
 * @property health The character's health points
 * @property level The character's level
 */
open class GameCharacter(
    val name: String,
    var health: Int,
    val level: Int
) {
    /**
     * Makes the character's sound.
     * Open method - can be overridden by subclasses.
     * This demonstrates polymorphism.
     */
    open fun makeSound() {
        println("$name makes a sound.")
    }

    /**
     * Displays character information.
     * Open method - can be overridden by subclasses.
     * This demonstrates polymorphism.
     */
    open fun info() {
        println("$name - Health: $health, Level: $level")
    }
}