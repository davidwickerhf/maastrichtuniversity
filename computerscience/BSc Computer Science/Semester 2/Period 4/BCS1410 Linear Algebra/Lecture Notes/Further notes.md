#### Table of contents
```table-of-contents
```
- - - 

#### Key concepts for the exam
- [ ] Eigenvectors
- [ ] Orthogonality
- [ ] Bases
- [ ] Inverse matrices
- [ ] Nol-col
- [ ] Unit Vectros
- [ ] Magnitude of matrices
- - - 

#### Key definitions
###### 1. Eigenvectors
An eigenvector is a special vector that only changes by a scalar factor when a linear transformation is applied to it. Think of it as a vector that doesn't change its direction when a transformation (like rotation, scaling) is applied, but its length might change. The formula involves a matrix \(A\), an eigenvector \(v\), and an eigenvalue \(\lambda\):
\[Av = \lambda v\]
For example, if \(A\) is a 2x2 matrix that represents scaling objects by 2 in the x-direction and \($v = [1, 0]^T$\) (a vector pointing along the x-axis), then \($Av = 2v$\), making \(v\) an eigenvector of \(A\) with an eigenvalue of 2.

###### 2. Orthogonality
Orthogonality in mathematics means "at a right angle." Two vectors are orthogonal if their dot product is zero. This concept is akin to perpendicular lines in geometry.
The formula for the dot product of two vectors \(a\) and \(b\) is:
$[a \cdot b = |a||b|\cos(\theta)]$
If \(a\) and \(b\) are orthogonal, $(a \cdot b = 0)$.
For example, the vectors \($a = [1, 0]$\) and \($b = [0, 1]$\) are orthogonal because $(a \cdot b = 0)$.

###### 3. Bases
A basis of a vector space is a set of vectors that are linearly independent and span the entire vector space. This means you can express any vector in that space as a combination of the basis vectors. 
For example, in $( \mathbb{R}^2\ )$, the vectors \([1, 0]\) and \([0, 1]\) form a basis because you can form any vector in $(\mathbb{R}^2)$ by scaling and adding these two.

###### 4. Inverse Matrices
An inverse matrix is essentially the "opposite" of a given matrix. When you multiply a matrix by its inverse, you get the identity matrix, which acts like 1 in matrix math. The formula for finding an inverse (when it exists) varies, but the key property is:
$[AA^{-1} = A^{-1}A = I]$
where \(I\) is the identity matrix. For example, if \($A = \begin{pmatrix} 2 & 0\\ 0 & 2 \end{pmatrix}$\), then $(A^{-1} = \begin{pmatrix} 0.5 & 0\\ 0 & 0.5 \end{pmatrix})$ because their product is the identity matrix.

###### 5. Null Space
The null space of a matrix \(A\) consists of all vectors \(v\) for which \(Av = 0\). It tells us which vectors become zero vectors when transformed by \(A\).
For example, if \($A = \begin{pmatrix} 1 & 2\\ 1 & 2 \end{pmatrix}$\), the null space includes any scalar multiple of the vector \($[-2, 1]^T$\), since \($A[-2, 1]^T = [0, 0]^T$\).

###### 6. Unit Vectors
A unit vector is a vector with a magnitude (or length) of 1. It is often used to indicate direction without specifying magnitude. To find a unit vector in the direction of a given vector \(v\), you divide \(v\) by its magnitude \(||v||\):
\[\hat{v} = \frac{v}{||v||}\]
For example, to find the unit vector in the direction of \(v = \[3, 4]\), divide by its magnitude (5), resulting in \(\hat{v} = \[0.6, 0.8]\).

