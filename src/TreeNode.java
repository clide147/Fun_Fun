public class TreeNode extends Linkedlist{

    private Object Value; // Hold data within this Node
    private Node Left; // point to the next Node
    private Node Right;

    //This method returns the Value of the Node
    public Object getValue() {
        return this.Value;
    }

    //This method SETS the value of the Node
    public void setValue(Object value) {
        this.Value = value;
    }

    //This method returns a Node that this current Node is pointing to
    //Constructor - Making an Node with NO value, and NO Node to point to
    TreeNode(){
        this.setValue(null);
        this.setRight(null);
        this.setLeft(null);
    }

    public Node getLeft() {
        return Left;
    }

    public void setLeft(Node left) {
        Left = left;
    }

    public Node getRight() {
        return Right;
    }

    public void setRight(Node right) {
        Right = right;
    }

    //Constructor - Making an Node WITH a value, and NO Node to point to
    TreeNode(Object obj){
        this.setLeft(null);
        this.setValue(obj);
        this.setRight(null);
    }

}
