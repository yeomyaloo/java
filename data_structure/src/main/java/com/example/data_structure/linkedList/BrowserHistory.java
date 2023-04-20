package com.example.data_structure.linkedList;

class BrowserHistory {

    LinkedNode head;
    LinkedNode currentNode;


    public BrowserHistory(String homepage) {
        this.head = new LinkedNode(homepage);
        this.currentNode = head;
    }

    public void visit(String url) {
        LinkedNode newNode = new LinkedNode(url);

        this.currentNode.next = newNode;
        newNode.prev = currentNode;
        this.currentNode = newNode;
    }

    public String back(int steps) {
        while (steps > 0 && this.currentNode.prev != null){
            steps -= 1;
            currentNode = this.currentNode.prev;
        }
        return currentNode.getValue();
    }

    public String forward(int steps) {
        while (steps > 0 && this.currentNode.next != null){
            steps -= 1;
            currentNode = this.currentNode.next;
        }
        return currentNode.getValue();

    }
}

class LinkedNode{

    String value;
    LinkedNode prev;
    LinkedNode next;

    public LinkedNode(String value) {
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}