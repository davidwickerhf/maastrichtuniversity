---
tags:
  - type/concept
  - topic/x
  - lang/x
type: concept
topic: 
aliases:
---

## Relevant links
- https://youtu.be/Nu8YGneFCWE?si=VTipU09eaInGZmdw&t=300

## Concept overview
###### Introduction
The objects that are stored in a Data Structure in this model are like indistinguishable Black Boxes, and the only way to distinguish them is through a comparison between the keys of items. Is the key **bigger**, **smaller** or are they **the same**?

→ This applies to many search algorithms
###### Comparison operation
All these comparison operations can only give two outputs (true or false)
- Less than (or equal to)
- Greater then (or equal to)
- Equal
- Not equal
###### Representing the algorithms
The comparisons done by the algorithm can be represented by a **[[Binary Tree]]**. The output of the search algorithm can be an index of the item that contains the key. We need at least **n+1** outputs, since we need to be able to retrieve any of the items we are storing, and one output if the item is not in there.

###### Number of comparisons of the algorithm
How many *comparisons* does the algorithm have to do?
→ *In the worst case*, as many as the longest root-to-leaf path in the tree, which is the height of the tree.

What is the minimum *height* of any binary tree that has at least **n+1 leafs**?
→ The best you can do (balanced binary tree), is **log-n**. Minimum height, is **log(n)**

###### Comparisons’ branching factor
Comparisons have a constant branching factor.   Regardless of the constant (2 or 3) branching factor, the height of the binary tree will still be log(n)

## Related concepts
- 

## Related books or papers
- 

## Key personalities
- 
