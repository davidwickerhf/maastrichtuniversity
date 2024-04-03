In week 3, we introduce the Tree ADT, Binary Trees, Binary Search Trees and AVL Trees. Please study the following material before the lecture on Tuesday:

- Basic Concepts
    - [ ] From Grokking Algorithms: Paragraph 11.1 (Optional)  
    - [ ] [Trees Introduction - YouTube VideoLinks to an external site.](https://www.youtube.com/watch?v=rP6wjhNqwMc "Link") (Essential)  
    - [ ] [Trees, Binary Trees, BST, Traversal Algorithms - YouTube VideoLinks to an external site.](https://www.youtube.com/watch?v=oSWTXtMglKE "Link") (Essential)  
    - [ ] [What is a Binary Tree - MIT VideoLinks to an external site.](https://www.youtube.com/watch?v=76dhtgZt38A "Link") (Essential - from min 4:00 to min 16:30)[Links to an external site.](https://www.youtube.com/watch?v=76dhtgZt38A "Link")
- Binary Search Trees and AVL Trees  
    - [ ] From Algorithms (4th edition): Paragraph 3.2 (Essential)
    - [ ] From Algorithms (4th edition): Paragraph 3.3 (Essential)[Check if a tree is a BST - YouTube VideoLinks to an external site.](https://www.youtube.com/watch?v=i_Q0v_Ct5lY "Link") (Optional)  
    - [ ] [Binary Tree and Binary Search Tree - MIT VideoLinks to an external site.](https://www.youtube.com/watch?v=76dhtgZt38A "Link") (Essential - from min 16:30)  
    - [ ] [Binary Search Tree (cont.) and AVL Tree - MIT VideoLinks to an external site.](https://www.youtube.com/watch?v=U1JYwHcFfso "Link") (Essential - Optional part from 36:20 to 44:06, but highly recommended to watch it)
    - [ ] [Tree Representations - Slides](https://canvas.maastrichtuniversity.nl/courses/18782/files/3400001/download?download_frd=1 "Tree Representations.pdf") [Download Tree Representations - Slides](https://canvas.maastrichtuniversity.nl/courses/18782/files/3400001/download?download_frd=1) (Essential)

- - - 
#### 1. Concept of Tree Data Structure and Basic Properties

- **Tree Data Structure**: A hierarchical structure that consists of nodes, with a single node as the root from which branches lead to child nodes, forming a parent-child relationship.
- **Properties**:
  - **Root**: The top node without a parent.
  - **Parent Node**: A node with branches leading to one or more child nodes.
  - **Child Node**: A node that has a parent node from which it descends.
  - **Leaf Node**: A node without any children.
  - **Depth**: The length of the path from the root to the node.
  - **Height**: The length of the longest path from the node to a leaf.

#### 2. Difference Between a Tree and a Graph

- **Tree**: A special form of a graph with no cycles, where any two vertices are connected by exactly one path.
- **Graph**: A more general structure that can include cycles, allowing nodes to have multiple paths between them.

#### 3. Types of Trees

- **Binary Trees**: Each node has at most two children (referred to as left and right).
- **Binary Search Trees (BST)**: A binary tree where for each node, all elements in the left subtree are less than the node, and all elements in the right subtree are greater.
- **Balanced Binary Trees**: BSTs where the depth of two subtrees of every node differs by no more than one (e.g., AVL trees, Red-Black trees).
- **General Trees**: Trees where there's no limit on the number of children a node can have.

#### 4. Implementing a Basic Binary Tree in Java

```java
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree(int key) {
        root = new Node(key);
    }

    BinaryTree() {
        root = null;
    }
}
```

#### 5. Time and Space Complexities of Binary Tree Operations

- **Insert, Delete, and Search**:
  - Average Case (for a balanced tree): O(log n), where n is the number of nodes.
  - Worst Case (for a skewed tree): O(n), linear with the number of nodes.
- **Space Complexity**: O(n) for storing n nodes.

#### 6. Binary Search Tree (BST) Properties

- The left subtree of a node contains only nodes with keys less than the node’s key.
- The right subtree of a node contains only nodes with keys greater than the node’s key.
- The left and right subtree each must also be a binary search tree.

#### 7. Balanced Binary Trees

- Aim to maintain the tree in such a condition that it remains balanced, ensuring operations remain efficient (O(log n) time complexity).
- Examples include AVL Trees and Red-Black Trees, which implement rotations to maintain balance after insertions and deletions.

#### 8. Concept of a General Tree

- A tree where each node can have any number of children, not limited to two as in binary trees. This flexibility is useful for representing more complex hierarchical relationships.

#### 9. Implementation of Trees

- **Array-Based**: Particularly for binary trees, where the index of the array represents a specific position in the tree based on the level and order of nodes.
- **Pointer-Based**: Nodes are objects, each having pointers to their child nodes and possibly to their parent, dynamically allocated in memory.

#### 10. Use Cases of Trees in Real-world Scenarios

- **File Systems**: Represented as trees, with directories as nodes and files as leaves.
- **Databases**: Trees, especially balanced binary search trees, are used in databases and indexes to enable quick data retrieval.
- **UI Components**: GUI structures like menus can be represented as trees.
- **Decision Trees**: In machine learning for classification and regression.
- **Routing Algorithms**: In networking, trees can represent paths for packet transmission.