---
date: 2023-09-23
type: lecture
tags:
  - type/lecture
course: BCS1130
period: 1
lecture-slides: 
notes-complete:
---
## Lecture notes
- [[#Injective functions|Injective functions]]
		- [[#Proving that a function is injective:|Proving that a function is injective:]]
- [[#Surjective functions|Surjective functions]]
		- [[#Proving that a function is surjective|Proving that a function is surjective]]
- [[#Bijections|Bijections]]

- - - 
#### Injective functions
> [!abstract] Definition
> A function $f: A → B$ is injective if two different elements have different function values *(Funzione iniettiva, every element of the domain is mapped to a different value of the codomain)*
> 
> **Formal definition:**
> A function $f: A → B$ is injective if $(\forall x,y \in A)(x \neq y \implies f(x) \neq f(y))$
> **Contrapositive**: $\forall x,y \in A,  (f(x) = f(y) \implies x = y)$

- [ ] add screenshot from slides
###### Proving that a function is injective: 
$f: \mathbb{N} → Z, f(x) = x-1$ → prove that it is injective
- Let $x,y \in N, x \neq y$
	- $\implies x-1 \neq y-1$
	- $\implies f(x) \neq f(y)$ → Injective ✅

$f: Z → Z, f(x) = x^2$ → prove that it is **not** injective
- Not injective, since $1 \neq -1, f(1) = f(-1)$ ❌

$f: N → N, f(x) = x^2$ → this is injective ✅

#### Surjective functions
 > [!abstract] Definition
 > A function $f: A→B$ is surjective if every element of B is the image of an element of A → the range is equal to the codomain
 > *(each element of the codomain has been mapped from at least an element of the domain)*
 > 
 > **Formal definition:**
 > A function $f: A → B$ is surjective if $(\forall y \in B)(\exists x \in A)(y =f(x))$

- [ ] add screenshot from slides

###### Proving that a function is surjective
> [!warning]
> We can usually prove that a function is not surjective by finding a counterexample 

**Example 1**
$f: Z → Z, f(x) = 2x + 1$ 
- $o \in Z, o = 2x + 1 \implies x = - \frac{1}{2}$
- $- \frac{1}{2} \notin Z$ ❌


**Example 2**
$$
\begin{equation}
f: \mathbb{Z} → \mathbb{z}
f(x) =
    \begin{cases}
      - \frac{x -1}{2}, x, odd\\
      -\frac{x}{2},   x, even
    \end{cases}\,.
\end{equation}

$$
We use one of the definitions, for example the definition of f(x) when x is even
- Let $y \in Z, y = -\frac{x}{2} \implies x = -2y$, so x is **even**
	- $\implies$ with x even, $f(x) = - \frac{(-2y)}{2} = y$

We can also use the other definition:
- Let $y \in Z, y = - \frac{x -1}{2} → x = -2y+1$ so x is **odd**
	- $\implies f(x) = f(-2y + 1) = \frac{y - 1 + 1}{2} = y$ 

- [ ] complete notes with slides examples

**Example 3**
- [ ] take detailed notes of this example
$f: \mathbb{P}(A) → \mathbb{N} \cup \{o\}, f(B) = |B|$
- $A = \{0,1\}, P(A) = \{ \phi\}$

#### Bijections
> [!abstract] Definition
> A function $f: A → B is a bijection if it is injective and surjective 
> *(Each element of the domain is mapped to **exactly 1 element** of the codomain)*


## Key takeaways
- a

- - - 
## Lecture slides