###### 7. Magnitude of Vectors
The magnitude (or length) of a vector provides a measure of how long the vector is. For a vector \(v = \[x, y]\) in two dimensions, its magnitude is found using the Pythagorean theorem:
\[||v|| = $\sqrt{x^2 + y^2}$\]
For example, the magnitude of \(v = \[3, 4]\) is \(||v|| = $\sqrt{3^2 + 4^2}$ = 5\).
- - - 
#### What does the Row Echelon Form (REF) tell you about an SLE?
1. **Existence of Solutions**: If any row in the REF consists **==entirely of zeros except for the last entry==** (which corresponds to the constants in the equations), then that row represents an equation of the form 0=c where c is a non-zero constant. This situation indicates that the system of linear equations is inconsistent and has no solution.
2. **Uniqueness of Solution**: If the number of non-zero rows in the REF equals the number of variables in the system, and each leading entry (the first non-zero number from the left in a row) is 1 with all other entries in its column being 0, then the system has a unique solution. This scenario means you can directly read off the values of the variables from the REF → **==Reduced Row Echelon Form==**
3. **Infinite Solutions**: If the system is **==consistent==** (i.e., it does not have a row indicating no solution as described above) and the **==number of non-zero rows is less than the number of variables==**, then the system has infinitely many solutions. This situation occurs because there are more variables than independent equations, leading to at least one free variable that can take an infinite number of values.
4. **Dependency of Equations**: If a row in the REF is all zeros, it indicates that the corresponding equation is a **==linear combination of the other equations==**. This means it does not add new information to the system.
5. **Basic and Free Variables**: The variables corresponding to the columns with **==leading 1s in the REF are called basic variables==**. These can be expressed in terms of the other variables if the system has infinitely many solutions. The variables that do **==not have a leading 1==** in any row correspond to columns that do not determine the solutions directly; these are called free variables and can take any value.
6. **Simplified System Representation**: The REF simplifies the original system of equations, making it easier to understand the relationships between variables and to solve the system either by back substitution or by further transformation into Reduced Row Echelon Form (RREF).
- - - 

#### Identity matrix
An identity matrix, denoted as $I$, is a square matrix in which all the elements of the principal diagonal are ones, and all other elements are zeros. The principal diagonal of a matrix runs from the top left corner to the bottom right corner. The identity matrix serves as the multiplicative identity in matrix multiplication, meaning that when any square matrix $A$ is multiplied by an identity matrix (of compatible size), $A$ remains unchanged.

The general form of an identity matrix of size $n \times n$ is:

$$
I_n = \begin{pmatrix}
1 & 0 & \cdots & 0 \\
0 & 1 & \cdots & 0 \\
\vdots & \vdots & \ddots & \vdots \\
0 & 0 & \cdots & 1
\end{pmatrix}
$$

Here, $I_n$ represents an $n$-order identity matrix. The subscript $n$ can be omitted when the size is understood from the context.
###### Properties of the Identity Matrix
1. **Multiplicative Identity:** For any $n \times n$ matrix $A$,

$$
AI = IA = A
$$

where $I$ is the $n \times n$ identity matrix.
1. **Unchanged by Multiplication:** Multiplying any matrix by the identity matrix (of compatible dimensions) on either side doesn’t change the original matrix.
2. **Inverse:** The identity matrix is its own inverse, so $I^{-1} = I$.
3. **Uniqueness:** For each order $n$, there is exactly one $n \times n$ identity matrix.
- - - 

#### Relationship between augmented matrices and Ax
The matrix $A$ represents the coefficients of the variables in the system, $x$ represents the column vector of variables, and $b$ represents the column vector of constants on the right-hand side of the equations.

1. **Write down the system of equations**: Start by writing each equation in the system so that all terms are aligned by their variables and the constants are on the right side. For example, consider a system of two equations:

$$
\begin{align}
2x + 3y = 5 \\
4x - y = 3
\end{align}
$$

2. **Extract the coefficients and the constants**: For each equation, write down the coefficients of the variables in the order they appear and the constant term from the right-hand side. For the example above, the coefficients are $2$, $3$ for the first equation and $4$, $-1$ for the second, with constants $5$ and $3$, respectively.

3. **Form the coefficient matrix $A$**: This matrix is formed by placing the coefficients of the variables in their respective positions as they appear in the equations:

$$
A = \begin{pmatrix}
2 & 3 \\
4 & -1 \\
\end{pmatrix}
$$

4. **Form the constant vector $b$**: This vector contains the constants from the right-hand side of each equation:

$$
b = \begin{pmatrix}
5 \\
3 \\
\end{pmatrix}
$$

5. **Combine into the augmented matrix**: The augmented matrix is formed by appending the constant vector $b$ to the right of the coefficient matrix $A$. This is done to create a new matrix that includes all the information from the system of equations in a compact form. The augmented matrix for the system above is:

