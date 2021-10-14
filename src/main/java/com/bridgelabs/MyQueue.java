package com.bridgelabs;

public class MyQueue {
    private MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }

    public void enqueue(INode myNode) {
        myLinkedList.add(myNode);
    }

    public void printQueue() {
        myLinkedList.printMyNode();
    }
}
