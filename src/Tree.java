public class Tree implements Tree_Interface {

    private TreeNode root;
    private int TreeSize;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public int getTreesize() {
        return this.TreeSize;
    }

    public void setTreesize(int treesize) {
        this.TreeSize = treesize;
    }

    Tree() {
        this.setRoot(null);
    }

    private TreeNode addRecursive(TreeNode current, int value) {
        if (current == null) {
            return new TreeNode(value);
        }

        if (value < current.getValue()) {
            current.setLeft(addRecursive(current.getLeft(), value));
        } else if (value > current.getValue()) {
            current.setRight(addRecursive(current.getRight(), value));
        } else {
            // value already exists
            return current;
        }

        return current;
    }
    public void add(int value) {
        this.setRoot(addRecursive(this.getRoot(), value));
    }
    public void traverseInOrder(TreeNode node) {
        if (node != null) {
            traverseInOrder(node.getLeft());
            System.out.print(" " + node.getValue());
            traverseInOrder(node.getRight());
        }
    }
}
