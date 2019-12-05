package at.fh.swengb.kotlinandclasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = listOf(Circle(5.0), Rectangle(2.5, 4.5), Square(6.0))

        for (item in list) {
            Log.v("Area", "${item.javaClass.canonicalName} ${item.calculateArea()}")
        }

        val player = Player(4,5,"Emil", 30, 20, true)
        val lion = Lion("Mufasa", 100, 3, true)
        val dragon = Dragon("Rhaegal", 200, 5, true)


        //player.attack(lion)
        //player.attack(lion)
        //player.attack(lion)
        //player.attack(lion)
        //player.attack(dragon)
        dragon.attack(player)
    }
}
