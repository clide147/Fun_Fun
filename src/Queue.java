public class Queue extends Linkedlist implements Queue_Interface {

    int size; // store the value of the size of the Queue
    Linkedlist myQueue; // store the nodes withing the linked list

    //Create a new Queue
    Queue(){
        this.setSize(0); // no elements
        myQueue = new Linkedlist(); // create the linked list
    }

    // add an elemnt to the linked list
    public void enQueue(Object obj){
        this.getQueue().addBack(obj); // add element to the linked list
        incrementQueue(); // increment the counter
    }

    // remove element from the linked list
    public Node deQueue(){
        Node temp = new Node(); // create a temporary node
        if(!this.isEmpty()) { // double check if it is empty
            temp = this.getQueue().removeFront(); // set the node euqal to the front Node, and remove from the front
            decrementQueue(); // decrement the counter
        }
        else{
            System.out.println("Queue is Empty"); // return statement if it is empty
        }
        return temp;
    }

    // returns the value of the Size of the Queue
    public int getSize() {
        return this.size;
    }

    // sets the value of the Queue
    public void setSize(int size) {
        this.size = size;
    }

    // returns the Linked List created to maintain the Queue
    public Linkedlist getQueue(){
        return this.myQueue;
    }

    // Method to check if the Queue is empty or not.
    public boolean isEmpty(){
        boolean temp = false;
        if(this.getSize() == 0)
            temp = true;
        return temp;
    }

    // Method to increment the Queue
    private void incrementQueue(){
        this.setSize(this.getSize() + 1);
    }

    // Method to decrement the Queue
    private void decrementQueue(){
        this.setSize(this.getSize() - 1);
    }
}
