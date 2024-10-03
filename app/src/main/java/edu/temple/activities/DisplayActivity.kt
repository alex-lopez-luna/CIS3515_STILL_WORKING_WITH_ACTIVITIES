package edu.temple.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts

class DisplayActivity : AppCompatActivity() {

    // TODO Step 1: Launch TextSizeActivity when button clicked to allow selection of text size value


    // TODO Step 3: Use returned value for lyricsDisplayTextView text size

    private lateinit var lyricsDisplayTextView: TextView
    private lateinit var textSizeSelectorButton: Button

    val launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        if (it.resultCode > 0) {
            lyricsDisplayTextView.textSize = it.resultCode.toFloat()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        lyricsDisplayTextView = findViewById(R.id.lyricsDisplayTextView)
        textSizeSelectorButton = findViewById<Button?>(R.id.textSizeSelectorButton)

        textSizeSelectorButton.setOnClickListener { launcher.launch(textSizeSelectorButton, ) }















        textSizeSelectorButton.setOnClickListener {


            val intent = Intent(this@DisplayActivity, TextSizeActivity::class.java)
            intent.putExtra("key", "lyricsDisplayTextView")
            startActivity(intent)
            lyricsDisplayTextView




            setResult(RESULT_OK, Intent().putExtra(RESULT_KEY, lyricsDisplayTextView))
            finish()




        }





    }


}


