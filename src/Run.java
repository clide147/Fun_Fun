import java.util.Scanner;

//  Name: Mitchell
//  Date: 3/6/18
//  FileName: Run.java
//  Description: This is the main part of the program
class Run{

    public static void main(String[] args) {

        Stack myStack = new Stack();
        Queue myQueue = new Queue();

        Scanner in = new Scanner(System.in);
        String m = in.nextLine();
        char[] temp = m.toCharArray();

        for (char w: temp
             ) {
            myQueue.enQueue(w);
            myStack.push(w);
        }
        System.out.println("Empty myQueue:");
        while(!myQueue.isEmpty()){
            System.out.print(myQueue.deQueue().getValue());
        }
        System.out.println("\nEmpty myStack:");
        while(!myStack.isEmpty()){
            System.out.print(myStack.pop().getValue());
        }
     }


}