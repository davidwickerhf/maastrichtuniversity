// Singly Linked List class
public class LinkedList<T> implements IteratableList<T>
{

    //Head points to node before first node with content
    Node<T> head = new Node(null);  // head of list

    Node<T> iteratorNode = head; // has to point to element before the current element. THis allows easy delpeting of elements

    /* Inserts a new element at after current position */
    public void add(T data) {
    }

    /* Delete the element at current position*/
    public void delete() {
    }

    /* Get element at the current position */
    public T get() {
        return iteratorNode.getNext().getElement();
    }
    public T get(int i) {
    }

    /* Moves the iterator 1 position */
    public T next() {
    }
    public boolean hasNext() {

    }

    /* Reset the iterator to the beginning of the list */
    public void begin() {
        iteratorNode = head;
    }

    /* Returns count of nodes in linked list */
    public int size() {
    }
}