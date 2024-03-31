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