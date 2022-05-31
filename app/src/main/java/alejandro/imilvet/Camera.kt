package alejandro.imilvet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Camera : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camara)
    }

    /**
     * Opens the device's camera
     */
    fun openCam( view: View ) {
        // TODO
    }

    /**
     * Brings forward the main activity
     */
    fun goToMain( view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}