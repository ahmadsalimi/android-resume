package edu.ahmadsalimi.myresume

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import edu.ahmadsalimi.myresume.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val callMeButton = binding.callMe
        callMeButton.setOnClickListener {
            Toast.makeText(this, "Calling Me!", Toast.LENGTH_LONG).show()
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:${getString(R.string.phone_number)}")
            startActivity(intent)
        }
    }
}