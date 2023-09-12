package com.rafay;


public class LL {

    // it has a head and tail nodes
    private Node head;
    private Node tail;

    private int size;
    public LL () { //constructor
        this.size = 0;
    }



    //insertion at start in linked list
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        size += 1;

        if ( tail == null) {
            tail = head;
        }


    }

    //insertion at particular index
    public void insert(int value , int index) {
        if ( index == 0 ) {
            insertFirst(value);
            return;
        }
        if ( index == size ) {
            insertLast(value);
            return;
        }

        // on any index
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;

        size++;

    }


    //insertion at tail in linked list
    public void insertLast(int value) {
        if ( tail == null ) {
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;

    }


    //Displaying linked list
    public void display() {
        Node temp = head;
        while ( temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    // it has a box called node which has its value and next pointer
    private class Node {
        private int value;
        private Node next;

        // constructor if only value is given
        public  Node(int value) {
            this.value = value;
        }

        // constructor if both value and next node is given.
        public  Node (int value , Node next) {
            this.value = value;
            this.next = next;

        }
    }

}
