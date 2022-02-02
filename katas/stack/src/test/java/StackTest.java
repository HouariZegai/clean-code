import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    private Stack stack;

    @BeforeEach
    void setUp() {
        stack = BoundedStack.getInstance(2);
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
    public void whenPushedPastLimit_ShouldThrowOverflow() {
        stack.push(1);
        stack.push(2);
        assertThrows(BoundedStack.Overflow.class, () -> stack.push(3));
    }

    @Test
    public void whenEmptyStackPopped_ShouldThrowUnderflow() {
        assertThrows(BoundedStack.Underflow.class, () -> stack.pop());
    }

    @Test
    public void whenPopLastLimit_ShouldThrowUnderflow() {
        stack.push(1);
        stack.pop();
        assertThrows(BoundedStack.Underflow.class, () -> stack.pop());
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

    @Test
    public void whenCreatingStackWithNegativeCapacity_ShouldThrowIllegalCapacity() {
        assertThrows(BoundedStack.IllegalCapacity.class, () -> BoundedStack.getInstance(-1));
    }

    @Test
    public void whenCreatingStackWithZeroCapacity_PushShouldThrowOverflow() {
        Stack stack = BoundedStack.getInstance(0);
        assertThrows(BoundedStack.Overflow.class, () -> stack.push(1));
    }

    @Test
    public void whenCreatingStackWithZeroCapacity_PopShouldThrowUnderflow() {
        Stack stack = BoundedStack.getInstance(0);
        assertThrows(BoundedStack.Underflow.class, () -> stack.pop());
    }

    @Test
    public void whenOneIsPushed_OneIsOnTop() {
        stack.push(1);
        assertEquals(1, stack.top());
    }

    @Test
    public void whenStackIsEmpty_ShouldThrowEmpty() {
        assertThrows(Stack.Empty.class, () -> stack.top());
    }

    @Test
    public void whenCreatingStackWithZeroCapacity_TopShouldThrowEmpty() {
        Stack stack = BoundedStack.getInstance(0);
        assertThrows(Stack.Empty.class, () -> stack.top());
    }

    @Test
    public void givenStackWithOneTwoPushed_FindOne() {
        stack.push(1);
        stack.push(2);
        assertEquals(1, stack.find(1));
        assertEquals(0, stack.find(2));
    }

    @Test
    public void givenStackWithNo1_Find1ShouldReturnReturnNegativeOne() {
        assertEquals(-1, stack.find(1));
    }
}
