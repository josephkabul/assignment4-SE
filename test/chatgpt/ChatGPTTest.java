package chatgpt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChatGPTTest {

    @Test
    void testPushAndPop() {
        Stack stack = new Stack(3);
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.pop());
        assertEquals(1, stack.size());
    }

    @Test
    void testPeek() {
        Stack stack = new Stack(5);
        stack.push(5);
        assertEquals(5, stack.peek());
        assertFalse(stack.isEmpty());
    }

    @Test
    void testIsFullAndIsEmpty() {
        Stack stack = new Stack(2);
        assertTrue(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        assertTrue(stack.isFull());
    }

    @Test
    void testPopThrowsWhenEmpty() {
        Stack stack = new Stack(2);
        Exception e = assertThrows(IllegalStateException.class, stack::pop);
        assertEquals("Stack is empty", e.getMessage());
    }

    @Test
    void testPushThrowsWhenFull() {
        Stack stack = new Stack(1);
        stack.push(10);
        Exception e = assertThrows(IllegalStateException.class, () -> stack.push(20));
        assertEquals("Stack is full", e.getMessage());
    }
}
