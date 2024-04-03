public interface IteratableList<T>
{
    /* Inserts a new element before the current position. */
    void add(T data);

    /* Delete the current position */
    void delete();

    /* Get element at the current position */
    T get();

    /* Get element at the element i positions in the future */
    T get(int i);

    /* Moves the iterator 1 position */
    T next();

    /* Reset the iterator to the beginning of the list */
    void begin();

    /* Returns false when the end of the list is reached */
    boolean hasNext();

    /* Returns count of nodes in linked list */
    public int size();
}