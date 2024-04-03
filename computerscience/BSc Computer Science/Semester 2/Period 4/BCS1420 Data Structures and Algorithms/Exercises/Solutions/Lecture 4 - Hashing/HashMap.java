import java.util.LinkedList;

/* --- Question 1 ---
 When a collision occurs, the corresponding value in the table gets overwritten with the new value.
 If we take 129 % TABLE_SIZE = 1, meaning that the value written at position 1 in the table gets overwritten.
 */
/* --- Question 2 ---
 There are multiple ways to handle this. We can change the hash itself, but that would cause the TABLE_SIZE criterion to
 become redundant. A more effective way to handle this is to utilize a LinkedList to store a list of all HashEntry
 objects at a particular table location.
 */
/* --- Question 3 ---
 Both collisions in the original test are now resolved and all the inserted values are printed.
 */
/* --- Question 4 ---
 Insertion is constant O(1) - new values are inserted at the end (or start) of the corresponding LinkedList in the table.
 Retrieval is O(n) worst case - must iterate through all values in the corresponding LinkedList to obtain the key.
 If all elements were inserted at the same hash value, this would mean n iterations. O(1) is possible in the best case
 when there are no collisions.
 */
/* --- Question 5 ---
 Data is stored very inefficiently. Inserting 5000 values leads to at least 4872 collisions for the given table size.
 An efficient solution to this would be to increase the table size to, say, 5000.
 */
public class HashMap<E> {

    private final static int TABLE_SIZE = 128;
    private int collisions = 0;
    LinkedList<HashEntry<E>>[] table;

    public HashMap() {
        table = (LinkedList<HashEntry<E>>[]) new LinkedList[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++)
            table[i] = null;
    }

    public E get(int key) {
        int hash = (key % TABLE_SIZE);

        if (table[hash] == null)
            return null;
        else
            for(HashEntry<E> entry: table[hash])
                if(entry.getKey() == key)
                    return entry.getValue();
            return null;
    }

    public void put(int key, E value) {
        int hash = (key % TABLE_SIZE);
        HashEntry<E> entry = new HashEntry<>(key, value);
        if (table[hash] != null) {
            table[hash].add(entry);
            collisions += 1;
        } else{
            LinkedList<HashEntry<E>> list = new LinkedList<>();
            list.add(entry);
            table[hash] = list;
        }
    }

    public int getCollisions() { return collisions; }
}