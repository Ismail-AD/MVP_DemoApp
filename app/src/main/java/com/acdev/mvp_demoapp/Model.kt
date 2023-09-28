package com.acdev.mvp_demoapp

// Manages the business logic of the application
class Model : Contract.Model{
    override fun checkEligibility(name: String, age: String):Boolean {
        if (name.isNotEmpty() && age.isNotEmpty() && age.toInt() < 25) {
            return true
        }
        return false
    }
}