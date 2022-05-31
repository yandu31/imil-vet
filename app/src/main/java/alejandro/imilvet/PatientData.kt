package alejandro.imilvet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class PatientData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos_pacientes)

        /* Informs the user that the database is being accessed */
        val toastMessage = "Accessing database"
        val toast = Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT)
        toast.show()
    }

    /**
     * Brings forward the main activity
     */
    fun goToMain( view: View ) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}