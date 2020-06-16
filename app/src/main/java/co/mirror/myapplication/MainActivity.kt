package co.mirror.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private val redOff = "#22FF0000"
    private val redOn  = "#FFFF0000"
    private val yellowOff = "#22FFFF00"
    private val yellowOn  = "#FFFFFF00"
    private val greenOff = "#2200FF00"
    private val greenOn  = "#FF00FF00"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<ImageView>(R.id.red).setColorFilter(Color.parseColor(redOff))
        findViewById<ImageView>(R.id.yellow).setColorFilter(Color.parseColor(yellowOff))
        findViewById<ImageView>(R.id.green).setColorFilter(Color.parseColor(greenOff))
    }
}
