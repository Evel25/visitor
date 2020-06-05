package agh.softdev.visitor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDestinatios.setOnClickListener(View.OnClickListener {
            val destinations = Intent(this,Distinations::class.java)
            startActivity(destinations);
        })
    }
}
