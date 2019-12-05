package at.fh.swengb.kotlinandclasses

import kotlin.math.PI
import kotlin.math.pow

class Circle (private val r: Double): Shape {
    override fun calculateArea(): Double {
        return PI * r.pow(2)
    }
}