### Introduction to OOM
#### Software Complexity

- **Simple Rules Leading to Complex Outcomes**: The lecture illustrates how simple computational rules can lead to complex and unpredictable software behaviors. This complexity is likened to a game of chess, where basic moves can result in a myriad of strategies and outcomes. The complexity escalates as software scales, leading to challenges in comprehensibility, especially within large, evolving teams. Real-world examples, like the Linux Kernel and Firefox Browser, demonstrate how software complexity has grown over time.
- **The [[Paradox of Simple Rules and Complex Outcomes]]**: This concept is crucial for understanding that the foundation of complex software systems often starts with straightforward principles. The unpredictability arises from the interactions among these principles, highlighting the importance of designing with modularity, reusability, and flexibility in mind to manage and mitigate inherent complexities.

#### Software Development Life Cycle (SDLC)

- **Introduction to the [[Waterfall Model]]**: The lecture introduces the Waterfall model as a sequential **approach to software development**. This model is characterized by its structured and methodical phases, including Requirements, Design, Implementation, Verification, Deployment, and Maintenance. Each phase has specific outcomes and deliverables, cascading down to the next phase like a waterfall.
- **Phases of the [[Waterfall Model]]**:
	- **Requirements**: Identifying what the software is supposed to do, categorized into Functional and Non-Functional Requirements.
	- **Design**: Outlining how the software will achieve these requirements through UI/UX design and system architecture.
	- **Implementation**: Turning the design documents into a working software product through coding.
	- **Verification**: Ensuring the software meets all specified requirements through systematic testing.
	- **Deployment**: Making the software available to end-users and monitoring its initial performance.
	- **Maintenance**: Providing ongoing support, bug fixes, and updates based on user feedback.
### Object-Oriented Programming (OOP)

OOP is a programming paradigm centered around the concept of "objects", which are instances of classes. These objects encapsulate both data and the functions that operate on the data. OOP is used for structuring software in a way that is flexible, modular, and abstracts complex real-world interactions.

#### Key Concepts and Pillars of OOP

- **Classes and Objects**: A class is a blueprint for creating objects (a particular data structure), containing both static content (attributes) and dynamic content (methods). An object is an instance of a class. For example, consider a `Dog` class with attributes like `name` and `breed`, and methods like `bark()`. Creating a `Dog` object would involve specifying these attributes and behaviors for the individual dog.

  ```java
  public class Dog {
      private String name;
      private String breed;

      public void bark() {
          System.out.println("Woof Woof");
      }

      // Setter methods
      public void setName(String name) {
          this.name = name;
      }

      public void setBreed(String breed) {
          this.breed = breed;
      }
  }
  ```

- **Encapsulation**: Encapsulation involves bundling the data (attributes) and methods that operate on the data into a single unit, or class, and restricting access to some of the object's components. This is typically achieved using access modifiers like private, public, and protected. Encapsulation allows the internal representation of an object to be hidden from the outside, only exposing a public interface.

- **Inheritance**: Inheritance is a mechanism where a new class (subclass) is derived from an existing class (superclass). The subclass inherits all the public and protected properties and methods from the superclass but can also have its own additional features. For example, a `Bird` class could inherit from an `Animal` class, adding bird-specific behaviors while still retaining the general attributes of an animal.

  ```java
  public class Animal {
      protected String name;

      public void eat() {
          System.out.println(name + " eats");
      }
  }

  public class Bird extends Animal {
      public void fly() {
          System.out.println(name + " flies");
      }
  }
  ```

- **Polymorphism**: Polymorphism allows objects of different classes to be treated as objects of a common superclass. It's the ability to present the same interface for differing underlying forms (data types). For example, you could have a method that takes an `Animal` object as a parameter but then pass in a `Bird` or `Dog` object, and the method would work with either because they share the same superclass.

- **Abstraction**: Abstraction is the concept of hiding the complex reality while exposing only the necessary parts. It means that the user interacts with only what is necessary, and the implementation details are kept away from the user. For example, a car can be driven with the knowledge of how to operate the steering wheel and pedals, without knowing how the engine works.

### Real-World Application

The principles of OOP reflect in how complex systems are modularized and managed in real-world applications. Consider a software application like a music streaming service:
- **Classes and Objects**: Each song, user, playlist, etc., can be represented as objects, with classes defining the common structure and behavior for these entities.
- **Encapsulation**: User data might be encapsulated within a `User` class, with methods to modify (mutator methods) or retrieve (accessor methods) the data, ensuring that sensitive information is kept secure.
- **Inheritance**: A `PremiumUser` class might inherit from a general `User` class, adding premium-specific features like higher audio quality and offline downloads.
- **Polymorphism**: A general method to play media could accept any form of media object (songs, podcasts, videos), each with their own play behavior.
- **Abstraction**: The streaming service hides the complex algorithms for recommendations, data storage, and stream buffering, providing a simple interface for users to enjoy music.