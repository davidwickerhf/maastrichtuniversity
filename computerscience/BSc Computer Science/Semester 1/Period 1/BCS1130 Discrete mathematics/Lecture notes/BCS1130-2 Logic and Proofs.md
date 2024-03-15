---
date: 2023-xx-xx
type: lecture
tags:
  - type/lecture
course: BCS1130
period: 1
lecture-slides: true
notes-complete:
---
## Quantifiers
![[Quantifiers.pdf]]
## Lecture slides
![[DM-L2-annotated.pdf]]

## Lecture notes
#### Introduction to quantifiers
- Universal quantifier
- Existential quantifier
- $\forall$ has the same logical meaning as $\to$
	- For each student at DACS, the student is smart
	- If a student is a DACS student, the student is smart

#### Proof techniques
- Direct proof 
- Counterexample
- Contrapositive
- Contradiction
- Induction

#### Direct proof
- Move forward in logical steps from the assumptions to the conclusion
- To prove that a statement is false, you prove that the negation is true
- To prove a **“for all”** statement, you prove the statement for an arbitrary element
- To prove a **“there exists”** statement, you only need to give an example

> [!note]  Example
> 
> $$\forall n \in N : n^2 \geq n$$
> - Let $n \in N$ 
>	- $\implies n \geq 1$
>	- $\implies n \cdot n \geq n \cdot 1$ (since n > 0)
>	- $\implies n^2 \geq n$

#### Counterexample
- To disprove a “for all” statement 