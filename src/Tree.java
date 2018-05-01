public class Tree implements Tree_Interface{

    private Node root;
    private int TreeSize;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public int getTreesize() {
        return this.TreeSize;
    }

    public void setTreesize(int treesize) {
        this.TreeSize = treesize;
    }

    Tree(){
        this.setRoot(null);
    }


}
