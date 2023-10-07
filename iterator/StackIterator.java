package iterator;

import java.util.Stack;

public class StackIterator implements java.util.Iterator {
    private Stack<String> items;
    private int position = 0;

    public StackIterator(Stack<String> items) {
        this.items = items;
    }
	
	public String next() {
        if (hasNext()) {
            String nextItem = items.get(position);
            position++;
            return nextItem;
        } else {
            throw new java.util.NoSuchElementException();
        }
    }

	public boolean hasNext() {
		if(position >= items.size() || items == null) {
			return false;
		} else {
			return true;
		}
	}
}
