package alejandro.imilvet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class DatosPacientes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos_pacientes)

        /** Inform the user that the database is being accesed */
        val toastMessage = "Accediendo a la Base de Datos"
        val toast = Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT)
        toast.show()
    }

    /** Called when the user taps the BackToMain button */
    fun goToMain( view: View ) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}