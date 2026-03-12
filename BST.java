import java.util.*;
public class BST
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree t1 = new BinarySearchTree();
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) 
            t1.insert(sc.nextInt());
            
        System.out.print("IN-ORDER : ");
        t1.inOrder(t1.root);
        System.out.println("\n");
        
        System.out.print("PRE-ORDER : ");
        t1.preOrder(t1.root);
        System.out.println("\n");
        
        System.out.print("POST-ORDER : ");
        t1.postOrder(t1.root);
        System.out.println("\n");
	}
}

class Node {
    int data;
    Node left, right;
}

class BinarySearchTree {
    Node root = null;
    
    void insert(int x) {
        // Craetion of Node 
        Node nn = new Node();
        
        // Definition of Node 
        nn.data = x;
        nn.left = nn.right = null;
        
        // Connection of Node
        if(root == null)
            root = nn;
        else {
            Node temp = root;
            
            while(true) {
                if(x < temp.data) {
                    if(temp.left == null) {
                        temp.left = nn;
                        break;
                    }
                    else
                        temp = temp.left;
                }
                else {
                    if(temp.right == null) {
                        temp.right = nn;
                        break;
                    }
                    else
                        temp = temp.right;
                }
            }
        }
    }
    
    void inOrder(Node rootAdd) {
        if(rootAdd != null) {
            inOrder(rootAdd.left);
            System.out.print(rootAdd.data + " ");
            inOrder(rootAdd.right);
        }
    }
    
    void preOrder(Node rootAdd) {
        if(rootAdd != null) {
            System.out.print(rootAdd.data + " ");
            preOrder(rootAdd.left);
            preOrder(rootAdd.right);
        }
    }
    
    void postOrder(Node rootAdd) {
        if(rootAdd != null) {
            postOrder(rootAdd.left);
            postOrder(rootAdd.right);
            System.out.print(rootAdd.data + " ");
        }
    }
} 