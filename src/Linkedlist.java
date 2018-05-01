public class Linkedlist implements LinkList_Interface  {

    private Node Head; //Store a Node that is the Head of the List
    private int ListSize; //Store the number of elements that are in this list

//Constructor
    Linkedlist(){
        setHead(null); // new list means no items, so no nodes
        setSize(0); // new list means no items, so size zero
    }

    //Method to create a new Node with object (n) and add it to the front.
    public void addFront(Object n) {
        Node temp = new Node(n); // create new node for temporary storage
        temp.setNext(this.getHead()); // new node points to current head
        this.setHead(temp); // update current head to be the new node
        incrementList(); // increment the size of the list.
    }

    //Method to create a new Node with object (o) and put it and the end of the list.
    public void addBack(Object o){
        Node temp = new Node(o); // create new node for temporary storage
        if(this.isEmpty()){
            this.setHead(temp);
            incrementList();
        }
        else {
            Node ptr = this.getHead(); // create a ptr so we don't lose our current head
            while (ptr.getNext() != null) { // the last element of the list will point to null in a singingly linked list.
                ptr = ptr.getNext(); // if the next node is not null then ptr should become the next node.
            }
            ptr.setNext(temp); // make the last element point to the new node with the new object
            incrementList(); // increment the size of the list

        }
    }

    // Check if the List is empty
    public boolean isEmpty(){
        boolean temp = false;
        if(this.getSize() == 0)
            temp = true;
        return temp;
    }

    // return the List Size
    public int getSize() {
        return this.ListSize;
    }

    // Set the List Size
    public void setSize(int ls){
        this.ListSize = ls;
    }

    // return the Head of the list
    public Node getHead(){
        return this.Head;
    }

    // set the head of the list
    public void setHead(Node nde){
        this.Head = nde;
    }

    // return and remove from the front of the list
    public Node removeFront() {
        Node temp = this.getHead(); // create a temporary node and hold the value of head
        if(!this.isEmpty()) { // double check if the list is empty or not
            this.setHead(temp.getNext()); // point the head to the next one down (automatically dropping the old one)
            decrementList(); // decrement the size of the list
        }
        return temp; // return head that we got in the first line
    }

    // increment the list
    private void incrementList(){
        this.ListSize = ListSize + 1;
    }

    //decrement the list
    private void decrementList(){
        this.ListSize = ListSize - 1;
    }

}
