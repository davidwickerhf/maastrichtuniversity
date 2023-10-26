---
date: 2023-10-04
type: lecture
tags:
  - type/lecture
course: BCS1130
period: 1
lecture-slides: true
notes-complete: true
---
## Lecture notes
- Rule of sum
- Rule of product
- Counting
	- With order, with repetition
	- With order, without repetition
	- Without order, without repetition
	- Without order, with repetition

- - - 
#### Examples
> [!note] Example 1
> How many different 5-letter case-sensitive passwords can we generate?

→ Selection of k objects out of n objects: $n^k$ options
- 5 fields
- 26 letters (52 including cases)
- Order and repetition matter

 $$D_{n,k} = (n)^k =  (52)^5$$

> [!note] Example 2
> Committee with 10 members. Chairperson, treasurer and administrator. Each member can do at most 1 role. How many possibilities?

→ Selection of 
- Order matters, no repetitions allowed
- 3 fields (k)
- 10 members 
$$D_{n,k} = \frac{n!}{(n-k)!} = 10(9)(8) = 720$$

> [!note] Example 3
> Exam has 7 questions. You can answer 4 of them. How many combinations?

→ Selection of
- Order doesn’t matter, no repetitions allowed
- 4 fields
- 7 items
$$C_{n,k} =  {{n}\choose{k}} = \frac{n!}{k!(n-k)!} = \frac{7!}{3!4!}$$

> [!note] Example 4
> 3 Identical dice. If we throw them at the same time, how many different patterns are possible

- Order doesn’t matter
- Repetitions are allowed
- k = 3 fields
- n = 6
$$C_{n,k}^* = {n+k-1 \choose k} = {6 + 3 -1 \choose 3} = {8 \choose 3} = \frac{8!}{5!3!} = $$

> [!note] Example 5
> How many ways can we distribute 10 chocolates over 7 people?
> What if each person gets at least 1 chocolate?
> What if each person gets at most 2 chocolates?

Part 1
- Repetition allowed, order doesn’t matter. n = 10, k=7
- $C_{n,k} = {10 +7 -1 \choose 7} = \frac{16!}{6!10!} = 8008$

Part 2
- Repetition allowed, order doesn’t matter. take out all the combinations where 1 any person doesn’t get any chocolate
	- We take out 7 chocolates and assign 1 to each person
- $C_{3,7}^* =  {7+3-1 \choose 3} = \frac{9!}{6!3!} = 84$

Part 3
- Repetition allowed, order doesn’t matter
- 


- - - 
## Lecture slides
![[Attachments/DM-L11 annotated (1)..pdf]]