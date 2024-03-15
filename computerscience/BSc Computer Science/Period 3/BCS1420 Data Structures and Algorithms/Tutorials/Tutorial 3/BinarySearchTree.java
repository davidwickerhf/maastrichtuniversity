package tut_3;

class BinarySearchTree {
    TreeNode root;

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(18);
        tree.insert(1);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        tree.insert(11);
        tree.insert(13);
        tree.insert(16);
        tree.insert(20);

        TreeNode primeNode = tree.findPrime(tree.root);
        System.out.println("Prime Node: " + primeNode.key);
    }

    BinarySearchTree() {
        root = null;
    }

    void insert(int key) {
        // Insert a new key in the tree
        root = insertRec(root, null, key);
    }

    TreeNode insertRec(TreeNode root, TreeNode parent, int key) {
        // Recursive function to insert a new key in the tree
        if (root == null) {
            TreeNode node = new TreeNode(key);
            node.parent = parent;
            return node;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, root, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, root, key);
        }

        return root;
    }

    TreeNode treeMinimum(TreeNode x) {

    }

    TreeNode treeSuccessor(TreeNode x) {
    }

    boolean isPrime(int n) {

    }

    TreeNode findPrime(TreeNode T) {

    }
}
