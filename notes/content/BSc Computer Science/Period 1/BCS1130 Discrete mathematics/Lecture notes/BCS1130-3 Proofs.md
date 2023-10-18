---
date: 2023-xx-xx
type: lecture
tags:
  - type/lecture
course: BCS1130
period: 1
lecture-slides: true
notes-complete: true
---
## Lecture notes
#### Proof by contradiction
- You assume that what you want to prove is false
- You deduce something absurd
- Assumption “not p” cannot be true $\implies$ then p must be true

#### Proof by contrapositive
- If you want to prove “if p, then q”
- You can prove “if not q, then not p” (logically equivalent to the first one)

> [!warning] Quantifiers
> When dealing with proof by contrapositive, the quantifier must not change, only the implication

> [!note] Example
>$\forall x \in N, x> 2 : x$  prime $\to$ x is odd
> **Contrapositive**: $\forall x \in N, n> 2 : x$ even $\to$ x is not prime
> - x even $\implies x = 2k, k \in N, n> 1$
> - x has more than 2 divisors, namely 1, 2k, 2, k
> - $\implies$ x is not prime $\square$

> [!note] Example
> $\forall x,y \in R, x,y>0 : x^2 + y^2 >1 \implies x+y >1$
> **Contrapositive**: $\forall x, y \in R, x,y > 0 : x + y \leq 1 \implies x^2 + y^2 \leq 1$
> - Let $x, y \in R, x,y > 0$
> 	- $x+ y ≤ 1$
> 	- $\implies (x+y)^2 ≤ 1^2 = 1$
> 	- $\implies x^2 + 2xy + y^2 ≤ 1$
> 	- $\implies x^2 + 2xy+y^2 - 2xy ≤ 1 -2xy \leq 1$
> 		- $1 - 2xy$ *is obviously smaller than 1*
> 	- $\implies x^2 + y^2 ≤ 1 \square$

## Lecture slides
![[DM L3 Discrete Mathematics.pdf]]