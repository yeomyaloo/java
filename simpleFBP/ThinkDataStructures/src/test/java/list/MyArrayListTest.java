package list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.fail;

class MyArrayListTest {

    protected  List<Integer> myList;
    protected List<Integer> list;


    //@Before 대신 @BeforeEach 사용!
    @BeforeEach
    public void setUp() throws Exception{
        list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);

        myList = new MyArrayList<Integer>();
        myList.addAll(list);
    }

    @Test
    public void testmyList(){
        assertThat(myList.size(),is(3));
    }


    @Test
    public void testAddT(){
        for(int i = 4; i < 20; i++){
            myList.add(i);
        }
        assertThat(myList.get(18), is(new Integer(19)));
    }

    @Test
    public void testAddIntT(){
        myList.add(1,5);

        //해당 index 1 자리에 5가 있는지 확인
        assertThat(myList.get(1), is(new Integer(5)));

        //기존 3개에서 요소를 1자리에 5를 넣어주었기 때문에 size가 4인지 확인
        assertThat(myList.size(), is(4));

        try{
            myList.set(-1,0);
            fail();
        }catch (IndexOutOfBoundsException e){}

        try{
            myList.set(4,0);
            fail();
        } catch (IndexOutOfBoundsException e){}

        myList.add(0,6);
        assertThat(myList.get(0), is(6));

        myList.add(5,7);
        assertThat(myList.get(5), is(new Integer(7)));
    }
    @Test
    public void testAddAllCollectionOfExtendsT(){
        myList.addAll(list);
        myList.addAll(list);
        myList.addAll(list);
        assertThat(myList.size(), is(12));
        assertThat(myList.get(5),is(new Integer(3)));
    }

    @Test
    public void testClear() {
        myList.clear();
        assertThat(myList.size(), is(0));
    }

    /**
     * Test method for {@link MyArrayList#contains(Object)}.
     */
    @Test
    public void testContains() {
        assertThat(myList.contains(1), equalTo(true));
        assertThat(myList.contains(4), equalTo(false));
        assertThat(myList.contains(null), equalTo(false));
        myList.add(null);
        assertThat(myList.contains(null), equalTo(true));
    }

    /**
     * Test method for {@link MyArrayList#containsAll(java.util.Collection)}.
     */
    @Test
    public void testContainsAll() {
        assertThat(myList.containsAll(list), equalTo(false));
    }

    /**
     * Test method for {@link MyArrayList#get(int)}.
     */
    @Test
    public void testGet() {
        assertThat(myList.get(1), is(new Integer(2)));
    }

    /**
     * Test method for {@link MyArrayList#indexOf(Object)}.
     */
    @Test
    public void testIndexOf() {
        assertThat(myList.indexOf(1), is(0));
        assertThat(myList.indexOf(2), is(1));
        assertThat(myList.indexOf(3), is(2));
        assertThat(myList.indexOf(4), is(-1));
    }

    /**
     * Test method for {@link MyArrayList#indexOf(Object)}.
     */
    @Test
    public void testIndexOfNull() {
        assertThat(myList.indexOf(null), is(-1));
        myList.add(null);
        assertThat(myList.indexOf(null), is(3));
    }

    /**
     * Test method for {@link MyArrayList#isEmpty()}.
     */
    @Test
    public void testIsEmpty() {
        assertThat(myList.isEmpty(), equalTo(false));
        myList.clear();
        assertThat(myList.isEmpty(), equalTo(true));
    }

    /**
     * Test method for {@link MyArrayList#iterator()}.
     */
    @Test
    public void testIterator() {
        Iterator<Integer> iter = myList.iterator();
        assertThat(iter.next(), is(new Integer(1)));
        assertThat(iter.next(), is(new Integer(2)));
        assertThat(iter.next(), is(new Integer(3)));
        assertThat(iter.hasNext(), equalTo(false));
    }

    /**
     * Test method for {@link MyArrayList#lastIndexOf(Object)}.
     */
    @Test
    public void testLastIndexOf() {
        myList.add(2);
        assertThat(myList.lastIndexOf(new Integer(2)), is(3));
    }

    /**
     * Test method for {@link MyArrayList#remove(Object)}.
     */
    @Test
    public void testRemoveObject() {
        boolean flag = myList.remove(new Integer(2));
        assertThat(flag, equalTo(true));
        assertThat(myList.size(), is(2));
        assertThat(myList.get(1), is(new Integer(3)));
        //System.out.println(Arrays.toString(mal.toArray()));

        flag = myList.remove(new Integer(1));
        assertThat(flag, equalTo(true));
        assertThat(myList.size(), is(1));
        assertThat(myList.get(0), is(new Integer(3)));
        //System.out.println(Arrays.toString(mal.toArray()));

        flag = myList.remove(new Integer(5));
        assertThat(flag, equalTo(false));
        assertThat(myList.size(), is(1));
        assertThat(myList.get(0), is(new Integer(3)));
        //System.out.println(Arrays.toString(mal.toArray()));

        flag = myList.remove(new Integer(3));
        assertThat(flag, equalTo(true));
        assertThat(myList.size(), is(0));
        //System.out.println(Arrays.toString(mal.toArray()));
    }

    /**
     * Test method for {@link MyArrayList#remove(int)}.
     */
    @Test
    public void testRemoveInt() {
        Integer val = myList.remove(1);
        assertThat(val, is(new Integer(2)));
        assertThat(myList.size(), is(2));
        assertThat(myList.get(1), is(new Integer(3)));
    }

    /**
     * Test method for {@link MyArrayList#removeAll(java.util.Collection)}.
     */
    @Test
    public void testRemoveAll() {
        myList.removeAll(list);
        assertThat(myList.size(), is(0));
    }

    /**
     * Test method for {@link MyArrayList#set(int, Object)}.
     */
    @Test
    public void testSet() {
        Integer val = myList.set(1, 5);
        assertThat(val, is(new Integer(5)));

        val = myList.set(0, 6);
        assertThat(val, is(new Integer(1)));

        val = myList.set(2, 7);
        assertThat(val, is(new Integer(3)));

        // return value should be 2
        // list should be [6, 5, 7]
        assertThat(myList.get(0), is(new Integer(6)));
        assertThat(myList.get(1), is(new Integer(5)));
        assertThat(myList.get(2), is(new Integer(7)));
        //System.out.println(Arrays.toString(mal.toArray()));

        try {
            myList.set(-1, 0);
            fail();
        } catch (IndexOutOfBoundsException e) {} // good

        try {
            myList.set(4, 0);
            fail();
        } catch (IndexOutOfBoundsException e) {} // good
    }

    /**
     * Test method for {@link MyArrayList#size()}.
     */
    @Test
    public void testSize() {
        assertThat(myList.size(), is(3));
    }

    /**
     * Test method for {@link MyArrayList#subList(int, int)}.
     */
    @Test
    public void testSubList() {
        myList.addAll(list);
        List<Integer> sub = myList.subList(1, 4);
        assertThat(sub.get(1), is(new Integer(3)));
    }

    /**
     * Test method for {@link MyArrayList#toArray()}.
     */
    @Test
    public void testToArray() {
        Object[] array = myList.toArray();
        assertThat((Integer)array[0], is(new Integer(1)));
    }

}