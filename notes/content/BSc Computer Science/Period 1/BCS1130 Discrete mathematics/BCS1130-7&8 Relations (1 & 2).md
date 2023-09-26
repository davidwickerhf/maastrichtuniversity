---
date: 2023-09-20
type: lecture
tags:
  - type/lecture
course: BCS1130
period: 1
lecture-slides:
---
## Lecture notes
- [[#Relation definition|Relation definition]]
- [[#Relation diagrams|Relation diagrams]]
- [[#Reflective relations|Reflective relations]]
- [[#Symmetric relations|Symmetric relations]]
- [[#Transitive relations|Transitive relations]]
- [[#Equivalence relations|Equivalence relations]]
- [[#Example|Example]]
- - - 
#### Relation definition
> [!abstract] Definition
> A relation R describes the relationship between different elements of a given set A:
> **Formal**: A relation R on a set A is a subset of the product set $A \times A$
> 
> $$x R y$$

Example: 
$A = \{ 1,2,3\}$ →  $xRy$ if $x ≤ y$

#### Relation diagrams
- [ ] Include lecture screenshot

- - -

#### Reflective relations
> [!abstract] Definition
> A relation R on a set A is reflexive if every element of A is related to itself:
> $$\forall x \in A : x R x$$

- [ ] Include lecture screenshot

#### Symmetric relations
> [!abstract] Definition
> A relation R on a set A is symmetric if for all elements a,b in A: $aRb \to bRa$
> $$\forall a,b \in A : a R b \to bRa$$

- [ ] include lecture screenshot

#### Transitive relations
> [!abstract] Definition
> A relation R on a set A is transitive if for all elements a,b,b in A:
> $$(aRb \land bRc) → aRc$$

- [ ] Include lecture screenshot

- - -

#### Equivalence relations
> [!abstract] Definition
> A relation R is called an equivalence relation if it is reflexive, symmetric and transitive

- An equivalence relation corresponds to a **==[[BCS1130-6 Set theory#Set partitions|partition]]==** of the set
- If you have a partition of a set, you get an equivalence relation

**Example**
Let $A = \mathbb{N}$
- $xRy$ if $x-y$ is even
- **Reflexive**: $\forall x \in A : xRx$
	- Let $x \in N . x - x = 0$ is even → $xRx$ is verified ✅
- **Symmetric**: $\forall x,y \in A : xRy → yRx$
	- Assume $x,y \in N, xRy$ then $x-y$ is even
	- then $y-x$ is even (opposite of an even number is also even) 
	- so $yRx$ and the relation is symmetric ✅
- **Transitive**: $\forall x,y,z \in A : (xRy \land yRz) → xRz$
	- Assume $x,y,z \in N, xRy \land yRz$
	- then $x-y$ is even and $y-z$ is even
	- then $(x-y) + (y-z)$ is even (sum of even numbers is even)
	- $(x-y) + (y-z) = x-z$ then $x-z$ is even → $xRz$ → Relation is transitive ✅
- R is reflexive, transitive and symmetric → it is an equivalence relation ✅

- [ ] Add screenshot from lecture
###### Example
> [!note] Example Relation on $R^2$
> $R^2, (x,y)R(a,b)$ if $x+y = a+b$

Is the relation reflexive? $\forall(x,y) \in R \times R : (x,y) R (x,y)$
- $(x,y)R(x,y)$ if $x+y = x+y$ → this is trivially true → The relation is reflexive ✅

Is the relation symmetric? $\forall(x_1, y_2), (x_2, y_2) \in R \times R, (x_1, y_2)R(x_2, y_2) → (x_2, y_2)R(x_1, y_1)$
- Let $(x_1, y_1)R(x_2, y_2)$ then $x_1 + y_1 = x_2 + y_2$
- then $x_2 +y_2 = x_1 + y_1$
- so $(x_2, y_2)R(x_1, y_1)$ → the relation is reflexive ✅

- [ ] complete notes for this →
Is the relation transitive? $\forall (x_1, y_1), (x_2, y_2), (x_3, y_3) \in R \times R : (x_1, y_1)R(x_2, y_2) \land (x_2, y_2)R(x_3,y_3) → (x_1,y_2)R(x_3,y_3)$
- Let 

- - - 

#### Anti-symmetry
> [!abstract] Definition
> It is **not** the negation of symmetry. A relation that **cannot** go in both directions
> 
> - $\forall x,y \in A: (xRy \land yRx) → x=y$
> - $\forall x,y \in A: (xRy \land x \neq y) → x !Rx$
###### Examples
- $xRy$ if $x ≤ y$ on $\mathbb{R}$ → Anti-symmetric ✅
- $xy$ if $x≤ y+10$, on $\mathbb{N}$ 
	- **Not symmetric:** $x = 1, y=20$ then $xRy$, since $1≤20+10$, but $x!Ry$, since $20≤ 1+10$
	- **Not anti-symmetric:** $x=1, y=2$, then $xRy$ since $x≤ 2+10$ and $yRx$ since $2≤ 1+10$ ❌
- $xRy$ if $x=y+10$ , on $\mathbb{N}$ → Anti-symmetric ✅
	- assume $xRy$ and $x \neq y$
		- then $x=y+10 \implies y = x-10 \neq x+10$
		- so $y !Rx$ 
- $xRy$ if $x+y = 10$, on $\mathbb{N}$ → Symmetric relation, **not** anti-symmetric ❌
- 

- [ ] Add more examples from slides

###### Symmetry vs. Anti-symmetry
- **Symmetry** → all arrows go in 2 directions
- **Anti-symmetry** → arrows between different elements **cannot** go in both directions
- - - 

#### Partial order
> [!abstract] Definition
> A relation that is reflexive, transitive and anti-symmetric is called a **==partial order==**

###### Examples
- Subset Relation → $\subseteq, on \mathbb{P}(\mathbb{N})$
	- **Reflexive** → $\forall$ set A $\in \mathbb{P}(\mathbb{N}) : A \subseteq A$ ✅
		- Every set is a subset of …
	- **Anti-symmetry** → if $A \subseteq B \land B \subseteq A \implies A = B$ (set equality) ✅
	- **Transitive** → if $A \subseteq B \land B \subseteq C \implies A \subseteq C$ ✅
		- Let $x \in A \implies x \in B$ since $A \subseteq B$
		-  [ ] complete note here

- $xRy$ if $x ≤ y$, on $\mathbb{R}$
	- **Reflexive** → $x ≤x$ true (every number is smaller/equal than itself) ✅
	- **Anti-symmetry** → if $x ≤ y \land y ≤ x \implies x = y$  ✅
	- **Transitive** → $x ≤y \land y≤ z → x ≤z$ ✅

- $xRy$ if $x$ is a multiple of y, on $\mathbb{N}$
	- **Reflexive** → $xRx$ if x is a multiple of x → true for $\forall x \in \mathbb{N}$ (every number is a multiple of itself) ✅
	- **Anti-symmetry** → $xRy \land yRz → xRz$
		- $xRy$ so $x = ky$   $(k \in N)$
		- $yRz$ so $y = mz$ with $m \in N$
		- then $x = k(mz) = (km)z$ so $xRz$ ✅
	- **Transitive** → $xRy \land yRx$
		- $\implies x = ky \land y = mx \implies x = kmx$
		- $\implies k = m = 1 \implies y = x$ ✅
- - - 

#### Total order
> [!abstract] Definition
> 

- What is the difference between a partial order and a total order?
	- **Partial order** → Transitive, Anti-symmetric, reflexive
	- **Total order** → Partial order + $\forall x,y \in A: xRy \lor yRx$

- - - 

## Lecture slides
#### Lecture 7
![[DM-L7 (annotated).pdf]]

#### Lecture 8
- [ ] Add slides

#### Extra materials
![[Socrative L7.pdf]]