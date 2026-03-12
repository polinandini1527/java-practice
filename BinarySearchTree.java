class Main{
	public static void main(String[] args)
	{
		BinarySearchTree bst = new BinarySearchTree();
		bst.root = bst.insert(bst.root,  10);
		bst.root = bst.insert(bst.root,  20);
		bst.root = bst.insert(bst.root,  30);
		bst.root = bst.insert(bst.root,  40);
		bst.root = bst.insert(bst.root,  1);
		bst.root = bst.insert(bst.root,  4);
		bst.root = bst.insert(bst.root,  2);
		bst.root = bst.insert(bst.root,  44);
		
		System.out.println(" Pre order");
		bst.Preorder(bst.root);
		
		System.out.println("Inorder: ");
		bst.display(bst.root);
		
		System.out.println(" post order ");
		bst.Postorder(bst.root);
		
		System.out.println("Inorder: ");
		bst.Inorder(bst.root);
		
		System.out.println("After delete: ");
		bst.root = bst.delete(bst.root , 1);
		bst.root = bst.delete(bst.root , 20);
		bst.display(bst.root);
		//bst.run();
	}
}
class BinarySearchTree {
	Node root;
	BinarySearchTree() {
		root = null;
	}

	Node insert(Node root, int value) {
		if (root == null) {
			return new Node(value);
		}
		if (value < root.data) {
			root.llink = insert(root.llink, value);
		}
		else {
			root.rlink = insert(root.rlink, value);
		}
		return root;
	}

	void Preorder(Node root) {
		if(root != null) {
			System.out.println(root.data);
			Preorder(root.llink);
			Preorder(root.rlink);
		}
	}

	void display(Node root) {
		if (root != null) {
			display(root.llink);
			System.out.println(root.data);
			display(root.rlink);
		}
	}
	
	void Inorder(Node root) {
		if (root != null) {
			Inorder(root.llink);
			System.out.println(root.data);
			Inorder(root.rlink);

		}
	}

    void Postorder(Node root) {
		if(root != null) {
			Postorder(root.llink);
			Postorder(root.rlink);
			System.out.println(root.data);
		}
	}
	
	
	Node delete(Node root , int Target){
	    if (Target < root.data){
	       root.llink = delete(root.llink , Target); 
	    }
	    else if (Target > root.data){
	        root.rlink = delete(root.rlink , Target); 
	    }
	    else{
	        if (root.llink == null && root.rlink == null){
	            return null;
	        }
	        else if (root.llink == null){
	            root = root.rlink;
	        }
	        else if (root.rlink == null){
	            root = root.llink;
	        }
	        else{
	            Node Temproot = root.rlink;
	            while (Temproot.llink != null){
	                Temproot = Temproot.llink;
	           }
	           root.data = Temproot.data;
	           root.rlink = delete(root.rlink , Target);
	        }
	    }
	    return root;
	}
}
class Node {
    int data;
    Node llink;
	Node rlink;

    Node(int value) {
        data = value;
        llink = null;
		rlink = null;
    }
}