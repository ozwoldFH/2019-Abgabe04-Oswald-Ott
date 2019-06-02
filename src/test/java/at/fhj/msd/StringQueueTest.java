package at.fhj.msd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.NoSuchElementException;

/**
 * A test class to test functionality of the StringQueue class.
 *
 * @author Clemens Ott
 * @author George Oswald
 * @version %I%, %G%
 */
public class StringQueueTest {

    public StringQueue stringQueue;

    @Before
    public void setUp() throws Exception
    {
        stringQueue = new StringQueue(4);
    }

    /**
     * tests offer function
     */
    @Test
    public void offer() {
        String str = "input";
        Assert.assertTrue(stringQueue.offer(str));
    }

    /**
     * tests offer function with max size element already reached
     */
    @Test
    public void offerFullList() {
        stringQueue.offer("1");
        stringQueue.offer("2");
        stringQueue.offer("3");
        stringQueue.offer("4");
        Assert.assertFalse(stringQueue.offer("5"));
    }

    /**
     * tests poll function.
     *
     */
    @Test
    public void poll() {
        stringQueue.offer("1");
        stringQueue.offer("2");
        stringQueue.offer("3");
        stringQueue.offer("4");

        Assert.assertEquals("1", stringQueue.poll());
        Assert.assertEquals("2", stringQueue.poll());
        Assert.assertEquals("3", stringQueue.poll());
        Assert.assertEquals("4", stringQueue.poll());
    }

    /**
     * tests poll function on empty list.
     * returned element should be null.
     *
     */
    @Test
    public void pollEmptyList() {
        Assert.assertEquals(null, stringQueue.poll());
    }

    /**
     * tests remove function.
     * returned element should be the first element.
     */
    @Test
    public void remove() {
        stringQueue.offer("1");
        stringQueue.offer("2");
        stringQueue.offer("3");
        Assert.assertEquals("1", stringQueue.remove());
        Assert.assertEquals("2", stringQueue.remove());
        Assert.assertEquals("3", stringQueue.remove());
    }

    /**
     * tests remove function.
     * an error should be returned.
     */
    @Test(expected = NoSuchElementException.class)
    public void removeEmptyList() {
        stringQueue.remove();
    }


    /**
     * tests peek function.
     * returned element should be always the first element.
     */
    @Test
    public void peek() {
        stringQueue.offer("1");
        stringQueue.offer("2");
        stringQueue.offer("3");
        Assert.assertEquals("1", stringQueue.peek());
        Assert.assertEquals("1", stringQueue.peek());
        Assert.assertEquals("1", stringQueue.peek());
    }

    /**
     * tests peek function on empty list.
     * returned element should be null.
     */
    @Test
    public void peekEmptyList() {
        Assert.assertEquals(null, stringQueue.peek());
    }

    /**
     * tests element function.
     * returned element should be always the first element.
     */
    @Test
    public void element() {
        stringQueue.offer("1");
        stringQueue.offer("2");
        stringQueue.offer("3");
        Assert.assertEquals("1", stringQueue.element());
        Assert.assertEquals("1", stringQueue.element());
        Assert.assertEquals("1", stringQueue.element());
    }

    /**
     * tests element function on empty list.
     * returned element should be always the first element.
     */
    @Test(expected = NoSuchElementException.class)
    public void elementEmptyList() {
        stringQueue.element();
    }

}
