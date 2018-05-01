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

    void insert(TreeNode newNode) {
        if (root == null) {
            this.setRoot(newNode);
        } else {

        }
    }

}
