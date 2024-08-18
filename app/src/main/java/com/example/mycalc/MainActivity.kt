package com.example.mycalc

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var resultTV : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultTV = findViewById(R.id.calcScreen)

    }

    override fun onClick(v: View?) {
        val eval = evaluate()
        var result = resultTV.text
        if (result.length <= 35) {
            when (v?.id) {
                R.id.button0 -> {
                    result = "$result" + "0"
                }
                R.id.button1 -> {
                    result = "$result" + "1"
                }

                R.id.button2 -> {
                    result = "$result" + "2"
                }

                R.id.button3 -> {
                    result = "$result" + "3"
                }

                R.id.button4 -> {
                    result = "$result" + "4"
                }

                R.id.button5 -> {
                    result = "$result" + "5"
                }

                R.id.button6 -> {
                    result = "$result" + "6"
                }

                R.id.button7 -> {
                    result = "$result" + "7"
                }

                R.id.button8 -> {
                    result = "$result" + "8"
                }

                R.id.button9 -> {
                    result = "$result" + "9"
                }

                R.id.buttonP -> {
                    result = "$result + "
                }

                R.id.buttonM -> {
                    result = "$result - "
                }

                R.id.buttonD -> {
                    result = "$result / "
                }

                R.id.buttonX -> {
                    result = "$result * "
                }

                R.id.buttonRightP -> {
                    result = "$result ( "
                }

                R.id.buttonLeftP -> {
                    result = "$result ) "
                }
                R.id.buttonPeriod -> {
                    result = "$result."
                }
                R.id.buttonN -> {
                    result = "$result-"
                }
            }
            resultTV.text = result
        }

        if(v?.id == R.id.buttonE)
        {
            result = eval.evalEquals(result.toString())
            resultTV.text = result
        }
        if(v?.id == R.id.buttonClear)
        {
            result = ""
            resultTV.text = result
        }
    }
}