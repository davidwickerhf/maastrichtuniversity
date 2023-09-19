---
date: 2023-09-13
type: lecture
tags:
  - type/lecture
course: BCS1130
period: 1
lecture-slides: false
---
## Lecture notes
#### Intro notation
- **Set** → Collection of specified, unordered and not duplicate objets. Can be infinite or finite or empty: $\{1,2,3,4\}$ or $\{\}$ (empty set can also be represented with $\phi$ )
- **Cardinality of a set** → Number of elements in the set: $|\{1,2,3,4\}|=4$

#### Describing sets
- $A = \{x \in N : x < 5\}$
- $A = \{1,2,\}$ → $\{1\} \subseteq A$

#### Subsets
> [!note] Subset
> The set B is a **==subset==** of the set A $\iff$ every element of B is also an element of A: $B \subseteq A$
> $B \subseteq A \iff \forall x \in B : x \in A$
> $B \subseteq A \iff \forall  x : x \in B \implies x \in A$

B is a **subset** of A. B is **not** an element of A.
- $B = \{ x: x \in DACS \}$
- $A = \{ x : x \in UM\}$

The following statements are always true:
- $\phi \subseteq A$
- $A \subseteq A$

#### Proofs with sets
> [!note] Example
> $$A \subseteq B \iff A \cup B = B$$
> 1. $A \subseteq B \implies A \cup B = B$
> 2. $A \cup B = B \implies A \subseteq B$

**First implication** $A \subseteq B \implies A \cup B = B$
1. $B \subseteq A \cup B$
	- Let $x \in B$
		- then $x \in B \land x \in A$
		- then $x \ in (A \cup B)$
2. $A \cup B \subseteq B$
	- Let $x \in A \cup B$
		- then $x \in A \lor x \in B$
		- if $x \in A \implies x \in B$ since $A \subseteq B$
		- if $x \in B \implies x \in B$
- $\implies (A \cup B \subseteq B) \land B \subseteq (A \cup B)$
- $\implies A \cup B = B$

**Second implication** $A \cup B = B \implies A \subseteq B$
- Let $x \in A$
	- then $x \in A \lor x \in B$
	- then $x \in (A \cup B)$
	- then $x \in B$
	- $\implies A \subseteq B$

#### Associativity
- **Intersection is associative:** $A \cap (B \cap C) = (A \cap B) \cap C$
- **Union is associative**: $A \cup (B \cup C) = (A \cup B) \cup C$

#### Distributive laws
1. $A \cup (B \cap C) = (A \cup B) \cap (A \cup C)$
2. $A \cap (B \cup C) = (A \cap B) \cup (A \cap C)$

#### De Morgan laws
- [ ] Complete notes with slides
1. A
2. A

## Lecture slides
![[DM-L5 (annotated).pdf]]