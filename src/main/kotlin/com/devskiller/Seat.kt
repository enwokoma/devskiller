package com.devskiller

/**
 * Created by Emmanuel Nwokoma (Gigabyte) on 10/31/2022
 **/
class Seat(number: String) {
    private val number: String
    private var status = Status.AVAILABLE
    fun getNumber(): String {
        return number
    }

    fun getStatus(): Status {
        return status
    }

    fun isAvailable(): Boolean {
        return status == Status.AVAILABLE
    }

    fun reserve() {
        status = Status.RESERVED
    }

    enum class Status {
        AVAILABLE, RESERVED
    }

    init {
        this.number = number
    }
}