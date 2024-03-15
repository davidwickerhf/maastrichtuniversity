---
date: 2023-09-06
---
## Lecture slides and materials
- [Recommended reading](https://canvas.maastrichtuniversity.nl/courses/15754/pages/module-2-recommended-material-previous-to-the-live-coding-session?module_item_id=529256)
- 
![[Attachments/Lecture 2_2023_Variables_Methods.pdf]]
## Lecture notes
#### Variables and expressions
- **%** is a rest operator (not modulo)
- Unary operators (++, $–$, !)
- Assignment operator is a return expression

#### Java naming conventions
- Camel case → Variable names
- Pascal case → Class names

#### Casting operations
- ```int a = (int)(3.14 * 5)```
- When casting to an integer it rounds **down** by default
- Bad idea to compare doubles using the operator **\==**
- If when printing a number (int) without specifying its type, Java will assume it’s type to be an Integer (the memory for an int is 32bit)
- **==Overflow / Underflow==** → when adding two integers, the sum overflows the memory of an integer and overflows
#### Constants
- Naming conventions: ALL_CAPITALS
#### Garbage collection
- When a variable’s scope ends, it is still present in RAM, even if not accessible
- Garbage collector will remove value from memory when not needed anymore
#### Methods
- Methods group related statements that re-occur together in a task
- Visibility
- Return Type
- method Name
- Parameters

#### Scanner library
