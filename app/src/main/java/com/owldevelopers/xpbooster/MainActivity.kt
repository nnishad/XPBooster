package com.owldevelopers.xpbooster

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        ade2.setOnClickListener(View.OnClickListener {
            var num1 =(20..140).random()
            var num2=(30..140).random()
            Ques.text= "$num1+$num2"
            val inputvalue= editText.text.toString()


            var sum = num1+num2

            if(sum.toString()==inputvalue){
                ques2.text="Success"
            }
            else{
                ques2.text="Failed"
            }
            editText.text.clear()

        })
    }

}
