package io.access.kotlintraining

import org.junit.Test
import kotlin.test.assertEquals

class SampleTest {
    @Test
    fun testWelcome() {
        welcome()

        // Example of test
        val expected = 1
        val actual = 1
        assertEquals(expected, actual, "[want] $expected [got] $actual")
    }

    @Test
    fun testHello() {
        println("Hello world!")
    }
}