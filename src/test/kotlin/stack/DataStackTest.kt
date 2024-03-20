package stack

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class DataStackTest {

    @Test
    fun `it creates a class with an empty stack`() {
        val underTest = DataStack()
        val expected = mutableListOf<Any>()
        val result = underTest.stack
        assertEquals(expected, result)
    }

    @Test
    fun `it adds an item to the stack`() {
        val underTest = DataStack()
        underTest.push("1")
        val expected = mutableListOf("1")
        val result = underTest.stack
        assertEquals(expected, result)
    }

    @Test
    fun `it adds multiple items to the stack in order`() {
        val underTest = DataStack()
        underTest.push("1")
        underTest.push("2")
        val expected = mutableListOf("1", "2")
        val result = underTest.stack
        assertEquals(expected, result)
    }

    @Test
    fun `it removes the most recent item from the stack with pop`() {
        val underTest = DataStack()
        underTest.push("1")
        underTest.push("2")
        underTest.push("3")
        underTest.push("4")
        underTest.pop()
        val expected = mutableListOf("1", "2", "3")
        val result = underTest.stack
        assertEquals(expected, result)
    }

    @Test
    fun `it returns the most recent item as its removed from the stack with pop`() {
        val underTest = DataStack()
        underTest.push("1")
        underTest.push("2")
        val expected = "2"
        val result = underTest.pop()
        assertEquals(expected, result)
    }

    @Test
    fun `it returns the last element of the stack when peek is called`() {
        val underTest = DataStack()
        underTest.push("1")
        underTest.push("2")
        underTest.push("3")
        underTest.push("4")
        val expected = "4"
        val result = underTest.peek()
        assertEquals(expected, result)
    }

    @Test
    fun `it returns null when peeking an empty stack`() {
        val underTest = DataStack()
        val expected = null
        val result = underTest.peek()
        assertEquals(expected, result)
    }

    @Test
    fun `it returns null when popping an empty stack`() {
        val underTest = DataStack()
        val expected = null
        val result = underTest.pop()
        assertEquals(expected, result)
    }
}