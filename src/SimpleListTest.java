import static org.junit.Assert.*;


public class SimpleListTest {

    @org.junit.Test
    public void simpleList() {
        //testing constructor of SimpleList to make sure it initiates the list to zeroes
        SimpleList list1 = new SimpleList();
        assertNotNull("not null",  list1);
        assertEquals(0, list1.count());
    }

    @org.junit.Test
    public void add() {
        //testing the add function such to make sure it does not add more than one instance
        SimpleList list1 = new SimpleList();
        list1.add(2);
        list1.add(1);
        assertEquals(0, list1.search(1));
        assertEquals(1, list1.search(2));
        assertNotEquals(2, list1.search(3));
    }

    @org.junit.Test
    public void remove() {
        //testing the remove function, to make sure it does not remove all instances
        SimpleList list1 = new SimpleList();
        list1.add(2);
        list1.add(1);
        list1.add(1);
        list1.remove(1);
        assertEquals("1 2 0 0 0 0 0 0 0 0", list1.toString());
    }

    @org.junit.Test
    public void countTest() {
        //testing count function to make sure it returns the correct count regardless of adds or removes
        SimpleList list1 = new SimpleList();
        list1.add(2);
        list1.add(1);
        list1.remove(1);
        assertEquals(1, list1.count());
    }

    @org.junit.Test
    public void searchTest() {
        //testing search function to make sure it returns the correct index of the number and -1 if the number isnt in the list
        SimpleList list1 = new SimpleList();
        list1.add(2);
        list1.add(1);
        list1.remove(1);
        assertEquals(0, list1.search(2));
        assertEquals(-1, list1.search(5));

    }

    @org.junit.Test
    public void arrayToString() {
        //testing toString function to see if it correctly turns the array into a string
        SimpleList list1 = new SimpleList();
        list1.add(2);
        list1.add(1);
        list1.remove(1);
        assertEquals("2 0 0 0 0 0 0 0 0 0", list1.toString());

    }
}
