public class TreeNode extends Linkedlist{

    private int Value; // Hold data within this Node
    private TreeNode Left; // point to the next Node
    private TreeNode Right;

    //This method returns the Value of the Node
    public int getValue() {
        return this.Value;
    }

    //This method SETS the value of the Node
    public void setValue(int value) {
        this.Value = value;
    }

    //This method returns a Node that this current Node is pointing to
    //Constructor - Making an Node with NO value, and NO Node to point to
    TreeNode(){
        this.setValue(0);
        this.setRight(null);
        this.setLeft(null);
    }

    public TreeNode getLeft() {
        return this.Left;
    }

    public void setLeft(TreeNode left) {
        this.Left = left;
    }

    public TreeNode getRight() {
        return this.Right;
    }

    public void setRight(TreeNode right) {
        this.Right = right;
    }

    //Constructor - Making an Node WITH a value, and NO Node to point to
    TreeNode(int obj){
        this.setLeft(null);
        this.setValue(obj);
        this.setRight(null);
    }

}
