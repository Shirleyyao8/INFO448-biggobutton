package edu.uw.ischool.yuhuiyao.myapplication

//import android.view.View
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        var pushCount = 0;
//        val button = findViewById<Button>(R.id.button)
//        button.setOnClickListener{
//
////            Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
//            pushCount++
//            if (pushCount == 1) {
//                button.text = "You have pushed me $pushCount time!"
//            } else {
//                button.text = "You have pushed me $pushCount times!"
//            }
//        }
//    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pushCount = 0
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            pushCount++
            if (pushCount == 1) {
                button.text = getString(R.string.button_text_single)
            } else {
                button.text = getString(R.string.button_text_multiple, pushCount)
            }
        }
    }

}
