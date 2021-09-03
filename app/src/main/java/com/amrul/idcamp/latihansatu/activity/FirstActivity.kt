package com.amrul.idcamp.latihansatu.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.amrul.idcamp.latihansatu.R
import com.amrul.idcamp.latihansatu.model.Person

class FirstActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithData: Button = findViewById(R.id.btn_move_with_data)
        btnMoveWithData.setOnClickListener(this)

        val btnDialPhone: Button = findViewById(R.id.btn_dial_number)
        btnDialPhone.setOnClickListener(this)

        val btnMoveWithResult: Button = findViewById(R.id.btn_move_with_result)
        btnMoveWithResult.setOnClickListener(this)

        val btnMoveWithObject: Button = findViewById(R.id.btn_move_with_object)
        btnMoveWithObject.setOnClickListener(this)

        val btnScrollView: Button = findViewById(R.id.btn_scroll_view)
        btnScrollView.setOnClickListener(this)

        val btnRecyclerView: Button = findViewById(R.id.btn_recycler_view)
        btnRecyclerView.setOnClickListener(this)

        val btnCalculator: Button = findViewById(R.id.btn_calculator)
        btnCalculator.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_calculator -> {
                val calculatorIntent = Intent(this@FirstActivity, MainActivity::class.java)
                startActivity(calculatorIntent)
            }

            R.id.btn_move_with_data -> {
                val moveWithDataIntent = Intent(this@FirstActivity, MoveWithDataActivity::class.java)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "DicodingAcademy Boy")
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 5)
                startActivity(moveWithDataIntent)
            }

            R.id.btn_move_with_object -> {
                val person = Person(
                    "DicodingAcademy",
                    5,
                    "academy@dicoding.com",
                    "Bandung"
                )

                val moveWithObjectIntent = Intent(this@FirstActivity, MoveWithObjectActivity::class.java)
                moveWithObjectIntent.putExtra(MoveWithObjectActivity.EXTRA_PERSON, person)
                startActivity(moveWithObjectIntent)
            }

            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@FirstActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}