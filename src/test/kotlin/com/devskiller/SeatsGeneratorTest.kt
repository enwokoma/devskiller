package com.devskiller

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class SeatsGeneratorTest {

    private val seatsGenerator = SeatsGenerator()

    @Test
    fun `basic test`() {
        val seats = seatsGenerator.createSeats(2, 4, 1)
        assertThat(seats).isEqualTo(listOf("1A", "1B", "1C", "1D", "2A", "2B", "2C", "2D"))
    }
}