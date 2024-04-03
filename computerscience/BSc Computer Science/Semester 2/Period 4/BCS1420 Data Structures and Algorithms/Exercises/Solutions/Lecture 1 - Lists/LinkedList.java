// Singly Linked List class
public class LinkedList<T> implements IteratableList<T>
{

    //Head points to node before first node with content
    Node<T> head = new Node<>(null);  // head of list

    Node<T> iteratorNode = head; // has to point to element before the current element. This allows easy delpeting of elements

    /* Inserts a new element at after current position */
    public void add(T data) {
        Node<T> temp = iteratorNode.getNext();
        Node<T> newNode = new Node<>(data);
        newNode.setNext(temp);
        iteratorNode.setNext(newNode);
    }

    /* Delete the element at current position*/
    public void delete() {
        Node<T> current = iteratorNode.getNext();
        iteratorNode.setNext(current.getNext());
    }

    /* Get element at the current position */
    public T get() {
        return iteratorNode.getNext().getElement();
    }

    /* Get element at the element i positions in the future */
    public T get(int i) {
        Node<T> temp = iteratorNode.getNext();
        for(int j = 1; j < i; j++){
            temp = iteratorNode.getNext();
        }
        return temp.getElement();
    }

    /* Moves the iterator 1 position */
    public T next() {
        iteratorNode = iteratorNode.getNext();
        return iteratorNode.getElement();
    }
    public boolean hasNext() {
        return iteratorNode.getNext() != null;
    }

    /* Reset the iterator to the beginning of the list */
    public void begin() {
        iteratorNode = head;
    }

    /* Returns count of nodes in linked list */
    public int size() {
        int count = 0; // current node
        Node<T> iteratedNode = head;
        while (iteratedNode.getNext() != null){
            count+=1;
            iteratedNode = iteratedNode.getNext();
        }
        return count;
    }
}