import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    private Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack(2);
    }

    @Test
    public void newlyCreatedStack_ShouldBeEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void afterOnePush_SizeShouldBeOne() {
        stack.push(1);
        assertEquals(1, stack.getSize());
        assertFalse(stack.isEmpty());
    }

    @Test
    public void afterOnePushAndOnePop_SizeShouldBeZero() {
        stack.push(1);
        stack.pop();
        assertEquals(0, stack.getSize());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void whenPushedPastLimit_StackOverflowException() {
        stack.push(1);
        stack.push(2);
        assertThrows(Stack.Overflow.class, () -> stack.push(3));
    }

    @Test
    public void whenEmptyStackPopped_StackUnderflowException() {
        assertThrows(Stack.Underflow.class, () -> stack.pop());
    }

    @Test
    public void whenPopLastLimit_StackUnderflowException() {
        stack.push(1);
        stack.pop();
        assertThrows(Stack.Underflow.class, () -> stack.pop());
    }

    @Test
    public void whenOneIsPushed_OneIsPopped() {
        stack.push(1);
        assertEquals(1, stack.pop());
    }

    @Test
    public void whenOneAndTwoArePushed_TwoAndOneArePopped() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }
}
