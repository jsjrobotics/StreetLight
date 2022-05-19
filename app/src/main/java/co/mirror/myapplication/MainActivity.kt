package co.mirror.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.ImageView
import io.reactivex.Observable
import java.util.concurrent.TimeUnit

/**
 * When the view is first shown have it display the red light on and all others off
 * After 7 seconds display the green light on and all others off.
 * 5 seconds after changing to green, display the yellow light on and all others off
 * 3 seconds after changing to yellow, display the red light on and all others off
 * Repeat the above process forever
 */

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

    private fun timerExamples() {
        val disposable = Observable.timer(1L, TimeUnit.SECONDS).subscribe({/* Do Something*/}, { Log.e("ErrorTag", "Error $it")})
        val disposable2 = Observable.interval(1L, TimeUnit.SECONDS).subscribe({/* Do Something*/}, { Log.e("ErrorTag", "Error $it")})
        Handler().postDelayed({/* Do Something*/}, 1000)
    }
}
