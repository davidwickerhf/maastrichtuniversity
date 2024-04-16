---
date: 2024-02-06
type: lecture
tags:
  - type/lecture
course: BCS1520
period: 4
lecture-slides: 
notes-complete:
---
```table-of-contents
```

## Lecture notes
- Greedy algorithms

- - - 
#### Analyzing algorithms
> Sometimes you don’t need to do anything very smart, you just have to show that a simplistic thing is optimal
#### Greedy algorithms
- At each step, taking the decision that seems the best, without considering future conditions
- Metrics can be used to determine which decision is most favorable

**Considerations of greedy algorithms**
- They don’t always work (e.g. [[Knapsack Problem]]). 
	- In this case we would consider a value/density
	- But the greedy algorithm might not be optimal
- [[Minimum Spanning Tree Problem]]
	- Grow the spanning tree vertex by vertex
	- Maintain a Heap of edges from vertices in our tree, to vertices not in our tree
	- At each step, pick an edge from the heap of minimum weight and add it to the tree
		- Then add edges incident to the new vertex to the heal
	- Repeat until the tree spans the whole graph

- - -

## Homework
- Write pseudocode for a Greedy Algorithm for MST

- - - 
## Key takeaways
- a

- - - 
## Lecture slides