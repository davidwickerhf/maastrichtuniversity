---
date: 2023-09-26
type: lecture
tags:
  - type/lecture
course: BCS1130
period: 1
lecture-slides: true
notes-complete: true
---
## Lecture notes
- [[#Definition of a function|Definition of a function]]
		- [[#Examples of function definition|Examples of function definition]]
- [[#Composition of functions|Composition of functions]]
		- [[#Examples|Examples]]
- - - 
#### Definition of a function
> [!abstract] Definition
> A function f is a mapping from a set A to a set B. To be a function, $f(x)$ has a **unique** value for **every** element x of A:
> $$f: A→B, f(x) = …$$
> 
> - A → Domain (asse x)
> - B → Codomain (asse y)
> - Range: $\{f(x), x \in A\}, range(f) \subseteq B$

![[Screenshot 2023-10-18 at 6.42.25 PM.png]]
- Codomain and Range are different!
###### Examples of function definition
- $f: N \to R$ where $f(x) = \sqrt(x)$
- $f: N → R$ where $f(x) = \frac{1}{x}$
- - - 

#### Composition of functions
> [!abstract] Definition
> Consider functions $g: A→B$ and $f: B→C$
> Then $(f \circ g)(x) = f(g(x))$ is the function obtained first using g and then using f
> 
> - Domain of $(f \circ g)$ → domain of **g**
> - Codomain of $(f \circ g)$ → codomain of **f**

- This condition must be true for the compound function: $range(g) \subseteq domain(f)$

![[Screenshot 2023-10-18 at 6.42.53 PM.png]]
###### Examples
- $f: Z → Z, f(x) = x -4$
- $g: Z → Z$, where $g(x) = x^2 + 4$

- $f \circ g : Z → Z$ is properly defined, since the codomain of g and the domain of f are the same
- $g \circ g: Z → Z$ is properly defined, since the codomain of f and the domain of g are the same
- - - 


## Key takeaways
- Do you understand what a function is?
- ﻿﻿Do you know the meaning of 'domain', 'co-domain' and 'range?
- ﻿﻿Do you understand how function composition works?

- - - 
## Lecture slides
![[DM-L8-annotated.pdf]]