public class Node extends Linkedlist{

    private Object Value; // Hold data within this Node
    private Node Next; // point to the next Node


    //This method returns the Value of the Node
    public Object getValue() {
        return this.Value;
    }

    //This method SETS the value of the Node
    public void setValue(Object value) {
        this.Value = value;
    }

    //This method returns a Node that this current Node is pointing to
    public Node getNext() {
        return this.Next;
    }

    //This method SETS a Node where the current Node needs to point to
    public void setNext(Node next) {
        this.Next = next;
    }

    //Constructor - Making an Node with NO value, and NO Node to point to
    Node(){
        this.setNext(null);
        this.setValue(null);
    }

    //Constructor - Making an Node WITH a value, and NO Node to point to
    Node(Object obj){
        this.setNext(null);
        this.setValue(obj);
    }

}
