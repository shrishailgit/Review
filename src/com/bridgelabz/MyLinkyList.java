package com.bridgelabz;

public class MyLinkyList<L, k> {
    Node<k> head;

    public class Node<k> {
        L data;
        Node next;

        Node(L data) {
            this.data = data;
        }
    }
 
    
 
    public void print() {

        if (head == null) {
            System.out.println("No elements to show...");
            return;
        }

    
        
       
}
    
    public static void main(String[] args) {
        MyLinkyList linkedlist = new MyLinkyList();
     
        linkedlist.popFirst();
        linkedlist.print();
    }

	   private void popFirst() {
		// TODO Auto-generated method stub
		
	}
    }
    
