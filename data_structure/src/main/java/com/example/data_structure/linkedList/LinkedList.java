package com.example.data_structure.linkedList;

public class LinkedList {


    Node head;
    Node tail;

    public LinkedList() {
        this.head = null;
    }

    public void append(int value){

        Node newNode = new Node(value);
        if (head == null){
            // 처음 데이터를 삽입한다면 head와 tail을 동일한 노드를 가리킬 수 있게 한다.
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = this.tail.next;
        }

    }

    public int get(int index){
        Node current = this.head;

        for (int i = 0; i < index; i++){
            current = current.next;
        }
        return current.getValue();
    }

    public void insertAt(int idx, int value){

        Node current = this.head;

        for (int i = 0 ; i < idx; i++){
            current = current.next;
        }
        Node newNode = new Node(value);
        newNode.next = current.next;
        current.next = newNode;
    }

    public int removeAt(int idx){

        Node before = this.head;

        for (int i =0; i < idx-1; i++){
            before = before.next;
        }
        Node removeNode = before.next;
        before.next = removeNode.next;

        int removeValue = removeNode.getValue();

        removeNode = null;

        return removeValue;

    }

    private class Node {
        int value;
        Node next;

        public Node() {
            this.value = 0;
            this.next = null;
        }

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public int getValue() {
            return value;
        }
    }
}
