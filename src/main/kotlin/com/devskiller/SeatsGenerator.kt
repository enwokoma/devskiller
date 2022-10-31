package com.devskiller

import java.util.*


class SeatsGenerator {

    /*fun createSeats(rows: Int, seatsInRow: Int, firstRowNumber: Int): List<String> {
        return emptyList()
    }*/

    fun createSeats(rows: Int, seatsInRow: Int, firstRowNumber: Int): Set<Seat>? {
        var firstRowNumber = firstRowNumber
        val seats: HashSet<Seat> = HashSet<Seat>()
        val letters = charArrayOf(
            'A',
            'B',
            'C',
            'D',
            'E',
            'F',
            'G',
            'H',
            'I',
            'J',
            'K',
            'L',
            'M',
            'N',
            'O',
            'P',
            'Q',
            'R',
            'S',
            'T',
            'U',
            'V',
            'W',
            'X',
            'Y',
            'Z'
        )
        for (row in 1..rows) {
            for (rowSeat in 0 until seatsInRow) {
                val seat = Seat(String.format("%s%s", firstRowNumber, letters[rowSeat]))
                seats.add(seat)
            }
            firstRowNumber++
        }
        return seats
    }
}