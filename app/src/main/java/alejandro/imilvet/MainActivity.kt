package alejandro.imilvet

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Disable dark mode compatibility. */
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        /* Create media player and pass the audio file to play */
        mp = MediaPlayer.create(this, R.raw.background_music)
    }

    override fun onResume() {
        super.onResume()
        mp.start() // Start playing the audio track every time the app regains focus
    }

    override fun onStop() {
        super.onStop()
        mp.stop() // Stop the music everytime the app is stopped
        mp.release()
    }

    /**
     * Starts the Gallery activity
     */
    fun goToPacientes( view: View ) {
        val intent = Intent(this, PatientData::class.java)
        startActivity(intent)
    }

    /**
     * Starts the Camera activity
     */
    fun goToCamara( view: View ) {
        val intent = Intent(this, Camera::class.java)
        startActivity(intent)
    }

    /**
     * Starts the Gallery activity
     */
    fun goToGaleria( view: View ) {
        val intent = Intent(this, Gallery::class.java)
        startActivity(intent)
    }

    /** 
     * Starts the background music if it is not playing
     */
    fun turnOnMusic( view: View ) {
        if (!mp.isPlaying) {
            mp.prepare() // mp must be prepared as it may have been released before
            mp.start()
        }
    }

    /** 
     * Stops the background music if it is playing
     */
    fun turnOffMusic( view: View ) {
        if (mp.isPlaying) mp.stop()
    }

    /** 
     * Declares the media player as a companion object so it can be accessed by the class' functions
     */
    companion object {
        private lateinit var mp: MediaPlayer
    }
}
