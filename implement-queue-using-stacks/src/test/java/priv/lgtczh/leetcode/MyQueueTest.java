package priv.lgtczh.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyQueueTest {

    @Test
    public void should_implement_queue_using_stacks() {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        assertEquals(1, queue.peek());
        assertEquals(1, queue.pop());
        assertFalse(queue.empty());
        queue.push(3);
        assertEquals(2, queue.pop());
        assertEquals(3, queue.pop());
        assertTrue(queue.empty());
    }

    @Test
    public void should_handle_empty_queue() {
        MyQueue queue = new MyQueue();
        assertTrue(queue.empty());
    }

    @Test
    public void should_handle_single_element() {
        MyQueue queue = new MyQueue();
        queue.push(1);
        assertEquals(1, queue.peek());
        assertEquals(1, queue.pop());
        assertTrue(queue.empty());
    }
}