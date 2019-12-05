package at.fh.swengb.kotlinandclasses

import android.util.Log

open class LivingThing (val name: String, var health: Int, val attackStrength: Int, var isAlive: Boolean) {
    open fun attack(victim: LivingThing) {
        Log.i("LivingThing", "Attacking ${victim.name} with Strength: ${attackStrength}")
        victim.takeDamageFrom(this, attackStrength)
    }

    fun takeDamageFrom(attacker: LivingThing, damage: Int) {
        if (!isAlive) {
            Log.i("LivingThing", "Stop, ${name} is already dead")
            return
        }
        Log.i("LivingThing", "${name} is taking ${damage} damage from ${attacker.name}" )
        this.health = this.health - damage
        Log.i("LivingThing", "${name} has ${health} health left")

        if (this.health <= 0) {
            this.isAlive = false
            Log.i ("LivingThing", "${name} is dead")

        }
    }

    //if ()
}