public class Stack extends Linkedlist implements Stack_Interface {

    private int Stack_size; // hold the size of the stack
    private Linkedlist myStack; // hold the link to the linked list
    private int FullLimit; // hold the value of the limiter size of stack


    // Constructor
    Stack(){
        this.setFullLimit(-1); // set the limit of the stack to -1, meaning there is non
        this.setStack_size(0); // set the size to zero because there are no elements
        myStack = new Linkedlist(); // create a linked list instead of an array to save space and dynamic resizing
    }

    // push in stack terms means to "add on top" of the other elements
    public void push(Object obj) {
        if(isFull()){ // double check if it is full
            System.out.println("Stack is Full");
        }
        else{ // not full??
        this.getStack().addFront(obj); // make a call to the linked list to add to front (a.k.a adding on top)
        incrementStack(); // increment the size counter
    }
    }

    // returns the linked list with all the values
    private Linkedlist getStack() {
        return myStack;
    }

    //returns just the top element of the stack (a.k.a the head of the linked list)
    public Node getTop() {
        return getStack().getHead();
    }

    // returns the top value of the stack and takes it off it.
    public Node pop() {
        Node temp = getStack().getHead(); // create a node to store the current Top (May point to null)
        if(!this.isEmpty()) { // check if the stack is empty, not empty?
            this.getStack().removeFront(); // call to linked list to remove front and point to the next one
            decrementStack(); // update the counter
        }
        else{ // stack is empty??
            System.out.println("Stack is Empty"); // Derp
        }
        return temp;
    }

    // method to check if the stack is empty
    public boolean isEmpty() {
        boolean temp = false;
        if(this.getSize() == 0)
            temp = true;
        return temp;
    }

    // method to check if the stack is full (just in case we need it)
    public boolean isFull() {
        boolean temp = false;
        if(this.getFullLimit() == this.getSize()){
            temp = true;
        }
        return temp;
    }

    // returns the size of the stack
    public int getSize() {
        return this.Stack_size;
    }

    // sets the size of the stack
    public void setSize(int s){
        Stack_size = s;
    }

    // increment stack counter
    private void incrementStack(){
        this.setSize(this.getSize() + 1);
    }

    // decrement stack counter
    private void decrementStack(){
        this.setSize(this.getSize() - 1);
    }

    // Set the size of the stack
    private void setStack_size(int stack_size) {
        this.Stack_size = stack_size;
    }

    // set the limit for the stack
    public void setFullLimit(int fullLimit) {
        this.FullLimit = fullLimit;
    }


    // returns the stack limit
    public int getFullLimit() {
        return this.FullLimit;
    }
}
