- Dictionaries and Hash Tables  
    - [ ] [Hash Maps - YouTube VideoLinks to an external site.](https://www.youtube.com/watch?v=eMymKAFYaCs "Link") (Essential)
    - [ ] [Hash functions - MIT VideoLinks to an external site.](https://www.youtube.com/watch?v=Nu8YGneFCWE&t=990s "Link") (Essential - from min 16:30 to 39:40; Optional the rest)  
    - [ ] From Algorithms (4th edition): Paragraph 3.4 (Essential)  
    - [ ] From Grokking Algorithms: Chapter 5 (Optional)  
- Algorithm Analysis [Big O Notation - YouTube VideoLinks to an external site.](https://www.youtube.com/watch?v=v4cd1O4zkGw "Link") (Optional)  
    - [ ] [Introduction to Data Structures and Algorithms - MIT VideoLinks to an external site.](https://www.youtube.com/watch?v=ZA-tUyM_y7s&t=1527s "Link") (Essential from min 25:30 to 39:00) From Algorithms (4th edition): Paragraph 1.4 (Essential)  
    - [ ] From Grokking Algorithms: Chapter 3 (Optional)
---
- [[#Dictionaries and hash tables|Dictionaries and hash tables]]
	- [[#Hash maps|Hash maps]]
	- [[#Hash functions|Hash functions]]
		- [[#Find function execution time|Find function execution time]]
	- [[#Textbook notes → [[Algorithms (3.4).pdf#page=1&selection=2,0,2,11|Algorithms (3.4), page 1]]|Textbook notes → [[Algorithms (3.4).pdf#page=1&selection=2,0,2,11|Algorithms (3.4), page 1]]]]
- [[#Algorithm analysis|Algorithm analysis]]
	- [[#Intro to data structures and algorithms|Intro to data structures and algorithms]]
	- [[#Textbook notes|Textbook notes]]
- [[#Quiz questions|Quiz questions]]

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

- Basic Concept: At its simplest, if keys are small integers, they can directly serve as array indices, enabling quick access. Hashing extends this idea to more complex keys by transforming keys into array indices through arithmetic operations.
- Hash Function: The hash function is central to hashing, aiming to map different keys to unique indices in an array. However, achieving a perfect hash function, where no two keys hash to the same index, is challenging. Thus, collision resolution becomes a necessary part of hashing.
- Collision Resolution: When two keys hash to the same index, a process is required to resolve this collision. The document mentions two methods: separate chaining and linear probing.
- Time-Space Tradeoff: Hashing illustrates a tradeoff between time and space. Ideally, with unlimited memory, a key could directly index into a massive array for constant-time access. However, memory constraints make this impractical for large key sets. Conversely, minimal memory usage would necessitate slower search methods like sequential search.
- Practicality: In practice, hashing seeks a balance, offering a reasonable compromise between time and space efficiency. This is achieved by adjusting hashing parameters, guided by probability theory, without needing to rewrite the algorithm for different scenarios.
- Hash Functions for Different Key Types: The hash function must be tailored to the key type (e.g., numbers, strings, or composite types like addresses), requiring different strategies for converting these keys into numerical indices.
- Modular Hashing: One common approach is modular hashing, where keys are converted to integers and then reduced modulo the size of the hash table to ensure they fit within the table's bounds.

## Algorithm analysis
#### Intro to data structures and algorithms
#### Textbook notes



## Quiz questions
- What is the worst-case time complexity of inserting an element into a dictionary that is implemented with an unsorted linked list, where each node in the list represents a key-value pair? → ==O(n)==


- 8
- 0 → i
- 0 → n/2

(n/2) * n