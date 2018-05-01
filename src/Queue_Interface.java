public interface Queue_Interface {
    void enQueue(Object obj);
    Node deQueue();
    void setHead(Node head);
    int getSize();
    void setSize(int size);
    Linkedlist getQueue();
    boolean isEmpty();

}
