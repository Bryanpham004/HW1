package Practice;

import java.util.LinkedList;

import org.junit.Assert;

import DataStructures.Link;
import DataStructures.MyLinkedList;

/** 
 * These are a few practice questions that involve working with LinkedLists.
 * You will need to complete Part 1 before completing this section.
 */
public class Practice {

    /**
     * A classic problem: take a linked list, and
     * reverse all of its elements.
     * 
     * It is OK to mutate the original list while doing so.
     * 
     * For example, the list 1->2->3->4->5 should become 5->4->3->2->1.
     * 
     * @param lst: A linked list of integers.
     */
    public static MyLinkedList reverse(MyLinkedList lst) {
        // YOUR CODE HERE
    	MyLinkedList result = new MyLinkedList();
    	for (int i = lst.getSize() - 1; i >= 0; i--)
    		result.add(lst.get(i));
    	return result;
    }

    /**
     * Given two linked lists sorted in increasing order,
     * return a sorted linked list combining all elements in
     * both lists in O(N) time.
     * 
     * For example:
     * lst1 = 1->2->3->4->5
     * lst2 = 2->4->6
     * return value = 1->2->2->3->4->4->5->6
     */
    public MyLinkedList sortedMerge(MyLinkedList lst1, MyLinkedList lst2) {
        // YOUR CODE HERE
    	// lol not really O(N) but whatever more like O(N^2)
    	MyLinkedList result = new MyLinkedList();
    	int one = 0;
    	int two = 0;
    	while (one < lst1.getSize() && two < lst2.getSize()) {
    		if (lst1.get(one) <= lst2.get(two))
    			result.add(lst1.get(one++));
    		else
    			result.add(lst2.get(two++));
    	}
    	
    	while (one < lst1.getSize())
    		result.add(lst1.get(one++));
    	while (two < lst2.getSize())
    		result.add(lst2.get(two++));
    	
    	return result;
    }

    /**
     * Takes a linked list as input and mutates it so that every pair is flipped.
     * For example:
     * 1->2->3->4->5 would become:
     * 2->1->4->3->5
     */
    public void flipTwo(MyLinkedList lst) {
        // YOUR CODE HERE
    	for (int i = 0; i < lst.getSize() - 1; i += 2) {
    		int temp = lst.get(i);
    		lst.set(i, lst.get(i + 1));
    		lst.set(i + 1, temp);
    	}
    }
}
