Slides for reference:
- [[W4L2Final.pdf]]
- [[W5L1.pdf]]
- [[W5L2Final.pdf]]

Design patterns are standardized solutions to common problems in software design. They represent best practices evolved through experience in software development. Patterns are categorized based on their intent and the nature of the problem they solve into three main categories: **Creational, Structural, and Behavioral**.
### Creational Design Patterns

Creational patterns are focused on ways to create objects or classes. They abstract the instantiation process, making systems more independent of how objects are created, composed, and represented. Creational patterns help in reducing complexities and dependencies associated with object creation.

- **Factory Method**: Delegates the creation of objects to subclasses, allowing flexibility in object instantiation.
- **Abstract Factory**: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
- **Singleton**: Ensures a class has only one instance and provides a global point of access to it.
- **Builder**: Allows for the construction of complex objects step by step, separating the construction and representation.
- **Prototype**: Creates new objects by copying an existing object, allowing for easier creation of instances similar to an existing instance.

### Structural Design Patterns

Structural patterns deal with how classes and objects are composed to form larger structures. They help ensure that if one part of a system changes, it doesn’t affect other parts of the system. These patterns focus on ways to assemble objects to implement new functionalities while keeping these systems flexible and efficient.

- **Adapter**: Allows the interface of an existing class to be used as another interface, making incompatible interfaces work together.
- **Composite**: Composes objects into tree structures to represent part-whole hierarchies, allowing clients to treat individual objects and compositions uniformly.
- **Proxy**: Provides a placeholder for another object to control access to it, adding a level of indirection to operations.
- **Decorator**: Dynamically attaches additional responsibilities to an object without modifying its structure.
- **Bridge**: Decouples an abstraction from its implementation, allowing the two to vary independently.
- **Facade**: Provides a simplified interface to a complex subsystem, making the subsystem easier to use.

### Behavioral Design Patterns

Behavioral patterns are concerned with algorithms and the assignment of responsibilities between objects. They focus on communication between objects, making the interaction between objects easier, more flexible, and more efficient.

- **Observer**: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
- **Strategy**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable, allowing the algorithm to vary independently from the clients that use it.
- **Command**: Encapsulates a request as an object, thereby allowing for parameterization and queuing of requests, and providing additional functionalities such as undoable operations.
- **State**: Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.
- **Iterator**: Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
- **Mediator**: Defines an object that encapsulates how a set of objects interact, promoting loose coupling by keeping objects from referring to each other explicitly.

In essence, **Creational patterns** simplify the creation process of objects, **Structural patterns** deal with the composition of classes or objects, and **Behavioral patterns** focus on communication between objects. Understanding these patterns enables developers to solve common software design problems efficiently.
### Example Design Patterns

#### Factory Method
- **Intent**: Allows a class to defer instantiation to subclasses.
- **Example**: Logistics system where the type of transportation (Truck or Ship) is decided at runtime based on logistics type.
- **Code Snippet**:
```java
public abstract class Logistics {
    abstract Transport createTransport();
}

public class RoadLogistics extends Logistics {
    @Override
    Transport createTransport() {
        return new Truck();
    }
}

public class SeaLogistics extends Logistics {
    @Override
    Transport createTransport() {
        return new Ship();
    }
}

public interface Transport {
    void deliver();
}

public class Truck implements Transport {
    public void deliver() {
        System.out.println("Delivery by land.");
    }
}

public class Ship implements Transport {
    public void deliver() {
        System.out.println("Delivery by sea.");
    }
}
```

#### Decorator
- **Intent**: Dynamically adds new behaviors to objects without altering their implementation.
- **Example**: A coffee app where you can dynamically add ingredients (like milk, sugar) to the base coffee.
- **Code Snippet**:
```java
public abstract class Beverage {
    abstract int cost();
}

public class Espresso extends Beverage {
    public int cost() {
        return 1; // Base cost for Espresso
    }
}

public abstract class AddOnDecorator extends Beverage {
    protected Beverage beverage;
}

public class CaramelDecorator extends AddOnDecorator {
    public CaramelDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
    public int cost() {
        return beverage.cost() + 2; // Adding cost of caramel
    }
}
```
#### Strategy
- **Intent**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
- **Example**: Different types of ducks in a game, where each duck type has its own flying and quacking behavior.
- **Code Snippet**:
```java
public interface FlyBehavior {
    void fly();
}

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("Flying with wings.");
    }
}

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("Cannot fly.");
    }
}

public abstract class Duck {
    FlyBehavior flyBehavior;

    public void performFly() {
        flyBehavior.fly();
    }
}

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
    }
}
```

These patterns are instrumental in solving common design problems in object-oriented software development, allowing for more maintainable, scalable, and robust systems. By understanding these patterns, you'll be better equipped to recognize and implement effective solutions in your software projects.