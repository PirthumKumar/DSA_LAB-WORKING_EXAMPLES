class Node {
    int key;
    Node left, right;
    
    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BSTcreate {
    Node root;

    // Constructor to initialize the root of the tree
    BSTcreate(int key) {
        root = new Node(key);
    }

    // Default constructor for an empty tree
    BSTcreate() {
        root = null;
    }

    void printPostOrder(Node node) {
        if (node == null) {
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.println(node.key + " ");
    }

    void printInorderOrder(Node node) {
        if (node == null) {
            return;
        }
        printInorderOrder(node.left);
        System.out.println(node.key + " ");
        printInorderOrder(node.right);
    }

    void printpreOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.key + " ");
        printpreOrder(node.left);
        printpreOrder(node.right);
    }

    public Node search(Node root, int key) {
        if (root == null || root.key == key) {
            return root;
        }
        if (root.key > key) {
            return search(root.left, key);
        }
        return search(root.right, key);
    }

    public Node insertKey(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        } else {
            if (key < root.key) {
                root.left = insertKey(root.left, key);
            } else if (key > root.key) {
                root.right = insertKey(root.right, key);
            }
        }
        return root;
    }

    public Node deleteKey(Node root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.key) {
            root.left = deleteKey(root.left, key);
        } else if (key > root.key) {
            root.right = deleteKey(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.key = minValue(root.right);
            root.right = deleteKey(root.right, root.key);
        }
        return root;
    }

    public int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    public static void main(String[] args) {
        BSTcreate tree = new BSTcreate(15);
        Node a = new Node(11);
        tree.root.left = a;
        Node b = new Node(21);
        tree.root.right = b;
        a.left = new Node(10);
        a.right = new Node(13);
     
        b.right = new Node(22);

        System.out.println("Pre Order :");
        tree.printpreOrder(tree.root);
        System.out.println("Post Order :");
        tree.printPostOrder(tree.root);
        System.out.println("Inorder Order :");
        tree.printInorderOrder(tree.root);
    }
}
