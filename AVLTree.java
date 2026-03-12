class AVLTree{
    class Node {
        int data, height;
        Node llink, rlink;
        Node(int data) {
            this.data = data;
            this.height = 1;
            this.llink = null;
            this.rlink = null;
        }
    }

    Node root;

    // Height using ternary
    int height(Node n) {
        return (n != null) ? n.height : 0;
    }

    // Balance factor
    int getBalance(Node n) {
        int l = (n.llink != null) ? n.llink.height : 0;
        int r = (n.rlink != null) ? n.rlink.height : 0;
        return l - r;
    }

    // RIGHT ROTATION (LL)  ---- y is root, x is left child
    Node rightRotate(Node y) {

        Node x = y.llink;
        Node t2 = x.rlink;

        x.rlink = y;
        y.llink = t2;

        int yl = (y.llink != null) ? y.llink.height : 0;
        int yr = (y.rlink != null) ? y.rlink.height : 0;
        y.height = (yl > yr) ? yl + 1 : yr + 1;

        int xl = (x.llink != null) ? x.llink.height : 0;
        int xr = (x.rlink != null) ? x.rlink.height : 0;
        x.height = (xl > xr) ? xl + 1 : xr + 1;

        return x;
    }

    // LEFT ROTATION (RR) ---- x is root, y is right child
    Node leftRotate(Node x) {

        Node y = x.rlink;
        Node t2 = y.llink;

        y.llink = x;
        x.rlink = t2;

        int xl = (x.llink != null) ? x.llink.height : 0;
        int xr = (x.rlink != null) ? x.rlink.height : 0;
        x.height = (xl > xr) ? xl + 1 : xr + 1;

        int yl = (y.llink != null) ? y.llink.height : 0;
        int yr = (y.rlink != null) ? y.rlink.height : 0;
        y.height = (yl > yr) ? yl + 1 : yr + 1;

        return y;
    }

    // INSERT
    Node insert(Node node, int data) {

        if (node == null)
            return new Node(data);

        if (data < node.data)
            node.llink = insert(node.llink, data);
        else if (data > node.data)
            node.rlink = insert(node.rlink, data);
        else
            return node;

        int l = (node.llink != null) ? node.llink.height : 0;
        int r = (node.rlink != null) ? node.rlink.height : 0;
        node.height = (l > r) ? l + 1 : r + 1;

        int balance = getBalance(node);

        // LL
        if (balance > 1 && data < node.llink.data)
            return rightRotate(node);

        // RR
        if (balance < -1 && data > node.rlink.data)
            return leftRotate(node);

        // LR
        if (balance > 1 && data > node.llink.data) {
            node.llink = leftRotate(node.llink);
            return rightRotate(node);
        }

        // RL
        if (balance < -1 && data < node.rlink.data) {
            node.rlink = rightRotate(node.rlink);
            return leftRotate(node);
        }

        return node;
    }

    // Minimum value node
    Node minValueNode(Node node) {
        return (node.llink == null) ? node : minValueNode(node.llink);
    }

    // DELETE
    Node delete(Node node, int data) {
        if (node == null)
            return node;
        if (data < node.data)
            node.llink = delete(node.llink, data);
        else if (data > node.data)
            node.rlink = delete(node.rlink, data);
        else {
            if (node.llink == null || node.rlink == null)
                node = (node.llink != null) ? node.llink : node.rlink;
            else {
                Node temp = minValueNode(node.rlink);
                node.data = temp.data;
                node.rlink = delete(node.rlink, temp.data);
            }
        }

        if (node == null)
            return node;

        int l = (node.llink != null) ? node.llink.height : 0;
        int r = (node.rlink != null) ? node.rlink.height : 0;
        node.height = (l > r) ? l + 1 : r + 1;

        int balance = getBalance(node);

        // LL
        if (balance > 1 && getBalance(node.llink) >= 0)
            return rightRotate(node);

        // LR
        if (balance > 1 && getBalance(node.llink) < 0) {
            node.llink = leftRotate(node.llink);
            return rightRotate(node);
        }

        // RR
        if (balance < -1 && getBalance(node.rlink) <= 0)
            return leftRotate(node);

        // RL
        if (balance < -1 && getBalance(node.rlink) > 0) {
            node.rlink = rightRotate(node.rlink);
            return leftRotate(node);
        }

        return node;
    }

    // Traversals
    void inorder(Node node) {
        if (node != null) {
            inorder(node.llink);
            System.out.print(node.data + " ");
            inorder(node.rlink);
        }
    }
    void preorder(Node node){
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.llink);
            preorder(node.rlink);
    }
    }
     void postorder(Node node){
        if (node != null) {
            postorder(node.llink);
            postorder(node.rlink);
            System.out.print(node.data + " ");
        }
     }
    public static void main(String[] args) {
        AVLTree t = new AVLTree ();
        int[] a = {10, 20, 30, 40, 50, 25};
        for (int x : a)
            t.root = t.insert(t.root, x);
        System.out.print("Inorder: ");
        t.inorder(t.root);
        System.out.println("Preorder: ");
        t.preorder(t.root);
        System.out.println("Postorder: ");
        t.postorder(t.root);
        t.root = t.delete(t.root, 40);
        System.out.print("\nAfter Deletion: ");
         System.out.print("Inorder: ");
        t.inorder(t.root);
        System.out.println("Preorder: ");
        t.preorder(t.root);
         System.out.println("Postorder: ");
        t.postorder(t.root);
    }
}
