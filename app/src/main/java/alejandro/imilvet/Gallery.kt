package alejandro.imilvet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Galeria : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeria)
    }

    /** Called when the user taps the BackToMain button */
    fun goToMain( view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}