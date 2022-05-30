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

        /* Create media palyer and pass the audio file to play */
        mp = MediaPlayer.create(this, R.raw.background_music)
    }

    override fun onResume() {
        super.onResume()
        /* Start playing the audio track every time the app regains focus */
        mp.start()
    }

    override fun onStop() {
        super.onStop()
        /* Stop the music everytime the app is stopped */
        mp.stop()
        mp.release()
    }

    /**
     * Called when the user taps the Pacientes button
     */
    fun goToPacientes( view: View ) {
        val intent = Intent(this, DatosPacientes::class.java)
        startActivity(intent)
    }

    /**
     * Called when the user taps the Camara button 
     */
    fun goToCamara( view: View ) {
        val intent = Intent(this, Camara::class.java)
        startActivity(intent)
    }

    /**
     * Called when the user taps the Galeria button 
     */
    fun goToGaleria( view: View ) {
        val intent = Intent(this, Galeria::class.java)
        startActivity(intent)
    }

    /** 
     * Called when the user taps the MusicaOn button 
     */
    fun turnOnMusic( view: View ) {
        if (!mp.isPlaying) {
            /** mp must be prepared as it may have been released before */
            mp.prepare()
            mp.start()
        }
    }

    /** 
     * Called when the user taps the MusicaOff button 
     */
    fun turnOffMusic( view: View ) {
        if (mp.isPlaying) mp.stop()
    }

    /** 
     * Declares the media player as a companion object so it may be accesed by the class' functions 
     */
    companion object {
        private lateinit var mp: MediaPlayer
    }
}
