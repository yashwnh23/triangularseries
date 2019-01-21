package yashwanth.triangularseries

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById(R.id.button) as Button
        val edit1=findViewById(R.id.editText)as EditText
        val edit2=findViewById(R.id.editText1)as EditText
        val edit3=findViewById(R.id.editText2)as EditText
        val textview=findViewById(R.id.textView)as TextView
        button.setOnClickListener {
            val rand=(1..3).shuffled().first()
            if (rand==1)
            textview.setText("Final Team is ${edit1.text}")
            if (rand==2)
                textview.setText("Final Team is ${edit2.text}")

            if (rand==3)
                textview.setText("Final Team is ${edit3.text}")
        }

    }
}
