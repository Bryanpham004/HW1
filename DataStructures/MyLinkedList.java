package DataStructures;

/**
    Your custom implementation of a singly linked list.

    Linked lists are composed of a bunch of individual Links, each containing a single value.
    Each Link must hold a `next` object, which is a type Link or `null` if at the end of the list.

    Linked lists have the following runtime characteristics:
    - Add: O(1) 
    - Get/Set/Contains: O(N)
    - Remove: O(N)
    - GetSize: O(1)

    Don't forget to fill out Link.java!
*/
public class MyLinkedList {

    private Link sentinel;
    private Link last; 
    private int size;

    // Create an empty sentinel node.
    // The value of the sentinel node is insignificant (so choose whatever you want).
    // Remember to set size and last!
    public MyLinkedList() {
        // YOUR CODE HERE
    	sentinel = new Link(0);
    	last = sentinel;
    	size = 0;
    }
    
    public MyLinkedList(Link lnk) {
        // Initialize a linked list starting with the given lnk.
        // You can assume that the inputted link is NOT circular.
        this();
        
        // YOUR CODE HERE
        sentinel.next = lnk;
        last = sentinel.next;
        size++;
        // last = sentinel;
    }

    /**
     * Appends the value to the end of the list.
     */
    public void add(int value) {
        // YOUR CODE HERE
    	last.next = new Link(value);
    	last = last.next;
    	size++;
    }

    /**
     * Returns the last link in the list in O(1) time, or
     * null if the list is empty.
     */
    public Link getLast() {
        // YOUR CODE HERE
    	if (size == 0) return null;
    	return last;
    }

    /**
     * Returns the first link in the list in O(1) time,
     * or null if the list is empty.
     */
    public Link getFirst() {
        // YOUR CODE HERE
    	if (size == 0) return null;
    	return sentinel.next;
    }

    /* 
     * Returns the Integer at the given index.
     * Throw an IllegalArgumentException if index is out of bounds.
     */
    public int get(int index) {
        // YOUR CODE HER
    	
    	if (index < 0 || index >= size)
    		throw new IllegalArgumentException();
    	
    	Link curr = getFirst();
    	for (int i = 0; i < index; i++)
    		curr = curr.next;
    	return curr.value;
    }

    /**
     * Sets the value at the given index and returns whether it was successful or not 
     */
    public boolean set(int index, int value) {
        if (index >= size || index < 0) {
            return false;
        }
        // YOUR CODE HERE
        
        Link curr = getFirst();
        for (int i = 0; i < index; i++)
        	curr = curr.next;
        curr.value = value;
        return true;
    }

    /** Returns size of the Array */
    public int getSize() {
        // YOUR CODE HERE
    	return size;
    }

    /**
     * Removes the value at the given index and returns the removed value.
     * Throw an IllegalArgumentException if index is out of bounds.
     */
    public int remove(int index) {
        // YOUR CODE HERE
        if (index >= size || index < 0) {
            throw new IllegalArgumentException();
        }
        
        // YOUR CODE HERE
        size--; // decrease the size
        
        Link prev = sentinel;
        Link curr = getFirst();
        
        // traverse to the node
        for (int i = 0; i < index; i++) {
        	prev = curr;
        	curr = curr.next;
        }
        
        // check for last node case
        if (curr.next == null)
        	last = prev;
        
        // unlink node
        prev.next = curr.next;
        
        return curr.value;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MyLinkedList)) {
            return false;
        }
        MyLinkedList otherLst = (MyLinkedList)other;
        if (getSize() != otherLst.getSize()) {
            return false;
        }
        Link curr = getFirst();
        Link oCurr = otherLst.getFirst();
        for (int i = 0; i < getSize(); i++) {
            if (curr.value != oCurr.value) {
                return false;
            }
            curr = curr.next;
            oCurr = oCurr.next;
        }
        return true;
    }
}