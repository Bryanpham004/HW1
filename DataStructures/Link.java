package DataStructures;

public class Link {
    
    public Link next;
    public int value;

    public Link(int value, Link next) {
        // Initialize class attributes

    	this.next = next;
    	this.value = value;
    	
        // YOUR CODE HERE
    }

    public Link(int value) {
        // Shortcut to create a new Link with next set to null.
        // Remember to reuse code whenever possible (rather than copy pasting)!

        // YOUR CODE HERE
    	this.next = null;
    	this.value = value;
    }
}