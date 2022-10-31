package com.devskiller

import java.util.*


//data class Flight(val flightNumber: String, val origin: String, val destination: String)

class FlightManager {
    var flights: Set<Flight> = HashSet()

    fun addNewFlight(flight: Flight): Boolean {
       return flights.add(flight)
    }

    fun findFlightsBetween(origin: String, destination: String, directionSensitive: Boolean): List<Flight> {
        return emptyList()
    }
}