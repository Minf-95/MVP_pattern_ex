package com.example.mvp_pattern_ex.Presenter

import com.example.mvp_pattern_ex.Model.itemData_Model

class MainPresenter(view:Contract.View):Contract.Presenter{
    var view:Contract.View?=null

    init {
        this.view = view
        var mainModel = itemData_Model(this)
    }


    override fun addNum(num1: Int, num2: Int) {
        view?.showResult(num1 + num2)
    }


}