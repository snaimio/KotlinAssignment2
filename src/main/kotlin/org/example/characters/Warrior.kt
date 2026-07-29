package org.example.characters

import org.example.interfaces.Attackable

/**
 * Warrior Subclass
 *
 * Represents a warrior character.
 * Demonstrates:
 * - Inheritance (extends GameCharacter)
 * - Interface implementation (Attackable)
 * - Polymorphism (method overriding)
 * - Constructor with additional property
 *
 * @property weapon The warrior's weapon
 * @property strength The warrior's strength stat
 */
class Warrior(
    name: String,
    health: Int,
    level: Int,
    val weapon: String,
    val strength: Int
) : GameCharacter(name, health, level), Attackable {

    /**
     * Warrior's unique sound.
     * Overrides the superclass method.
     * Demonstrates polymorphism.
     */
    override fun makeSound() {
        println("$name roars: FOR GLORY! 🗡️")
    }

    /**
     * Displays warrior-specific information.
     * Calls super.info() first, then adds weapon and strength.
     */
    override fun info() {
        super.info()
        println("  Weapon: $weapon, Strength: $strength")
    }

    /**
     * Warrior attacks with their weapon.
     * Damage = strength * 2
     */
    override fun attack(target: String) {
        println("⚔️ $name attacks $target with $weapon! (${strength * 2} damage)")
    }

    /**
     * Warrior defends with shield.
     * Blocks strength amount of damage.
     */
    override fun defend() {
        println("🛡️ $name blocks with shield! (-$strength damage)")
    }

    /**
     * Warrior's special move.
     * BERSERKER RAGE deals strength * 4 damage.
     */
    override fun specialMove() {
        println("💥 $name uses BERSERKER RAGE! (${strength * 4} damage)")
    }
}