package list;

import java.util.*;


public class MyLinkedList<E> implements List<E> {
    private class Node{
        public E data;
        public Node next;


        public Node(E data) {
            this.data = data;
            this.next = null;
        }

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node(" + data.toString() + ")";
        }
    }

    private int size;
    private Node head;


    public MyLinkedList() {
        this.size = 0;
        this.head = null;
    }



    public static void main(String[] args) {
        List<Integer> mll = new MyLinkedList<Integer>();

        mll.add(1);
        mll.add(2);
        mll.add(3);

        System.out.println(Arrays.toString(mll.toArray())+" size = "+ mll.size());

        mll.remove(new Integer(2));
        System.out.println(Arrays.toString(mll.toArray())+" size = "+ mll.size());

    }

    private boolean equals(Object target, Object element){
        if(target == null){
            return element == null;
        } else{
            return target.equals(element);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public Iterator<E> iterator() {
        E[] array = (E[]) toArray();
        return Arrays.asList(array).iterator();
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];

        int i = 0;
        for (Node node = head; node != null; node = node.next){
            array[i] = node.data;
            i++;
        }
        return array;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(E e) {
        if(this.head == null){
            this.head = new Node(e);
        } else {
            Node node = head;
            for (; node.next != null; node = node.next){}
            node.next = new Node(e);
        }

        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int index = indexOf(o);
        if(index == -1){
            return false;
        }

        remove(index);
        return true;

    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for(Object obj: c){
            if(!contains(obj)){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean flag = true;

        for (E element: c){
            flag &= add(element);
        }

        return flag;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean flag = true;

        for(Object obj : c){
            flag &= remove(obj);
        }
        return flag;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
    /**
     * 해당 Node의 head가 null일 경우애
     * 우리는 LinkedList가 비어있다고 생각하기에 초기화 해주면 된다.
     * **/
        head = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        Node node = getNode(index);
        return node.data;

    }

    private Node getNode(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        Node node = head;
        for (int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }

    @Override
    public E set(int index, E element) {
        Node node = getNode(index);
        E old = node.data;
        node.data = element;
        return old;
    }

    @Override
    public void add(int index, E element) {
        /**
         * 해당 index에 element를 추가하는 방식
         * 앞 뒤 node를 재설정 해주어야 한다.
         * **/
        if (index == 0){
            //맨 앞에 요소를 넣어줄 땐 현재 head를 next로 넣어준다.
            head = new Node(element,head);
        } else {

            /**
             * 1. 현재 삽입하려는 index 앞에 있는 노드를 가져온다.
             * 2. 현재 노드의 next에 현재 넣으려는 요소를 다음 노드로 설정한다.
             * (삽입하려는 위치 앞에 노드에 연결해주는 것이라고 생각하면 된다.)
             * 3. 해당 index 앞에 노드의 뒤에 연결된 노드를 현재 삽입하고자하는 노드의 next로 연결해주어야 한다.
             * **/
            Node node = getNode(index-1);
            node.next = new Node(element, head.next);

        }
        size++;

    }

    @Override
    public E remove(int index) {
        E element = get(index);
        if (index == 0){
            head = head.next;
        } else {
            //해당 index 앞의 값을 가져와 제거하고자 하는 index의 next에 연결해준다.
            Node node = getNode(index-1);
            node.next = node.next.next;
        }
        size--;
        return element;
    }

    @Override
    public int indexOf(Object target) {
        Node node = head;

        for (int i = 0; i <size; i++){
            if(equals(target, node.data)){
                return i;
            }
            node = node.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object target) {
        Node node = head;

        int index = -1;

        for(int i = 0 ; i < size; i++){
            if(equals(target,node.data)){
                index = i;
            }
        }
        return index;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        if(fromIndex < 0 || toIndex >= size || fromIndex > toIndex){
            throw new IndexOutOfBoundsException();
        }
        int i = 0;
        MyArrayList<E> list =new MyArrayList<E>();

        for(Node node = head; node != null; node = node.next){
            if(i >= fromIndex && i <= toIndex){
                list.add(node.data);
            }
            i++;
        }
        return list;
    }
}
