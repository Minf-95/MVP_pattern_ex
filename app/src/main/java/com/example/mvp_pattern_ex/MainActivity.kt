package com.example.mvp_pattern_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvp_pattern_ex.Presenter.Contract
import com.example.mvp_pattern_ex.Presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),Contract.View {
    val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        init()

    }

    fun init(){
        sum.setOnClickListener {
            presenter.addNum(Integer.parseInt(number1.text.toString()),
                Integer.parseInt(number2.text.toString()))
        }
    }

    override fun showResult(answer: Int) {
        result.setText(answer.toString())
    }
}