import Practice.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import DataStructures.MyLinkedList;

public class PracticeTests {
    Practice solution;
    MyLinkedList test1, test2, test3, test4, test5;

    @Before
    public void init() {
        solution = new Practice();
        test1 = new MyLinkedList();
        test2 = new MyLinkedList();
        test3 = new MyLinkedList();
        test4 = new MyLinkedList();
        test5 = new MyLinkedList();
        test1.add(1);
        test1.add(2);
        test1.add(3);
        test1.add(4);
        test1.add(5);
        test2.add(999);
        test4.add(2);
        test4.add(4);
        test4.add(6);
        test5.add(2);
        test5.add(5);
        test5.add(6);
        test5.add(10);
    }

    @Test
    public void testReverse() {
        MyLinkedList sol1 = new MyLinkedList();
        sol1.add(5);
        sol1.add(4);
        sol1.add(3);
        sol1.add(2);
        sol1.add(1);
        MyLinkedList run1 = solution.reverse(test1);
        Assert.assertTrue(sol1.equals(run1));

        MyLinkedList sol2 = new MyLinkedList();
        sol2.add(999);
        solution.reverse(test2);
        Assert.assertTrue(sol2.equals(solution.reverse(test2)));

        solution.reverse(test3);
        Assert.assertTrue(new MyLinkedList().equals(solution.reverse(test3)));
    }

    @Test
    public void testSortedMerge() {
        MyLinkedList sol1 = new MyLinkedList();
        sol1.add(1);
        sol1.add(2);
        sol1.add(2);
        sol1.add(3);
        sol1.add(4);
        sol1.add(4);
        sol1.add(5);
        sol1.add(6);
        MyLinkedList run1 = solution.sortedMerge(test1, test4);
        Assert.assertTrue(sol1.equals(run1));

        MyLinkedList sol2 = new MyLinkedList();
        sol2.add(2);
        sol2.add(2);
        sol2.add(4);
        sol2.add(4);
        sol2.add(6);
        sol2.add(6);
        MyLinkedList run2 = solution.sortedMerge(test4, test4);
        Assert.assertTrue(sol2.equals(run2));

        MyLinkedList sol3 = new MyLinkedList();
        sol3.add(1);
        sol3.add(2);
        sol3.add(3);
        sol3.add(4);
        sol3.add(5);
        MyLinkedList run3 = solution.sortedMerge(test1, test3);
        Assert.assertTrue(sol3.equals(run3));
    }

    @Test
    public void testFlipTwo() {
        MyLinkedList sol1 = new MyLinkedList();
        sol1.add(2);
        sol1.add(1);
        sol1.add(4);
        sol1.add(3);
        sol1.add(5);
        solution.flipTwo(test1);
        Assert.assertTrue(sol1.equals(test1));
        MyLinkedList sol2 = new MyLinkedList();
        sol2.add(5);
        sol2.add(2);
        sol2.add(10);
        sol2.add(6);
        solution.flipTwo(test5);
        Assert.assertTrue(sol2.equals(test5));
        MyLinkedList sol3 = new MyLinkedList();
        sol3.add(999);
        solution.flipTwo(sol3);
        Assert.assertTrue(sol3.equals(test2));
    }
}
