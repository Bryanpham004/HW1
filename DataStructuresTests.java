import org.junit.*;

import DataStructures.*;

public class DataStructuresTests {

    MyLinkedList lst;

    @Before
    public void init() {
        lst = new MyLinkedList();
    }

    @Test
    public void testListAddSize() throws Exception {
        lst.add(0);
        lst.add(1);
        lst.add(2);
        lst.add(3);
        Assert.assertEquals(4, lst.getSize());
    }

    @Test
    public void testListSetException() {
        Assert.assertFalse(lst.set(-1, 1));
    }

    @Test
    public void testListGetException() throws Exception {
        try {
            lst.get(-1);
            Assert.fail("Exception not thrown");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testListSimpleAddSetAndGet() {
        lst.add(4);
        lst.add(3);
        Assert.assertTrue(lst.set(1, 1));
        Assert.assertEquals(4, lst.get(0));
        Assert.assertEquals(1, lst.get(1));
    }

    @Test public void testListSimpleRemove() {
        lst.add(4);
        lst.add(3);
        Assert.assertEquals(2, lst.getSize());
        Assert.assertEquals(4, lst.remove(0));
        Assert.assertEquals(3, lst.remove(0));
        Assert.assertEquals(0, lst.getSize());
    }

    @Test public void testGetFirstLast() {
        lst.add(1);
        lst.add(2);
        Assert.assertEquals(1, lst.getFirst().value);
        Assert.assertEquals(2, lst.getLast().value);
        lst.remove(1);
        Assert.assertEquals(1, lst.getLast().value);
        lst.remove(0);
        Assert.assertNull(lst.getFirst());
        Assert.assertNull(lst.getLast());
    }
}
