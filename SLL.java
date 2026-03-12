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
    Node head = null;
    
    void insertAtBeg(int x) {
        // Creation of Node 
        Node nn = new Node();
        
        // Definition of Node 
        nn.data = x;
        nn.next = head;
        
        // Connection of Node
        head = nn;
    }
    
    void insertAtEnd(int x) {
        // Creation of Node 
        Node nn = new Node();
        
        // Definition of Node 
        nn.data = x;
        nn.next = null;
        
        // Connection of Node
        if(head == null)
            head = nn;
        else {
            Node temp = head;
            
            while(temp.next != null)
                temp = temp.next;
            
            temp.next = nn;
        }
    }
    
    void deleteAtBeg() {
        if(head == null)
            return;
        else if(head.next == null) {
            Node temp = head;
            head = head.next;
            temp = null;
        }
        else {
            Node temp = head;
            head = head.next;
            temp = null;
        }
    }
    
    void deleteAtEnd() {
        if(head == null)
            return;
        else if(head.next == null) {
            Node temp = head;
            head = head.next;
            temp = null;
        }
        else {
            Node temp = head;
            
            while(temp.next.next != null)
                temp = temp.next;
            
            Node delete = temp.next;
            temp.next = null;
            delete = null;
        }
    }
    
    void display() {
        Node temp = head;
        
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        
        System.out.println("NULL\n");
    }
}

