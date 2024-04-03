- Dictionaries and Hash Tables  
    - [ ] [Hash Maps - YouTube VideoLinks to an external site.](https://www.youtube.com/watch?v=eMymKAFYaCs "Link") (Essential)
    - [ ] [Hash functions - MIT VideoLinks to an external site.](https://www.youtube.com/watch?v=Nu8YGneFCWE&t=990s "Link") (Essential - from min 16:30 to 39:40; Optional the rest)  
    - [ ] From Algorithms (4th edition): Paragraph 3.4 (Essential)  
    - [ ] From Grokking Algorithms: Chapter 5 (Optional)  
- Algorithm Analysis [Big O Notation - YouTube VideoLinks to an external site.](https://www.youtube.com/watch?v=v4cd1O4zkGw "Link") (Optional)  
    - [ ] [Introduction to Data Structures and Algorithms - MIT VideoLinks to an external site.](https://www.youtube.com/watch?v=ZA-tUyM_y7s&t=1527s "Link") (Essential from min 25:30 to 39:00) From Algorithms (4th edition): Paragraph 1.4 (Essential) 
    - [ ] From Grokking Algorithms: Chapter 3 (Optional)
---
# Summary
### Hashing and Hash Tables

#### 1. Dictionary ADT: Understanding and Use-Cases

- **Definition**: The Dictionary Abstract Data Type (ADT) represents a collection of key-value pairs with unique keys. It supports operations such as adding, removing, and finding values based on their keys.
- **Appropriateness and Use-Cases**: It's particularly suitable for applications where quick access, insertion, and deletion of elements based on keys are required, such as databases, caching mechanisms, and maintaining records in various software systems.

#### 2. Basic Concepts of Hashing and Hash Tables

- **Hash Function**: A hash function takes a key as input and computes an index (a hash code) that determines where the key-value pair should be placed in the hash table. The efficiency of a hash function is critical as it affects the overall performance of the hash table.
  
- **Collisions**: Occur when two different keys produce the same hash code, leading to a conflict in assigning their key-value pairs to the same position in the hash table.
  
- **Load Factor**: The ratio of the number of entries to the number of buckets (slots) in the hash table. It's a measure that helps determine when to resize the hash table to maintain efficient operations.

#### Advantages and Disadvantages of Using Hash Tables

- **Advantages**:
	- Fast data retrieval: Provides constant time complexity, O(1), for search, insert, and delete operations on average.
	- Efficiently handles a large number of entries.

- **Disadvantages**:
	- Collisions: Requires additional data structures or algorithms to handle collisions, which can complicate the implementation.
	- Memory overhead: Pre-allocating memory can lead to space inefficiency if the load factor is not properly managed.
	- Poor hash function: Can lead to many collisions, significantly degrading performance.

#### Implementing a Basic Hash Table in Java

```java
class HashTable<K, V> {
    class HashNode<K, V> {
        K key;
        V value;
        HashNode<K, V> next;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private HashNode<K, V>[] chainArray;
    private int capacity;
    private int size;

    public HashTable() {
        capacity = 10;
        chainArray = new HashNode[capacity];
        size = 0;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void add(K key, V value) {
        int index = hash(key);
        HashNode<K, V> newNode = new HashNode<>(key, value);
        if (chainArray[index] == null) {
            chainArray[index] = newNode;
        } else {
            HashNode<K, V> temp = chainArray[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    public V get(K key) {
        int index = hash(key);
        HashNode<K, V> temp = chainArray[index];
        while (temp != null) {
            if (temp.key.equals(key)) {
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }

    // Additional methods like remove() can be implemented similarly
}
```

#### Collision Resolution Techniques

- **Chaining**: Involves creating a linked list for each slot/bucket in the hash table to handle collisions. Each key that hashes to the same index will be added to the list.
  
- **Open Addressing**: When a collision occurs, open addressing finds another empty slot according to a probing sequence (**linear probing**, quadratic probing, or double hashing) for the collided key.

#### Time and Space Complexity of Hash Tables

- **Time Complexity**: On average, O(1) for insert, delete, and search operations. In the worst case (all keys colliding), it could degrade to O(n).
  
- **Space Complexity**: O(n), where n is the number of key-value pairs stored in the hash table.

#### Trade-offs in Choosing a Hash Function

- A good hash function should distribute keys uniformly across the buckets to minimize collisions. The choice of hash function affects the performance, with trade-offs between computational complexity and the likelihood of collisions.

A simple and commonly used hashing function for demonstration purposes can be one that operates on strings. The idea is to convert the string into an integer that serves as the index in a hash table. This function will sum the ASCII values of the characters in the string, possibly scale it down to fit the hash table size, and then return the result as the hash code.

Here's a straightforward example of such a hashing function in Java:

```java
public class SimpleHashFunction {
    public static int hash(String key, int tableSize) {
        int hashVal = 0;
        
        for (int i = 0; i < key.length(); i++) {
            hashVal += key.charAt(i);
        }
        
        return hashVal % tableSize;
    }

    public static void main(String[] args) {
        String key = "example";
        int tableSize = 10; // Assuming we have a hash table of size 10
        int hashIndex = hash(key, tableSize);
        
        System.out.println("The hash index for \"" + key + "\" is: " + hashIndex);
    }
}
```

In this example, the `hash` function takes a string `key` and the size of the hash table (`tableSize`) as inputs. It iterates over each character in the string, adding up the ASCII values to produce a cumulative sum (`hashVal`). Finally, it uses the modulo operator (`%`) with the `tableSize` to ensure that the result fits within the bounds of the hash table, returning this value as the hash code.

- This hashing function is straightforward and easy to understand, making it useful for educational purposes.
- However, in practice, this method may lead to many collisions for similar strings or patterns of strings (like anagrams) since the order of characters isn't considered in the calculation.
- More sophisticated hashing functions consider factors such as character positions and use prime numbers to distribute keys more uniformly across the hash table, reducing the likelihood of collisions.
- The choice of a good hashing function depends on the nature of the keys and the application requirements.

#### Implementing Hash Tables in Real-world Applications

Hash tables are widely used in software development for tasks like:
- Implementing associative arrays.
- Building cache systems where quick data retrieval based on keys is necessary.
- Keeping track of unique objects or counting occurrences of elements.

# Lecture notes
## Dictionaries and hash tables
#### Hash maps
- Storing data (of lists of objects) in arrays is an issue as you cannot know from the start the size of the array
- Looking up items in a big array takes increasingly long time depending on the size of the array
- HashMaps combine Random Access Capabilities of arrays, and the dynamism of Linked Lists
- Data is held in a table structure:  ==key → value==
- HashMaps use a ==hash function== to determine where to store the data
	- Takes in a key
	- Creates a hash code → determines where to store the value
	- Identical keys will always point to the same value → Keys should be unique
- Hash Maps methods
	- put
	- get

#### Hash functions
###### Find function execution time
- We cannot do faster than Olog(n) time in a [[Comparison model]] of computation (we only consider comparison operations between keys of items)
	- We need to spend at least log(n), since the minimum height of the (balanced) Binary Tree we need to look through is log(n).

- But we can do faster in a non-restricted model of computation, when introducing the operation of Random Access

#### Textbook notes → [[Algorithms (3.4).pdf#page=1&selection=2,0,2,11|Algorithms (3.4), page 1]]
Hash tables are a data structure that offers efficient search, insert, and delete operations. They work by mapping keys to values using a hash function, which converts keys into array indices. This process allows for quick access to data by its key. 

- **==Basic Concept==**: At its simplest, if keys are small integers, they can directly serve as array indices, enabling quick access. Hashing extends this idea to more complex keys by transforming keys into array indices through arithmetic operations.
- **==Hash Function==**: The hash function is central to hashing, aiming to map different keys to unique indices in an array. However, achieving a perfect hash function, where no two keys hash to the same index, is challenging. Thus, collision resolution becomes a necessary part of hashing.
- **==Collision Resolution==**: When two keys hash to the same index, a process is required to resolve this collision. The document mentions two methods: **separate chaining** and **linear probing**.
- **==Time-Space Tradeoff:==** Hashing illustrates a tradeoff between time and space. Ideally, with unlimited memory, a key could directly index into a massive array for constant-time access. However, memory constraints make this impractical for large key sets. Conversely, minimal memory usage would necessitate slower search methods like sequential search.
- ==Practicality==: In practice, hashing seeks a balance, offering a reasonable compromise between time and space efficiency. This is achieved by adjusting hashing parameters, guided by probability theory, without needing to rewrite the algorithm for different scenarios.
- **==Hash Functions for Different Key Types==**: The hash function must be tailored to the key type (e.g., numbers, strings, or composite types like addresses), requiring different strategies for converting these keys into numerical indices.
- **==Modular Hashing==**: One common approach is modular hashing, where keys are converted to integers and then reduced modulo the size of the hash table to ensure they fit within the table's bounds.
## Quiz questions
- What is the worst-case time complexity of inserting an element into a dictionary that is implemented with an unsorted linked list, where each node in the list represents a key-value pair? → ==O(n)==