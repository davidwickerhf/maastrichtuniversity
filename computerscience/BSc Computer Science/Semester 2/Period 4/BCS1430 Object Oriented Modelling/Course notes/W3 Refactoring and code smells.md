Slides for reference:
- [[W3L1Actual.pdf]]

This chapter delves into the essential techniques of refactoring, the identification and handling of code smells, and the principles behind crafting more maintainable and understandable code. Through real-world analogies, code snippets, and step-by-step examples, we'll explore how to enhance code quality systematically.

### Introduction to Refactoring
**Refactoring** is the process of restructuring existing computer code—changing the factoring—without changing its external behavior. Its primary goals are to make code more understandable and cheaper to modify without introducing bugs. 

#### **Motivations for Refactoring** include:
- **Enhancing Code Clarity:** Making the code easier to read and understand.
- **Mitigating Technical Debt:** Addressing the compromises made for short-term gains to ensure long-term health of the software.
- **Easing Future Modifications:** Simplifying the addition of new features or fixing bugs.
- **Spotting and Resolving Defects:** Improving code quality and preventing future issues.

### Refactoring Example
**Small Behavior-Preserving Transformations** play a pivotal role. By making minor, incremental modifications, significant improvements in the system's architecture can be achieved without altering its behavior. 

For instance, consider a **Movie Rental System** where the calculation of a rental price depends on the movie type. The initial implementation might include a complex method with multiple conditional statements. Through refactoring, this can be simplified by introducing a strategy pattern where each movie type (Regular, New Release, Children's) calculates its charge, embodying the Open/Closed Principle.

### Introduction to Code Smells
**Code Smells** are indicators of potential problems in code that may require refactoring. Recognizing these smells is the first step towards improving code quality. Common smells include **Duplicated Code, Long Method, Large Class,** and more.

### Types of Code Smells and Solutions
1. **Bloaters:** Code, methods, or classes that have grown too large. **Solution:** Decompose the large structures into smaller, more manageable pieces.
   
2. **Object-Orientation Abusers:** Misuse of object-oriented principles. **Solution:** Refactor to use inheritance and polymorphism appropriately.
   
3. **Change Preventers:** Code that is hard to change due to its structure. **Solution:** Refactor to separate concerns and make the code more modular.
   
4. **Dispensables:** Unnecessary code that can be removed. **Solution:** Eliminate dead code, redundant comments, and simplify overly complex expressions.
   
5. **Couplers:** Excessive coupling between classes. **Solution:** Encourage loose coupling through interfaces or abstract classes.

### Practical Refactoring Techniques
- **Extract Method:** For simplifying long methods by breaking them down into smaller ones.
- **Move Method/Field:** To place methods or fields in classes where they are more relevant.
- **Replace Conditional with Polymorphism:** Use polymorphism instead of conditional statements for behavior that varies by type.
- **Encapsulate Field:** Restrict direct access to fields to ensure more control over how they are accessed and modified.

### Example: Refactoring a Video Store System
Consider the refactoring of a video store system where the rental charge calculation is initially implemented with conditional logic. By applying the **Extract Method** and **Replace Conditional with Polymorphism** techniques, each Movie type (Regular, New Release, Children) can override a method to calculate its charge, significantly simplifying the main calculation method and adhering to the Open/Closed Principle.

```java
abstract class Movie {
    abstract double getCharge(int daysRented);
}

class RegularMovie extends Movie {
    @Override
    double getCharge(int daysRented) {
        // Regular movie charge calculation
    }
}

class NewReleaseMovie extends Movie {
    @Override
    double getCharge(int daysRented) {
        // New release movie charge calculation
    }
}

class ChildrensMovie extends Movie {
    @Override
    double getCharge(int daysRented) {
        // Children's movie charge calculation
    }
}
```

### Conclusion
Refactoring and addressing code smells are ongoing processes that significantly impact the maintainability and readability of code. By applying systematic refactoring techniques and principles, developers can ensure their codebase remains clean, understandable, and easy to modify over time, ultimately leading to more robust and reliable software.