package list;

import java.util.*;

public class MyArrayList<T> implements List<T> {

    int size;
    private T[] array;



    public MyArrayList() {
        this.size = 0;
        this.array = (T[]) new Object[10]; //크기가 10인 array 생성
    }

    public static void main(String[] args) {
        MyArrayList<Integer> mal = new MyArrayList<Integer>();

        mal.add(1);
        mal.add(2);
        mal.add(3);
        System.out.println(Arrays.toString(mal.toArray())+ "size = " + mal.size);

        mal.remove(Integer.valueOf(2));
        System.out.println(Arrays.toString(mal.toArray())+ "size = " + mal.size);
    }

    @Override
    public int size() {
        return size;
    }



    @Override
    public boolean isEmpty() {
        return size ==0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public Iterator<T> iterator() {
        T[] copy = Arrays.copyOf(array,size);
        return Arrays.asList(copy).iterator();
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(array,size);
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(T t) {
        if(size >= array.length){
            T[] bigger = (T[]) new Object[array.length*2];
            System.arraycopy(array,0,bigger,0,array.length);
            array = bigger;
        }
        array[size] = t;
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
        for(Object element: c){
            if(!contains(element)){
                return false;
            }
        }
        return true;
    }
    @Override
    public boolean addAll(Collection<? extends T> c) {

        boolean flag = true;
        for (T element: c){
            flag &= add(element);
        }
        return flag;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {

        boolean flag = true;
        for(Object obj:c){
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
        size = 0;
    }

    @Override
    public T get(int index) {
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public T set(int index, T element) {
        if(index<0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

       return array[index] = element;
    }

    @Override
    public void add(int index, T element) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        add(element);

        //요소 옮기기..
        for(int i = size-1; i > index; i--){
            array[i] = array[i-1];
        }

        array[index] = element;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return -1;
    }

    @Override
    public int lastIndexOf(Object target) {
        for(int i = size - 1; i>=0; i--){
            if(equals(target, array[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<T> listIterator() {
        T[] copy = Arrays.copyOf(array,size);
        return Arrays.asList(copy).listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        T[] copy = Arrays.copyOf(array, size);
        // make a list and return an iterator
        return Arrays.asList(copy).listIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex >= size || fromIndex > toIndex){
            throw new IndexOutOfBoundsException();
        }
        T[] copy = Arrays.copyOfRange(array,fromIndex, toIndex);
        return Arrays.asList(copy);
    }


    public boolean equals(Object target, Object element) {
        if(target == null){
            return element == null;
        } else{
            return target.equals(element);
        }

    }


}
