package com.rafay;


//linked list without its method
public class LL {

    // it has a head and tail nodes
    private Node head;
    private Node tail;

    private int size;
    public LL () { //constructor
        this.size = 0;
    }

    //
        here u can add methods for insertion and deletion


    //
  

  
   
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
