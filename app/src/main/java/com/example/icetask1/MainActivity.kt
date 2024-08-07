package com.example.icetask1

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var input1:EditText
    lateinit var input2:EditText
    lateinit var Add:Button
    lateinit var Sub:Button
    lateinit var divide:Button
    lateinit var multiply:Button
    lateinit var exit:Button
    lateinit var Result:TextView
    lateinit var clear:Button
    lateinit var credits:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //connect id
        input1 = findViewById(R.id.edNumber1)
        input2 = findViewById(R.id.edNumber2)
        Add = findViewById(R.id.btnAdd)
        Sub = findViewById(R.id.btnSub)
        divide = findViewById(R.id.btnDivide)
        multiply = findViewById(R.id.btnMultiply)
        exit = findViewById(R.id.btnExit)
        Result = findViewById(R.id.tvResults)

        clear = findViewById(R.id.btnClear)
        credits = findViewById(R.id.btnCredits)


        //add button
        Add.setOnClickListener{
            //code for add
            var answer = input1.text.toString().toInt() + input2.text.toString().toInt()

            //code for moving to display
            Result.text = input1.text.toString().plus("+")
                .plus(input2.text.toString()).plus("=")
                .plus(answer)

        }

        //multiply button
        multiply.setOnClickListener {
            //code for multiply
            var answer = input1.text.toString().toInt() * input2.text.toString().toInt()

            //code for moving to display
            Result.text = input1.text.toString().plus("*")
                .plus(input2.text.toString()).plus("=")
                .plus(answer)
        }

        //division button
        divide.setOnClickListener {
            //code for division
            var answer = input1.text.toString().toInt() / input2.text.toString().toInt()

            //code for moving to display
            Result.text = input1.text.toString().plus("/")
                .plus(input2.text.toString()).plus("=")
                .plus(answer)
        }

        //exit button
        exit.setOnClickListener {
            finishAndRemoveTask()
        }

        //Sub button
       Sub.setOnClickListener{
           //code for subtraction
           var answer = input1.text.toString().toInt() - input2.text.toString().toInt()

           //code for moving to display
           Result.text = input1.text.toString().plus("-")
               .plus(input2.text.toString()).plus("=")
               .plus(answer)

       }

        //Clear button
        clear.setOnClickListener {
             Result.text = ""
        }
        credits.setOnClickListener {
            Toast.makeText(this,"Mr Magadani",Toast.LENGTH_SHORT).show()
        }



    }

    /*fun onClick(v: View?) {
        var a  = input1.text.toString().toDouble()
        var b  = input2.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
            R.id.btnAdd ->{
                result = a+b
            }
            R.id.btnSub ->{
                result = a-b
            }
            R.id.btnMultiply->{
                result = a*b
            }
            R.id.btnDivide->{
                result = a/b
            }
        }
        Result.text = "Result is $result"
    }*/
}