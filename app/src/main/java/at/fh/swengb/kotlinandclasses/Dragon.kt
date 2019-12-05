package at.fh.swengb.kotlinandclasses

import android.util.Log

class Dragon(name: String,
             health: Int,
             attackStrength: Int,
             isAlive: Boolean):LivingThing(name, health, attackStrength, isAlive) {

    private fun breatheFire() {
        Log.i("DRAGON", "The dragon breathes fire")
    }

    override fun attack(victim: LivingThing) {
        breatheFire()
        super.attack(victim)
    }
}