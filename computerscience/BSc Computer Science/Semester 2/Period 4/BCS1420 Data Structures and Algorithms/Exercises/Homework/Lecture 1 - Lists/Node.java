public class Node<T>
{
    T data;
    Node<T> next;
    Node(T d)  { data = d;  next = null; }

    public void setNext(Node<T> next) {

    }

    public Node<T> getNext() {

    }

    public T getElement() {
    	return data;
    }
}