package com.acdev.mvp_demoapp
// Communication between the View-Presenter and Presenter-Model is based on the use of interfaces (also known as a Contract).
interface Contract {
    interface View{
        fun showToastForEligible()
        fun showToastForNotEligible()
    }
    interface Model{
        fun checkEligibility(name:String,age:String):Boolean
    }
    interface Presenter{
        fun onClickCheckEligible(name:String,age:String)
    }
}