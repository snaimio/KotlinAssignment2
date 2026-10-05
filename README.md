<div align="center">

# ⚔️ Fantasy Warriors RPG Battle Engine
### Kotlin Turn-Based Combat Simulation & Polymorphic Class Hierarchy

[![Kotlin](https://img.shields.io/badge/Kotlin-2.0%2B-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![OOP](https://img.shields.io/badge/OOP-Polymorphism%20%26%20Inheritance-00BCD4?style=for-the-badge)](https://kotlinlang.org/)
[![Game Dev](https://img.shields.io/badge/Simulation-Turn--Based%20Engine-E91E63?style=for-the-badge)](https://kotlinlang.org/)
[![License](https://img.shields.io/badge/License-MIT-CEFF00?style=for-the-badge&logoColor=black)](LICENSE)

<br/>

**A turn-based RPG battle engine engineered in Kotlin utilizing abstract base classes, interface contracts (`Attackable`), dynamic damage mitigation formulas, and class inheritance (`Warrior`, `Mage`).**

</div>

<br/>

---

## 📌 Technical Overview
**Fantasy Warriors** is an object-oriented combat simulation engine demonstrating polymorphism, class inheritance, abstract methods, and interface contracts in Kotlin.

### 💼 Technical Highlights
- **Abstract Base Architecture**: `GameCharacter.kt` base class enforcing encapsulation, health clamping, and combat lifecycle.
- **Polymorphic Specialization**: Concrete subclasses (`Warrior.kt`, `Mage.kt`) overriding unique attack formulas, defense calculations, and special abilities.
- **Interface Segregation**: Clean `Attackable.kt` interface contract for combat interaction.

---

## 🚀 Setup & Run
1. Clone the repository:
   ```bash
   git clone https://github.com/snaimio/fantasy-warriors-rpg-battle-engine.git
   cd fantasy-warriors-rpg-battle-engine
   ```
2. Build and run:
   ```bash
   ./gradlew run
   ```

---

## 📄 License
This project is licensed under the [MIT License](LICENSE).

---

## 👨‍💻 Author
**Sheikh Naim**  
*Mobile & Full-Stack Web Developer*  
- **LinkedIn**: [linkedin.com/in/snaimio](https://www.linkedin.com/in/snaimio)  
- **GitHub**: [@snaimio](https://github.com/snaimio)  
- **Portfolio**: [snaimio.github.io](https://snaimio.github.io)
