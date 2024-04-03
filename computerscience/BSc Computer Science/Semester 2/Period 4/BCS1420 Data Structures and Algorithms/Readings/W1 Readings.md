- Introduction to Data Structures and Algorithms  
    [Introduction to Data Structures and Algorithms - [ ] MIT VideoLinks to an external site.](https://www.youtube.com/watch?v=ZA-tUyM_y7s "Link") (Optional) 
- [ ] Object Oriented Programming  
    [Object Oriented Programming Principles - Slides](https://canvas.maastrichtuniversity.nl/courses/18782/files/3399942/download?download_frd=1 "OOP Principles.pdf") (Essential)  
    [OOP in Java - Slides](https://canvas.maastrichtuniversity.nl/courses/18782/files/3400073/download?download_frd=1 "OOP in Java.pdf") (Essential)  
    From Algorithms (4th edition): Paragraph 1.1 (Essential) 
- [ ] Recursion and Pseudocode  
    [Recursion - Slides](https://canvas.maastrichtuniversity.nl/courses/18782/files/3400040/download?download_frd=1 "Recursion.pdf") (Essential)  
    From Algorithms (4th edition): Paragraph 1.1 (Essential)  
    [Recursion - YouTube videoLinks to an external site.](https://www.youtube.com/watch?v=KEEKn7Me-ms "Link") (Optional)
    [Pseudocode](https://canvas.maastrichtuniversity.nl/courses/18782/files/3426839/download?download_frd=1 "Pseudocode.pdf") (Essential)
- - -
- [ ] Abstract Data Types (ADT)  
    From Algorithms (4th edition): Paragraph 1.2 (Essential) 
- [ ] List, Array-based List, Linked List   
    From Algorithms (4th edition): Paragraph 1.3 (Essential)
- [ ] Stack and Queue  
	From Algorithms (4th edition): Paragraph 1.3 (Essential)
- [ ] Set  
	From Algorithms (4th edition): Paragraph 1.3 (Essential) - #Set here referred as Bag
- - - 
### OOP Principles and Abstract Data Types (ADTs)

#### 1. Understanding Encapsulation, Inheritance, and Polymorphism

- **Encapsulation** is the principle of bundling the data (attributes) and methods that operate on the data into a single unit or class and restricting access to some of the object's components. This principle ensures that an object's internal state cannot be directly accessed or modified from outside its methods, providing a controlled interface for interaction. In the context of ADTs, encapsulation allows for defining a data type by its operations without revealing its internal representation.

- **Inheritance** is a mechanism wherein a new class inherits the properties and behavior (methods) of an existing class. This helps in code reusability and establishing a relationship between the superclass (or parent class) and subclass (or derived class) where the subclass can override or extend the functionality of the superclass. For ADTs, inheritance can be used to create hierarchical structures of types, where more specific ADTs inherit from more generic ones, promoting code reusability and extensibility.

- **Polymorphism** allows objects of different classes to be treated as objects of a common super class. It enables a single interface to represent different underlying forms (data types), and methods to do different things based on the object it is acting upon. This is crucial for ADTs as it allows the implementation of an ADT to be changed without affecting the code that uses the ADT. Polymorphism supports the concept of "programming to an interface, not an implementation."

#### 2. Designing and Implementing a Class for an ADT

To design a class that represents an ADT using OOP principles:
1. **Identify the ADT's operations**: Determine the behavior that the ADT needs to support. For example, a Stack ADT needs operations like `push`, `pop`, and `peek`.
2. **Define the class and its interface**: Create a class that encapsulates the data and methods. Use access modifiers to control the visibility of members.
3. **Implement the operations**: Write the methods that perform the operations defined by the ADT.

Example: Implementing a Stack ADT in Java.

```java
public class StackADT {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public StackADT() {
        elements = new int[DEFAULT_CAPACITY];
    }

    public void push(int element) {
        if (size >= elements.length) {
            // Increase the capacity
        }
        elements[size++] = element;
    }

    public int pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return elements[--size];
    }

    public int peek() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return elements[size - 1];
    }
}
```

#### 3. Using Interfaces for ADTs

Interfaces in Java define a contract or a set of methods that a class must implement. Using interfaces to define the behavior of an ADT allows multiple concrete implementations of the ADT to exist, providing flexibility and decoupling the interface from the implementation.

Example: Defining and implementing a Stack interface.

```java
public interface StackInterface {
    void push(int element);
    int pop();
    int peek();
}

public class LinkedStack implements StackInterface {
    // Implementation using a linked list
}

public class ArrayStack implements StackInterface {
    // Implementation using an array
}
```

#### 4. ADTs vs. Concrete Implementations
- An **Abstract Data Type (ADT)** is a theoretical concept that defines a data type purely by the operations it supports, without specifying how these operations are implemented. It focuses on "what" operations are performed.
- A **Concrete Implementation** of an ADT, on the other hand, provides the specific details of how the ADT's operations are carried out. It addresses the "how" aspect, including data storage, algorithms for operations, and performance considerations.

In essence, an ADT specifies a set of operations (an interface) without dictating how those operations are executed, leaving the details to the concrete implementations. This separation of concerns enhances modularity, allows for changing implementation details without altering the way the ADT is used, and facilitates polymorphism in object-oriented programming.

- - - 

## Lists
#### 1. Linear Data Structure: Arrays vs. Linked Lists

A **linear data structure** organizes data sequentially where elements are arranged in order. Two common examples are arrays and linked lists.

- **Arrays**:
  - Store elements in contiguous memory locations.
  - Allow direct access to any element (random access) using an index, making access time O(1).
  - Size is fixed upon creation, making them less flexible if elements need to be added or removed frequently.

- **Linked Lists**:
  - Consist of nodes where each node contains data and a reference (or link) to the next node in the sequence.
  - Do not store elements in contiguous memory; each element points to the next.
  - Allow dynamic resizing as elements can be added or removed without reallocating the entire structure, but accessing an element requires sequential traversal from the head of the list, making access time O(n).

#### 2. Implementing a Basic Singly Linked List in Java

Here’s a basic implementation of a singly linked list in Java:

```java
class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    ListNode head;

    // Method to add a node at the front of the list
    void addFront(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to delete the first occurrence of a key in the list
    void deleteNode(int key) {
        ListNode temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return; // Key was not present
        prev.next = temp.next;
    }

    // Method to search for a node in the list
    boolean search(int key) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }
        return false;
    }
}
```

#### 3. Limitations of Array-Based Lists and Linked-Lists

- **Array-Based Lists**:
  - Fixed size: Need to specify the size upfront.
  - Resizing is expensive: To add more elements than the initial size, you must create a new array and copy elements.
  - Efficient random access: Directly accessing elements via index is fast.

- **Linked-Lists**:
  - No random access: To access an element, you must traverse from the head to that element.
  - Extra memory: Each node requires additional memory for the reference (or pointer) to the next node.
  - Pointer operations: Errors in managing pointers (like forgetting to update them) can lead to bugs like memory leaks or lost nodes.

#### 4. Time and Space Complexities on a Singly Linked List
- **Insert**: 
  - At the head: O(1), as it involves changing the head pointer.
  - At the tail or in the middle: O(n), as it requires traversal to the insertion point.
- **Delete**:
  - At the head: O(1), similar to insertion at the head.
  - Deleting a specific value or at the tail: O(n), need to find the node or the node before the last.
- **Search**: O(n), as it may require scanning each node until the desired value is found.
- **Space Complexity**: O(n), where n is the number of elements in the linked list.

#### 5. Doubly Linked List and Its Complexities

A **doubly linked list** is similar to a singly linked list, but each node has two links: one to the next node and another to the previous node. This allows traversal in both directions.
- **Insert** and **Delete**:
  - Head/Tail Insertion: O(1), as it involves changing a few pointers.
  - Middle Insertion/Deletion: O(n) for accessing the point of action, but once the position is known, updating pointers is O(1).
- **Search**: O(n), the same as in singly linked lists, as it involves linearly searching through the nodes.
- **Space Complexity**: O(n). Each node now requires extra memory for an additional previous pointer compared to a singly linked list, making the space requirement slightly higher for the same number of nodes.
Doubly linked lists provide more flexibility at the cost of extra memory usage per node and slightly more complex pointer management.

Implementing a doubly linked list in Java involves creating a `Node` class that holds the data and two pointers (or references) to the previous and next nodes. Here is a simple example that includes basic operations such as insertion at the beginning and end, deletion of a node by key, and display of the list contents.

#### 6. Doubly Linked List Class
```java
class Node {
    int data;
    Node prev;
    Node next;

    // Constructor to create a new node
    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
```

```java
class DoublyLinkedList {
    Node head;

    // Constructor
    DoublyLinkedList() {
        head = null;
    }

    // Adding a node at the front of the list
    void addFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;

        if (head != null) {
            head.prev = newNode;
        }

        head = newNode;
    }

    // Adding a node at the end of the list
    void addEnd(int data) {
        Node newNode = new Node(data);
        Node last = head; // Used to traverse till the last node

        newNode.next = null; // This new node is going to be the last node

        // If the Linked List is empty, then make the new node as head
        if (head == null) {
            newNode.prev = null;
            head = newNode;
            return;
        }

        // Else traverse till the last node
        while (last.next != null) {
            last = last.next;
        }

        // Change the next of last node
        last.next = newNode;

        // Make last node as previous of new node
        newNode.prev = last;
    }

    // Delete a node by key
    void deleteNode(int key) {
        Node temp = head;

        // If head node itself holds the key
        if (temp != null && temp.data == key) {
            head = temp.next;
            head.prev = null;
            return;
        }

        // Search for the key to be deleted
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        // If key was not present in the list
        if (temp == null) return;

        // Unlink the node from the list
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
    }

    // Print the contents of the linked list starting from the head
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
```

- - - 

## Stacks and Queues
#### 1. Overview and differences
###### Stack:
  - A stack is a linear data structure operating on a **==Last In, First Out (LIFO)==** principle. This means the last element added (pushed) to the stack will be the first one removed (popped).
  - **Time Complexities**: 
    - Push: O(1)
    - Pop: O(1)
    - Peek: O(1)
  - **Space Complexity**: O(n), where n is the number of elements in the stack.
###### Queue:
  - A queue is a linear data structure that operates on a **==First In, First Out (FIFO)==** principle. The first element added (enqueued) is the first one to be removed (dequeued).
  - **Time Complexities**:
    - Enqueue: O(1)
    - Dequeue: O(1)
    - Peek: O(1)
  - **Space Complexity**: O(n), where n is the number of elements in the queue.
###### Differences:
  - The main difference lies in the order in which elements are removed: a stack removes the most recently added element first, while a queue removes the element that has been in the structure the longest.
#### 2. Implementing Basic Stack and Queue in Java
###### Stack Implementation:

```java
class Stack {
    private List<Integer> elements = new ArrayList<>();

    public void push(int data) {
        elements.add(data);
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.remove(elements.size() - 1);
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.get(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}
```

###### Queue Implementation:
```java
class Queue {
    private List<Integer> elements = new LinkedList<>();

    public void enqueue(int data) {
        elements.add(data);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return elements.remove(0);
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return elements.get(0);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}
```

#### 3. Time and Space Complexities of Basic Operations
- For both stacks and queues, the basic operations (`push`/`enqueue`, `pop`/`dequeue`, and `peek`) have a time complexity of O(1), indicating these operations can be performed in constant time.
- The space complexity for both data structures is O(n), as they need to store n elements.

#### 4. Use Cases of Stacks and Queues in Real-world Scenarios
- **Stack Use Cases:**
	- **Undo mechanisms** in text editors use stacks to keep track of operations for reverting actions.
	- **Call Stack** in programming languages tracks function calls and returns, where the last function called is the first to be returned from.
	- **Syntax parsing** in compilers and interpreters often utilize stacks to manage tokens and validate syntax.
- **Queue Use Cases**:
	- **Print Queue** in operating systems to manage print jobs in the order they were submitted.
	- **Task scheduling** where tasks are managed in a FIFO order to ensure fairness or priority.
	- **Buffering data streams**, such as in video streaming services, where data packets are received and processed in the order they arrive.
- - - 

## Sets
#### 1. Concept of a Set and Differences Between Sets and Lists

- **Set**:
	- A set is an abstract data type that can store unique values, without any particular order. It is characterized by its ability to prevent duplicate entries and is mainly used for membership testing, removing duplicates from a sequence, and performing mathematical operations like union, intersection, difference, and symmetric difference.

- **Differences Between Sets and Lists**:
	- **Order**: Lists maintain the order of elements; sets do not.
	- **Duplicates**: Lists can contain duplicate elements; sets cannot.
	- **Performance**: Due to the unique nature of each element in a set, operations like insert, delete, and search can be optimized and are often faster than in lists, especially for large volumes of data.

#### 2. Implementing a Basic Set in Java Using an Array

```java
public class ArraySet {
    private int[] elements;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public ArraySet() {
        this.elements = new int[INITIAL_CAPACITY];
        this.size = 0;
    }

    public boolean insert(int value) {
        if (!contains(value)) {
            if (size == elements.length) {
                increaseCapacity();
            }
            elements[size++] = value;
            return true;
        }
        return false;
    }

    public boolean delete(int value) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == value) {
                elements[i] = elements[size - 1]; // Replace with the last element
                size--;
                return true;
            }
        }
        return false;
    }

    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == value) {
                return true;
            }
        }
        return false;
    }

    private void increaseCapacity() {
        int[] newElements = new int[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }
}
```

#### 3. Time and Space Complexities of Basic Operations on a Set

- **Insert**:
	- Time Complexity: O(n) in the worst case, due to the need to check for duplicates.
	- Space Complexity: O(n) for storing n elements. Inserting an element may require reallocating the array, but the operation's space complexity remains linear with the number of elements.
- **Delete**:
	- Time Complexity: O(n), as it might need to search through the array to find the element to delete.
- **Search** (contains):
	- Time Complexity: O(n), as in the worst case, it might need to check each element.

Note: These complexities assume a simple array implementation without optimizations like hashing.

#### 4. Use Cases of Sets in Real-world Scenarios

- **Removing Duplicates**: Sets are inherently unique collections, making them ideal for filtering out duplicate elements from data.
- **Membership Testing**: Quickly determining whether an item is part of a collection.
- **Mathematical Operations**: Performing set operations like unions, intersections, differences, which are crucial in various algorithms and data processing tasks.
- **Database Queries**: Sets are often used in databases to handle queries that involve unique records.
- **Permission Management**: Using sets to manage unique permissions or roles assigned to users in software systems.

## Recursion

Recursion is a programming technique where a function calls itself directly or indirectly, allowing problems to be solved in a clear and concise manner. It's especially useful for tasks that can be broken down into similar subtasks.

- **Base Case**: Every recursive function must have a base case, which is a condition that stops the recursion to prevent infinite loops.
- **Recursive Case**: The part of the function where recursion occurs, calling itself with a different argument.

#### Use Cases of Recursion

- **Tree Traversal**: Recursion is natural for navigating tree structures, such as file systems or DOM trees in web development.
- **Sorting Algorithms**: Many efficient sorting algorithms, like QuickSort and MergeSort, are implemented recursively.
- **Divide and Conquer Algorithms**: Problems that can be divided into similar sub-problems of smaller size, solved independently, and combined are well-suited for recursion.
- **Dynamic Programming**: Some dynamic programming problems use recursion with memoization to solve subproblems only once.

#### Time and Space Complexities

- The time and space complexities of recursive algorithms depend on the number of recursive calls and the space each call takes on the call stack.
- For example, a simple binary recursion that divides a problem in half at each step (like binary search) has a time complexity of O(log n) and a space complexity related to the depth of the recursion, which is also O(log n).
- A recursion that makes multiple calls at each step (like calculating Fibonacci numbers without memoization) can have exponential time complexity (O(2^n)) and linear space complexity (O(n)) due to the depth of the recursive call stack.