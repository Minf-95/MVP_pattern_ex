package com.example.mvp_pattern_ex.Model
import android.util.Log

import com.example.mvp_pattern_ex.Presenter.Contract

class itemData_Model(presenter:Contract.Presenter) {

    fun saveData(data:Int){
        Log.d("saveData", data.toString())
    }
}