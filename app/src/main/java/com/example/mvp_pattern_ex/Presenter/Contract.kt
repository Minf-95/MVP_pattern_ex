package com.example.mvp_pattern_ex.Presenter

//인터페이스 선언
interface Contract {

    //상속받은 클래스에서 구현해야 하는 선언만 있는 메소드
    interface View {
        fun showResult(answer:Int) //값을 보여줄 View 메소드 선언
    }

    interface Presenter {
        fun addNum(num1:Int, num2:Int)
    }


}
