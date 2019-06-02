package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

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
	
	private List<String> elements = new ArrayList<String>();
	private int maxSize = 5;

	/**
	 * The maximum size of elements can be changed here.
	 * @param maxsize Change size of max elements.
	 */
	public StringQueue(int maxsize){
		this.maxSize = maxsize;
	}
	
	@Override
	public boolean offer(String obj) {
		if(elements.size()!= maxSize)
			elements.add(obj);
		else
			return false;
		
		return true;
	}

	@Override
	public String poll() {
		String element = peek();
		
		if(elements.size() != 0){
			elements.remove(0);
		}
		
		return element;
	}

	@Override
	public String remove() {
		String element = poll();
		if(element == null)
			throw new NoSuchElementException("there's no element any more");
		
		return element;
	}

	@Override
	public String peek() {
		String element;
		if(elements.size() > 0)
			element = elements.get(0);
		else
			element = null;
		
		return element;
	}

	@Override
	public String element() {
		String element = peek();
		if(element == null)
			throw new NoSuchElementException("there's no element any more");
		
		return element;
	}

}