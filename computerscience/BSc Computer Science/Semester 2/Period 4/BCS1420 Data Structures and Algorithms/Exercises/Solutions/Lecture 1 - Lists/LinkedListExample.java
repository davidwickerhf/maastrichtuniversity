import java.lang.reflect.Array;

public class LinkedListExample {
    /* Test program to test above functions. Ideally
       this function should be in a separate user class.
       It is kept here to keep code compact */
    public static void main(String[] args) {
        /* Start with the empty list */
        LinkedList<Integer> llist = new LinkedList<>();
        //ArrayBasedList<Integer> llist = new ArrayBasedList<>();
        llist.add(1);
        llist.add(2);
        llist.add(3);
        llist.add(1);
        llist.add(2);
        llist.add(1);

        llist.begin();
        System.out.print("List contents: { ");
        while (llist.hasNext()) {
            System.out.print(llist.get() + " ");
            llist.next();
        }
        System.out.println(" }");

        llist.begin();
        System.out.print("List contents: { ");
        while (llist.hasNext()) {
            if (llist.get() == 2) {
                llist.delete();
            } else {
                System.out.print(llist.get() + " ");
                llist.next();
            }
        }
        System.out.println(" }");

        System.out.println("Count of nodes is " +
                llist.size());
    }
}