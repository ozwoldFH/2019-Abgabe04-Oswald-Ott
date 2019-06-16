package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * A simple StringQueue class which implements the Queue interface.
 * This class only works with Strings and has a limited size of 5 elements by default.
 *
 * @author Michael Ulm
 * @author Clemens Ott
 * @author George Oswald
 * @version %I%, %G%
 */
public class StringQueue implements Queue {

    private static final Logger logger = LogManager.getLogger(StringQueue.class);

    private List<String> elements = new ArrayList<String>();
    private int maxSize = 5;

    /**
     * The maximum size of elements can be changed here.
     *
     * @param maxsize Change size of max elements.
     */
    public StringQueue(int maxsize) {
        logger.info("constructor with maxsize " + maxsize);
        this.maxSize = maxsize;
    }

    @Override
    public boolean offer(String obj) {
        logger.info("offer");
        if (elements.size() != maxSize)
            elements.add(obj);
        else
            return false;

        return true;
    }

    @Override
    public String poll() {
        logger.info("poll");
        String element = peek();

        if (elements.size() != 0) {
            elements.remove(0);
        }

        return element;
    }

    @Override
    public String remove() {
        logger.info("remove");
        if (elements.size() == 0) {
            logger.error("throw NoSuchElementException");
            throw new NoSuchElementException("there's no element any more");
        }

        return poll();
    }

    @Override
    public String peek() {
        logger.info("peek");
        String element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null;

        return element;
    }

    @Override
    public String element() {
        logger.info("element");
        if (elements.size() == 0) {
            logger.error("throw NoSuchElementException");
            throw new NoSuchElementException("there's no element any more");
        }

        return peek();
    }

}