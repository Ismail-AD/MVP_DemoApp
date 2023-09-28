package com.acdev.mvp_demoapp
// Act as a mediator between the View and the Model, it will have instances of both (V & M)
// for the interaction and to update the View according to the changes addressed by Model.

class Presenter(private val pView: Contract.View) : Contract.Presenter {
    var presenterModel: Contract.Model = Model()
    override fun onClickCheckEligible(name: String, age: String) {
        if (presenterModel.checkEligibility(name, age)) {
            pView.showToastForEligible()
        } else {
            pView.showToastForNotEligible()
        }
    }

}