package org.example.interfaces

/**
 * Attackable Interface
 * Defines combat behavior for game characters.
 */
interface Attackable {
    /**
     * Attack a target.
     * @param target The target to attack
     */
    fun attack(target: String)

    /**
     * Defend against attacks.
     */
    fun defend()

    /**
     * Perform a special unique move.
     */
    fun specialMove()
}