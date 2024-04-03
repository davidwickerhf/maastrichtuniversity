- [[#Table of Contents|Table of Contents]]
- [[#Introduction to ADTs|Introduction to ADTs]]
- [[#Characteristics of ADTs|Characteristics of ADTs]]
- [[#Common ADTs and Their Operations|Common ADTs and Their Operations]]
	- [[#Common ADTs and Their Operations#Stack|Stack]]
	- [[#Common ADTs and Their Operations#Queue|Queue]]
	- [[#Common ADTs and Their Operations#List|List]]
	- [[#Common ADTs and Their Operations#Set|Set]]
	- [[#Common ADTs and Their Operations#Map (Dictionary)|Map (Dictionary)]]
- [[#Implementing ADTs in Java|Implementing ADTs in Java]]
	- [[#Implementing ADTs in Java#Stack Implementation|Stack Implementation]]
	- [[#Implementing ADTs in Java#Queue Implementation|Queue Implementation]]
- [[#ADTs vs. Data Structures|ADTs vs. Data Structures]]
- [[#6. The Role of Interfaces in ADTs|6. The Role of Interfaces in ADTs]]
- [[#7. Conclusion|7. Conclusion]]

Abstract Data Types (ADTs) provide a theoretical framework for data storage and operations, abstracting the details of implementation from the user.
#### Table of Contents
1. Introduction to ADTs
2. Characteristics of ADTs
3. Common ADTs and Their Operations
   - Stack
   - Queue
   - List
   - Set
   - Map (Dictionary)
4. Implementing ADTs in Java
   - Stack Implementation
   - Queue Implementation
5. ADTs vs. Data Structures
6. The Role of Interfaces in ADTs
7. Conclusion
8. References
#### Introduction to ADTs

Abstract Data Types define a data type logically in terms of its values and operations without specifying how these operations will be implemented. This abstraction allows programmers to focus on the interface and behavior of the data type rather than its implementation details.

#### Characteristics of ADTs

- **Encapsulation**: ADTs encapsulate the data and the operations that can be performed on the data.
- **Abstraction**: They provide a high-level interface, hiding the details of implementation.
- **Reusability**: Due to their abstract nature, ADTs can be implemented in various ways, allowing for code reusability.

#### Common ADTs and Their Operations

##### Stack
A stack is a LIFO (Last In, First Out) data structure.
- **Operations**: `push` (add an item), `pop` (remove the most recently added item), and `peek` (view the top item).
##### Queue
A queue is a FIFO (First In, First Out) data structure.
- **Operations**: `enqueue` (add an item to the end), `dequeue` (remove the item from the front), and `peek` (view the front item).
##### List
A list is an ordered collection of items.
- **Operations**: `insert` (add an item at a position), `delete` (remove an item), and `find` (find an item by value).
##### Set
A set is a collection of distinct items.
- **Operations**: `add` (add an item), `remove` (remove an item), and `contains` (check if an item exists).
##### Map (Dictionary)
A map is a collection of key-value pairs.
- **Operations**: `put` (add a key-value pair), `get` (get value by key), and `remove` (remove a key-value pair).

#### Implementing ADTs in Java

##### Stack Implementation

```java
class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void push(T element) {
        list.addFirst(element);
    }

    public T pop() {
        return list.removeFirst();
    }

    public T peek() {
        return list.getFirst();
    }
}
```

##### Queue Implementation

```java
class Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void enqueue(T element) {
        list.addLast(element);
    }

    public T dequeue() {
        return list.removeFirst();
    }

    public T peek() {
        return list.getFirst();
    }
}
```

#### ADTs vs. Data Structures

While ADTs define the logical form of a data type, data structures provide the concrete implementation. For example, a List ADT can be implemented using an array or a linked list data structure.

## 6. The Role of Interfaces in ADTs

In Java, interfaces are used to define the behavior of ADTs, ensuring that all concrete implementations provide the necessary operations.

```java
public interface StackInterface<T> {
    void push(T element);
    T pop();
    T peek();
}
```

## 7. Conclusion

Abstract Data Types are a cornerstone of efficient and effective software development, allowing programmers to focus on what data types do rather than how they do it. By understanding and using ADTs, developers can create more modular, reusable, and maintainable code.


