package com.example.mytestapp

import org.junit.Assert.*
import org.junit.Test

class MethodsTest {

    @Test
    fun methods_sum_validate_equals() {
        assertEquals(5, Methods().sum(2,3))
    }

    @Test
    fun methods_sum_validate_notEquals() {
        assertNotEquals(5, Methods().sum(3,3))
    }

    @Test
    fun methods_divisionByZero_assertTrue() {
        assertTrue(Methods().divisionByZero(0,3))
    }

    @Test
    fun methods_sameOrNull_assertNull() {
        assertNull(Methods().sameOrNull(2,3))
    }

    @Test
    fun methods_sameOrNull_assertSame() {
        assertSame(3, Methods().sameOrNull(3,3))
    }

    @Test
    fun methods_sameOrNull_assertNotNull() {
        assertNotNull(Methods().sameOrNull(3,3))
    }


}