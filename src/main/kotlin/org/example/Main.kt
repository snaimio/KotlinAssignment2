package org.example

import org.example.characters.*
import org.example.interfaces.Attackable

/**
 * ============================================================
 * KOTLIN ASSIGNMENT 2
 * ============================================================
 *
 * Challenge A: OOP Application: Fantasy Warriors
 *
 * OOP Concepts Demonstrated:
 * - Superclass: GameCharacter (in GameCharacter.kt)
 * - Subclass 1: Warrior (in Warrior.kt)
 * - Subclass 2: Mage (in Mage.kt)
 * - Interface: Attackable (in Attackable.kt)
 * - Inheritance: Warrior and Mage extend GameCharacter
 * - Polymorphism: Overridden makeSound() and info() methods
 * - Constructors: Primary constructors with parameters
 * - 2 Objects: warrior (Conan), mage (Gandalf)
 *
 * Challenge B: Anagram Checker
 * - String Function: areAnagrams()
 * - Features: Case-insensitive, ignores spaces/punctuation
 * ============================================================
 */

fun main() {
    // ============================================================
    // HEADER
    // ============================================================
    println()
    println("=".repeat(35))
    println("🔮  FANTASY WARRIORS")
    println("📚  Kotlin Assignment 2")
    println("=".repeat(35))
    println()

    // ============================================================
    // CHALLENGE A: OOP APPLICATION
    // ============================================================
    println("📝  CHALLENGE A: OOP APPLICATION")
    println("-".repeat(35))
    println()

    // Create 2 objects/instances
    val warrior = Warrior("Conan", 150, 10, "Sword", 12)
    val mage = Mage("Gandalf", 80, 12, "Fireball", 35)

    // === WARRIOR ===
    println("⚔️  WARRIOR: ${warrior.name}")
    println("─".repeat(35))
    warrior.info()
    println()
    warrior.makeSound()
    println()
    println("⚡  Combat Actions:")
    println("─".repeat(35))
    warrior.attack("🐉 Dragon")
    warrior.defend()
    warrior.specialMove()
    println()
    println()

    // === MAGE ===
    println("🔮  MAGE: ${mage.name}")
    println("─".repeat(35))
    mage.info()
    println()
    mage.makeSound()
    println()
    println("⚡  Combat Actions:")
    println("─".repeat(35))
    mage.attack("🐉 Dragon")
    mage.defend()
    mage.specialMove()
    println()
    println()

    // === POLYMORPHISM DEMONSTRATION ===
    println("🎯  POLYMORPHISM DEMONSTRATION")
    println("-".repeat(35))
    println()
    println("  Same method call → Different behavior:")
    println()

    val characters: List<GameCharacter> = listOf(warrior, mage)
    characters.forEach { character ->
        val className = character.javaClass.simpleName
        println("  👤  ${character.name} ($className):")
        character.makeSound()
        println()
    }

    // === INTERFACE DEMONSTRATION ===
    println("🎯  INTERFACE DEMONSTRATION")
    println("-".repeat(35))
    println()
    println("  All Attackable objects can attack:")
    println()

    val attackers: List<Attackable> = listOf(warrior, mage)
    attackers.forEach { attacker ->
        val name = if (attacker is Warrior) "⚔️ Warrior" else "🔮 Mage"
        println("  🎯  $name:")
        attacker.attack("👹 Evil Lord")
        println()
    }
    println()

    // ============================================================
    // CHALLENGE B: STRING FUNCTION - ANAGRAM CHECKER
    // ============================================================
    println("📝  CHALLENGE B: STRING FUNCTION - ANAGRAM CHECKER")
    println("-".repeat(45))
    println()
    println("  🔍  Anagram Test Results:")
    println()

    // Funny anagram examples
    val tests = listOf(
        "schoolmaster" to "the classroom",
        "dormitory" to "dirty room",
        "eleven plus two" to "twelve plus one",
        "debit card" to "bad credit",
        "a gentleman" to "elegant man",
        "hello" to "world",
        "kotlin" to "python",
        "apple" to "orange",
        "java" to "kotlin"
    )

    tests.forEachIndexed { index, (word1, word2) ->
        val isAnagram = areAnagrams(word1, word2)
        val icon = if (isAnagram) "✔️" else "✖️"
        val result = if (isAnagram) "✅ ARE anagrams" else "❌ ARE NOT anagrams"
        println("  $icon  \"$word1\" ↔ \"$word2\"")
        println("     → $result")
        println()
    }

    // ============================================================
    // FOOTER
    // ============================================================
    println()
    println("=".repeat(35))
    println("  🏁 KotlinAssignment2 Complete! ")
    println("=".repeat(35))
    println()
    println()
}

// ============================================================
// CHALLENGE B: STRING FUNCTION - ANAGRAM CHECKER
// ============================================================

/**
 * Checks if two strings are anagrams.
 * Anagrams are words or phrases that contain the same letters.
 *
 * Features:
 * - Ignores case
 * - Ignores spaces and punctuation
 * - Works with phrases
 *
 * @param str1 First string
 * @param str2 Second string
 * @return true if anagrams, false otherwise
 */
fun areAnagrams(str1: String, str2: String): Boolean {
    val clean1 = str1.filter { it.isLetter() }.lowercase().toCharArray().sorted()
    val clean2 = str2.filter { it.isLetter() }.lowercase().toCharArray().sorted()
    return clean1 == clean2
}