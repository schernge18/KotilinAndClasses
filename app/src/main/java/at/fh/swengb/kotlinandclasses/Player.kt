package at.fh.swengb.kotlinandclasses

class Player (val level: Int,
              val experience: Int,
              name: String,
              health: Int,
              attackStrength: Int,
              isAlive: Boolean): LivingThing(name, health, attackStrength, isAlive) {

}