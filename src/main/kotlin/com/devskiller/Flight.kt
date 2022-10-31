package com.devskiller

import java.util.*


/**
 * Created by Emmanuel Nwokoma (Gigabyte) on 10/31/2022
 **/
class Flight(
    flightNo: String,
    origin: String,
    destination: String,
    seats: Map<Grade, Set<Seat?>?>
) {
    private val flightNo: String
    private val origin: String
    private val destination: String
    private val sectionMap: MutableMap<Grade, Section> = HashMap<Grade, Section>()
    fun getFlightNo(): String {
        return flightNo
    }

    fun getOrigin(): String {
        return origin
    }

    fun getDestination(): String {
        return destination
    }

    fun countAvailableSeats(grade: Grade?): Long? {
        return sectionMap[grade]?.countAvailableSeats()
    }

    init {
        this.flightNo = flightNo
        this.origin = origin
        this.destination = destination
        seats.entries.forEach { (key, value): Map.Entry<Grade, Set<Seat?>?> ->
            sectionMap[key] = Section(value as Set<Seat>)
        }
    }
}