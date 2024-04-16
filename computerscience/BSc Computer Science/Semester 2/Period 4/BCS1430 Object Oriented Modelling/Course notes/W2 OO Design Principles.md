Slides for reference:
- [[W2L1Actual.pdf]] 
- [[W2L2Actual.pdf]]

The principles of Object-Oriented Analysis and Design (OOAD) focus on understanding and creating software based on the concept of objects, which encapsulate both data and behaviors relevant to software solutions. This approach emphasizes the importance of **modular**, **reusable**, and **flexible** design that can adapt to changes over time. 

**Why does OOA&D matter?** → To understand complex systems through the interactions of simpler parts and allows to create modular, reusable and flexible software.

**What are the benefits of OOD?** → 
### Object-Oriented Analysis (OOA)
> [!note] Definition
> The process of looking at a problem, system or situation, and identifying the **objects** and **interactions** between those objects.

OOA involves **==examining a problem==** or system to identify the objects (entities) and their interactions. This phase is about understanding what the system needs to do. For instance, in a food delivery app, OOA would identify entities such as Customer, Restaurant, Order, and DeliveryPerson, and explore their relationships and how they interact to fulfill orders.
### Object-Oriented Design (OOD)
OOD takes the findings from OOA and formulates a software solution. It's about deciding how to implement the identified requirements in software, using classes and objects that interact in well-defined ways. This phase might determine how to encapsulate data for a Restaurant or define behaviors for a Customer object in the food delivery app example.

### Principles of Good Software Design in OOA&D:
1. **Modularity:** Breaking down a system into smaller parts (modules) that can be developed, tested, and maintained independently. The modularity is the degree to which a system is composed of discrete components, so that a change to one components has minimal impact to other components.
2. **Reusability:** Designing components that can be used in different systems to save development time and increase productivity. 
3. **Flexibility:** Creating software that can be easily modified to adapt to new requirements or environments.

### Software quality attributes
1. **Functionality** → Product provides the functions that meet the needs (Completeness, Correctness, Appropriateness)
2. **Reliability** → Software’s capacity to maintain its performance level (Maturity, Fault Tolerance, Recoverability)
3. **Usability** → How well the product or system can be used to achieve the specified goals (Understandability, Learnability, Operability)
4. **Efficiency** → Relationship between the performance and the resources used
5. **Maintainability** → Ease with which the software can be modified to correct faults or improve performance or features
6. Portability
7. Compatibility
8. Security

To develop good software, one needs to
1. Understand the requirements
2. Analyze the requirements in an Objet Oriented context (OO Analysis) 
3. Design the software using OO design principles

### Gathering Requirements:
- **Functional Requirements (FR):** Describe the specific behavior or functions of the system, like allowing users to place orders in a food delivery app.
- **Non-Functional Requirements (NFR):** Criteria for evaluating the operation of a system, such as *performance*, *usability*, *reliability*, and *security*.
- **Domain Requirements:** Reflect domain-specific knowledge, standards or regulations that the software must comply with. (e.g GDPR)

### Use Cases:
A use case is a description of how users interact with the system to achieve a goal. It outlines the steps taken by the user and the system's responses. For example, a use case for a food delivery app might detail the process of a customer placing an order, including selecting items, choosing a payment method, and receiving order confirmation.

- **Use Case Actor**: The user performing the behavior. 
- **Stakeholder**: Individuals with interests in the system. 
- **Preconditions**: States that must be true before the use case runs. 
- **Triggers**: Events that initiate the use case. 
- **Main Success Scenarios** (Basic Flow): The expected successful path. 
- **Alternative Paths** (Alternative Flows): Variations when deviations occur.

![[Screenshot 2024-04-05 at 10.49.20.png]]

### MoSCoW Method for Requirements Prioritization:
This method categorizes requirements into four groups to help prioritize development efforts:
- **(M) Must have:** Essential for the system to be considered successful.
- **(S) Should have:** Important but not necessary for launch.
- **(C) Could have:** Desired features that are not critical.
- **(W) Won’t have this time:** Identified for future development phases but not included in the current scope.

### Analysis Techniques:
- **Identifying Objects and Classes:** Determining the entities in the system and their attributes and behaviors.
- **Identify Relationships and Interactions:** Understanding how objects relate to and interact with each other.
	- **Associations** → connections between objects (`use-a`, `has-a`). Can be `one-to-one`, `one-to-many`, `many-to-one` or `many-to-many`
	- **Aggregations** → Whole-part relationships indicating a collective. Individual items can exist without the aggregation. Denotes a `has-a` relationship/
	- **Compositions** → Dependencies. Denotes a `contains-a` relationship.
- **Object Interaction Analysis:** Analyzing the communication and collaboration between objects to design their interactions.

### Design Techniques:
- **Assigning Responsibilities:** Determining which class should be responsible for each piece of data or behavior.
- **Class-Responsibility-Collaborator (CRC) Cards:** A tool for defining the responsibilities and collaborations of classes.
	- **Class name** → entity being modelled
	- **Responsibilities** → What the class should know or do
	- **Collaborators** → Classes interacted with
- **Class Diagrams:** Visual representations of the classes in a system, their attributes, operations, and the relationships between them.

### Good design in software
- **Simplicity** → essential elements, more understandable software and less error-prone
- **Consistency** → uniformity in visual elements, terminology and behavior
- **Modularity** → system as separate, interchangeable components
- Usability → intuitive and accessible software
- **Maintainability**
- **Robustness** → ability to respond to unpredicted errors

### OO Design Principles
- **DRY (Don’t Repeat Yourself)** → Avoid code duplication. Every piece of knowledge should have a single representation.
- **KISS (Keep it Simple, Stupid)** → Simple design. Avoid unnecessary complexity
- **YAGNI (You Aren’t Gonna Need It**) → Don’t implement something until it is necessary
- **Separation of Concerns** → Different functionality managed by separate code. Divide a program into distinct sections.
- **Principle of Least Astonishment** → Software behaves how users will expect it to.
- **Law of Demeter** → Object should only interact with its direct components and not concern itself with the internal details of other objects.
- **Low Coupling** → Minimize dependencies between classes to reduce the impact of changes and improve reusability. Reduce interconnectedness of classes

### GRASP Principles


### SOLID Principles
Five fundamental principles in OO programming and design that promote software maintainability and extensibility

1. **Single Responsibility** → Classes have one reason to change
2. **Open/Closed** → Design modules that are open for extension, but closed for modification. New functionality can be added through subclasses or interfaces without changing code.
3. **Liskov Substitution** → Ensure subclasses can replace their superclasses without altering the program’s correctness
4. **Interface Segregation** → Clients should not be forced to depend on interfaces they do not use.
5. **Dependency Inversion** → High-level entities should not depend on low-level entities.