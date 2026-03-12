import java.util.*;
public class Main
{
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
	    Scanner sc = new Scanner(System.in);
	    int var;
	    
	    do {
	        var = sc.nextInt();
	        l1.insertAtEnd(var);
	    }while(var != -1);
	    
	    l1.display();
	    
	    l1.deleteAtBeg();
	    l1.display();
	    
	    l1.deleteAtEnd();
	    l1.display();
	}
}

class Node {
    int data;
    Node next;
}

class LinkedList {
    Node head = null, tail = null;
    
    void insertAtBeg(int x) {
        // Creation of Node 
        Node nn = new Node();
        
        // Definition of Node 
        nn.data = x;
        
        // Connection of Node
        if(head == null) {
            head = nn;
            nn.next = head;
            tail = nn;
        }
        else {
            nn.next = head;
            head = nn;
            tail.next = head;
        }
    }
    
    void insertAtEnd(int x) {
        // Creation of Node 
        Node nn = new Node();
        
        // Definition of Node 
        nn.data = x;
        
        // Connection of Node
        if(head == null) {
            head = nn;
            nn.next = head;
        }
        else {
            tail.next = nn;
            nn.next = head;
        }
        tail = nn;
    }
    
    void deleteAtBeg() {
        if(head == null)
            return;
        else if(head == tail) {
            Node temp = head;
            head = tail = null;
            temp = null;
        }
        else {
            Node temp = head;
            head = head.next;
            tail.next = head;
            temp = null;
        }
    }
    
    void deleteAtEnd() {
        if(head == null)
            return;
        else if(head == tail) {
            Node temp = head;
            head = tail = null;
            temp = null;
        }
        else {
            Node temp = head;
            
            while(temp.next != tail)
                temp = temp.next;
                
            Node delete = temp.next;
            temp.next = head;
            delete = null;
            tail = temp;
        }
    }
    
    void display() {
        if(head == null)
            return;
            
        Node temp = head;
        
        while(temp != tail) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print(tail.data + " -> NULL\n");
    }
}
