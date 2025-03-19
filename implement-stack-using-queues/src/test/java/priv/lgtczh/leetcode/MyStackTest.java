package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

    @Test
    public void should_implement_stack_using_queues() {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.top());
        assertEquals(2, stack.pop());
        assertFalse(stack.empty());
        stack.push(3);
        assertEquals(3, stack.pop());
        assertEquals(1, stack.pop());
        assertTrue(stack.empty());
    }

    @Test
    public void should_handle_empty_stack() {
        MyStack stack = new MyStack();
        assertTrue(stack.empty());
    }

    @Test
    public void should_handle_single_element() {
        MyStack stack = new MyStack();
        stack.push(1);
        assertEquals(1, stack.top());
        assertEquals(1, stack.pop());
        assertTrue(stack.empty());
    }
}