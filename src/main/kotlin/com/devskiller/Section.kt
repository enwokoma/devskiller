package com.devskiller

/**
 * Created by Emmanuel Nwokoma (Gigabyte) on 10/31/2022
 **/
internal class Section(seats: Set<Seat>) {
    private val seats: Set<Seat>
    @Throws(NoAvailableSeatException::class)
    fun reserveSeat(): Seat {
        val seat = seats.stream().filter { obj: Seat -> obj.isAvailable() }.findFirst()
            .orElseThrow { NoAvailableSeatException() }
        seat.reserve()
        return seat
    }

    fun countAvailableSeats(): Long {
        return seats.stream().filter { obj: Seat -> obj.isAvailable() }.count()
    }

    init {
        this.seats = seats
    }
}