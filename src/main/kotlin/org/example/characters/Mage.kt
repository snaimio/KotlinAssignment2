package org.example.characters

import org.example.interfaces.Attackable

/**
 * Mage Subclass
 *
 * Represents a mage character.
 * Demonstrates:
 * - Inheritance (extends GameCharacter)
 * - Interface implementation (Attackable)
 * - Polymorphism (method overriding)
 * - Constructor with additional property
 *
 * @property spellbook The mage's primary spell
 * @property mana The mage's mana pool
 */
class Mage(
    name: String,
    health: Int,
    level: Int,
    val spellbook: String,
    val mana: Int
) : GameCharacter(name, health, level), Attackable {

    /**
     * Mage's unique sound.
     * Overrides the superclass method.
     * Demonstrates polymorphism.
     */
    override fun makeSound() {
        println("$name chants: BY THE POWER OF MAGIC! 🧙")
    }

    /**
     * Displays mage-specific information.
     * Calls super.info() first, then adds spellbook and mana.
     */
    override fun info() {
        super.info()
        println("  Spellbook: $spellbook, Mana: $mana")
    }

    /**
     * Mage attacks with their spellbook.
     * Damage = mana / 2
     */
    override fun attack(target: String) {
        println("🔮 $name casts $spellbook at $target! (${mana / 2} damage)")
    }

    /**
     * Mage defends with magic barrier.
     * Blocks mana / 3 damage.
     */
    override fun defend() {
        println("✨ $name creates magic barrier! (-${mana / 3} damage)")
    }

    /**
     * Mage's special move.
     * METEOR SHOWER deals mana * 2 damage.
     */
    override fun specialMove() {
        println("🌋 $name uses METEOR SHOWER! (${mana * 2} damage)")
    }
}