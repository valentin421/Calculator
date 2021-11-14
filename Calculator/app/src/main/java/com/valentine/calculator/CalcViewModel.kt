package com.valentine.calculator

import androidx.lifecycle.ViewModel


class CalcViewModel : ViewModel() {
    var input = ""
    var result = ""
    var res = ""

    fun putInput(string: String) {
        input = string
        res += string
    }
}