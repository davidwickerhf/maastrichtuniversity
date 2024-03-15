---
date: 2023-09-19
type: lecture
tags:
  - type/lecture
course: BCS1130
period: 1
lecture-slides: true
notes-complete: true
---

## Lecture notes
- [[#Proof example|Proof example]]
	- [[#First implication|First implication]]
	- [[#Second implication|Second implication]]
- [[#Proof example (shorter)|Proof example (shorter)]]
- [[#Proof example (truth table)|Proof example (truth table)]]
- [[#Power set|Power set]]
	- [[#Example of power sets|Example of power sets]]
	- [[#Cardinality of a power set|Cardinality of a power set]]
- [[#Product sets|Product sets]]
	- [[#Example of product sets|Example of product sets]]
	- [[#Cardinality of product sets|Cardinality of product sets]]
	- [[#Properties|Properties]]
- [[#Set partitions|Set partitions]]
	- [[#Definition|Definition]]
	- [[#How many partitions are there|How many partitions are there]]
- - - 

#### Proof example
> [!note] Proof example
> For all sets A, B, C, $(B \cap (A^c \cup C)^c = \phi) \iff (A \subseteq B^c \cup C)$

![[Screenshot 2023-10-23 at 9.06.37 AM.png]]

We try to prove that the statement is true (which we identified using Venn Diagrams)

###### First implication
$B \cap A \cap C^c = \phi \implies  A \subseteq B^c \cup C$
- Let $x \in A$
	- Case 1: $x \in C$ 
		- $\implies x \in C \lor x \notin B \implies x \in B^c \cup C$
	- Case 2: $x \notin C$
		- Assume $x \in B \implies x \in A, x\in B \land x\notin C$
		- $x \in (B \cap A \cap C^c)$ → This is a contradiction as that set is empty
		- Therefore $x \notin B$ → $x \in B^x \lor x \in C \implies x \in B^c \cup C$ 
###### Second implication
$A \subseteq B^c \cup C \implies B \cap A \cap C^c = \phi$  → We can either take the contrapositive, or take a **contradiction**

Proof by contradiction
- We need to assume the set $B \cap A \cap C^c$ is not empty → there is an element in that set: $x \in B \cap A \cap C^c$
	- then $x \in B, x \in A$ and $x \notin C$
	- so $(x \in B^c \lor x \in C) \land (x \in B \lor x \notin C)$ → Contradiction (the two sets are opposite)
	- so there is no $x \in B \cap A \cap C^c$ → the set $B \cap A \cap C^c$ is **empty**

#### Proof example (shorter)
> [!note] Proof example
> For all sets A, B, C, $(B \cap (A^c \cup C)^c = \phi) \iff (A \subseteq B^c \cup C)$

We prove: $\neg(A \subseteq B^c \cup C) \iff \neg(B \cap (A^c \cup C)^c = \phi)$

Subset: $\forall x \in A : x \in B$
Not subset: $\exists x \in A : x \notin B$

- $\neg (A \subseteq (B^c \cup C))$
	- $\iff \exists x \in A : x \notin (B^c \cup C)$
	- $\iff \exists x \in A : x \in (B^c \cup C)^c$ (if an element is not in something, it is an element of the complement)
	- $\iff \exists x \in A : x \in (B \cap C^c)$
	- $\iff \exists x : x \in A \land x \in B \land x \in C^c$
	- $\iff \exists x : x \in (A \cap B \cap C^c)$ → X is in the intersection of the three sets
	- $\iff (A \cap B \cap C^c) \neq \phi$ → The set is not empty

#### Proof example (truth table)
> [!note] Proof example
> For all sets A, B, C, $(B \cap (A^c \cup C)^c = \phi) \iff (A \subseteq B^c \cup C)$

![[IMG_1670.jpg]]
 - - - 
#### Power set 
> [!abstract] Power sets
> A power set of a set A is the set of all subsets of A

###### Example of power sets
Example of a power set:
$A = \{ 1, 2, 3  \}$
$P(A) = \{ \{ 1 \}, \{ 2 \}, \{  3 \}, \{ 1,2 \}, \{ 1,3 \}, \{ 2,3 \}, \{  \}, \{ 1,2,3 \} \}$
$|P(A)| = 8$ (set size is 8)

Example of a power set:
$B = \{ i, \phi \}$
$P(B) = \{ \phi, \{ 1, \phi \}, \{ 1 \}, \{ \phi \} \}$

###### Cardinality of a power set
> [!abstract] Size of a power set
$$|P(A)| = 2^{|A|}$$

#### Product sets
> [!abstract] Product sets
> For two sets A and B, the product set $A \times B$ is defined as
> $\{ (a,b)$ with $a\in A \land b \in B \}$
> 
> - $(a,b)$ is an ordered pair

###### Example of product sets
$\mathbb{R}^2 = \mathbb{R} \times \mathbb{R}$ → Cartesian plane
###### Cardinality of product sets
> [!abstract] Cardinality of product sets
> $$|A \times B| = |A| \times |B|$$
###### Properties
- $A \times B = B \times A$ 
	- when $A = B$
	- when  one of the sets is empty → The product is also empty

#### Set partitions
###### Definition
> [!abstract] Set partitions
> The sets $A_1 , \dots A_{n}$ form a partition of the set A $\iff$
> 1. None of the sets $A_k$ is empty: $A_k \neq \forall k$
> 2. $A_1 \cup A_2 … \cup A_n = \cup^n_{k=1} A_k = A$
> 3. $A_m \cap A_k = \phi$ if $m \neq k$
###### How many partitions are there
> [!alert] Partitions
> $$B_{n+1} = \sum^n_{k=0} \binom{n}{k} B_k$$

## Key takeaways
- ﻿﻿Do you know how set membership works?
- ﻿﻿Do you understand the meaning of the set operators (complement, intersection, union, difference)
- ﻿﻿Do you know how to use Venn diagrams to develop an intuition
- ﻿﻿Do you understand the concept and definition of subset?
- ﻿﻿Do you know how to prove that two sets are equal?
- ﻿﻿Do you understand how to use the associative, distributive and de Morgan Laws? Can you prove them?
- ﻿﻿Do you know how to use power sets? Can you formulate the power set of a (finite) set?
- ﻿﻿Do you understand how set product works?
- ﻿﻿Do you know what a partition is?.




- - - 
## Lecture slides

###### Lecture slides
![[Attachments/DM-L6 Discrete Mathematics.pdf]]

###### Partitions
![[Partitions.pdf]]