$$
\left[\begin{array}{cc|c}
2 & 3 & 5 \\
4 & -1 & 3 \\
\end{array}\right]
$$

The vertical line in the augmented matrix separates the coefficients of the variables (on the left) from the constants (on the right), visually distinguishing the parts of the system of equations.
- - - 
#### Span
In the context of Systems of Linear Equations (SLEs), the term "span" refers to the concept of spanning sets from linear algebra. Specifically, it describes the set of all possible vectors that can be created by taking linear combinations of a given set of vectors. In the context of SLEs, these vectors usually represent the columns of the coefficient matrix associated with the system.
##### Definition
Given a set of vectors $v_1, v_2, ..., v_n$ in a vector space $V$, the span of these vectors, denoted as $\text{Span}(v_1, v_2, ..., v_n)$, is the set of all vectors that can be formed by linear combinations of $v_1, v_2, ..., v_n$. A linear combination of these vectors can be written as $c_1v_1 + c_2v_2 + ... + c_nv_n$, where $c_1, c_2, ..., c_n$ are scalars.
##### Span in SLEs
In the context of an SLE represented as $Ax = b$, where $A$ is the coefficient matrix, $x$ is the vector of variables, and $b$ is the vector of constants:

- The columns of $A$ represent the vectors.
- The span of these column vectors determines the set of all possible outcomes ($b$ vectors) that can be achieved through the system of linear equations.
- If $b$ is in the span of the columns of $A$, the system has at least one solution.
- The concept of span is closely related to the idea of the column space of $A$, which is the span of its column vectors.
##### Importance
The span of the column vectors in $A$ tells us about the solutions of the SLE:
- **Consistency:** If the vector $b$ is within the span of the columns of $A$, the system is consistent (it has at least one solution).
- **Inconsistency:** If $b$ is not in the span, the system is inconsistent (no solution exists).
- **Dimensionality of Solutions:** The dimension of the span (or the column space) of $A$ can indicate the number of linearly independent directions in which solutions to the system can vary, affecting the number and type of solutions (unique, infinite, or none).

#### Example of finding the Span
Let's consider a system of linear equations (SLE) and illustrate how the concept of span relates to finding solutions.
###### System of Linear Equations Example
Consider the following system of linear equations:

1. $2x + y = 5$
2. $4x + 2y = 10$

These equations can be represented in matrix form as $Ax = b$, where

$$
A = \begin{pmatrix}
2 & 1 \\
4 & 2 \\
\end{pmatrix}, \quad
x = \begin{pmatrix}
x \\
y \\
\end{pmatrix}, \quad
b = \begin{pmatrix}
5 \\
10 \\
\end{pmatrix}
$$
###### Column Vectors of A
The matrix $A$ has two column vectors:

- $v_1 = \begin{pmatrix} 2 \\ 4 \end{pmatrix}$
- $v_2 = \begin{pmatrix} 1 \\ 2 \end{pmatrix}$
###### Span of the Column Vectors
The span of these vectors, $\text{Span}(v_1, v_2)$, represents all linear combinations of $v_1$ and $v_2$. However, if you look closely, you'll notice that $v_2$ is just $v_1$ scaled by a factor of $\frac{1}{2}$. Therefore, $v_1$ and $v_2$ are linearly dependent, and the span of these vectors is essentially all vectors along the line defined by $v_1$ (or $v_2$).
###### Solution to the SLE
- By inspecting the system, we see that the second equation is just the first equation multiplied by 2. This redundancy means our system doesn't span the entire plane of $\mathbb{R}^2$ but rather a line.
- The vector $b = \begin{pmatrix} 5 \\ 10 \end{pmatrix}$ is exactly two times the vector $\begin{pmatrix} 2.5 \\ 5 \end{pmatrix}$, which can be obtained from the equation $2x + y = 5$ by choosing $x = 2.5$ and $y = 0$.
- Since $b$ is on the line spanned by $v_1$ and $v_2$, it means the system has solutions, and in this case, an infinite number of solutions because the system is underdetermined (the equations are linearly dependent).
###### Geometric Interpretation
Geometrically, both equations represent the same line in $\mathbb{R}^2$. Any point $(x, y)$ on this line is a solution to the system. The span of the column vectors of $A$ (the line) includes the vector $b$, which confirms that solutions exist.

