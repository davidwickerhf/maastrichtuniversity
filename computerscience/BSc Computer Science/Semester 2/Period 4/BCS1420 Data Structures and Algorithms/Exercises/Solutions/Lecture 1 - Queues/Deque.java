import java.util.LinkedList;

/*
This is effectively O(1) if the addLast / removeLast operations were implemented with a doubly-linked list, allowing for
addFirst / addLast / removeFirst / removeLast.
Otherwise, the addLast / removeLast can be O(n) as it will need to cycle from beginning to end of the queue.
 */
public class Deque<E> {

    private LinkedList<E> list;
    private E first;
    private E last;

    public Deque() {
        list = new LinkedList<>();
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return list.size();
    }

    public void addFirst(E data) {
        first = data;
        list.addFirst(first);
    }

    public E removeFirst() {
        E temp = first;
        list.removeFirst();
        first = list.getFirst();
        return temp;
    }

    public void addLast(E data) {
        last = data;
        list.addLast(data);
    }

    public E removeLast() {
        E temp = last;
        list.removeLast();
        last = list.getLast();
        return temp;
    }
}