Slides for reference:
- [[W2L1Actual.pdf]] 
- [[W2L2Actual.pdf]]

The principles of Object-Oriented Analysis and Design (OOAD) focus on understanding and creating software based on the concept of objects, which encapsulate both data and behaviors relevant to software solutions. This approach emphasizes the importance of modular, reusable, and flexible design that can adapt to changes over time. Here's a deep dive into these principles, enriched with explanations and examples:

### Object-Oriented Analysis (OOA)
OOA involves examining a problem or system to identify the objects (entities) and their interactions. This phase is about understanding what the system needs to do. For instance, in a food delivery app, OOA would identify entities such as Customer, Restaurant, Order, and DeliveryPerson, and explore their relationships and how they interact to fulfill orders.

### Object-Oriented Design (OOD)
OOD takes the findings from OOA and formulates a software solution. It's about deciding how to implement the identified requirements in software, using classes and objects that interact in well-defined ways. This phase might determine how to encapsulate data for a Restaurant or define behaviors for a Customer object in the food delivery app example.

### Principles of Good Software Design in OOA&D:
1. **Modularity:** Breaking down a system into smaller parts (modules) that can be developed, tested, and maintained independently.
2. **Reusability:** Designing components that can be used in different systems to save development time and increase productivity.
3. **Flexibility:** Creating software that can be easily modified to adapt to new requirements or environments.

### Gathering Requirements:
- **Functional Requirements (FR):** Describe the specific behavior or functions of the system, like allowing users to place orders in a food delivery app.
- **Non-Functional Requirements (NFR):** Criteria for evaluating the operation of a system, such as performance, usability, reliability, and security.

### Use Cases:
A use case is a description of how users interact with the system to achieve a goal. It outlines the steps taken by the user and the system's responses. For example, a use case for a food delivery app might detail the process of a customer placing an order, including selecting items, choosing a payment method, and receiving order confirmation.

### MoSCoW Method for Requirements Prioritization:
This method categorizes requirements into four groups to help prioritize development efforts:
- **Must have:** Essential for the system to be considered successful.
- **Should have:** Important but not necessary for launch.
- **Could have:** Desired features that are not critical.
- **Won’t have this time:** Identified for future development phases but not included in the current scope.

### Analysis Techniques:
- **Identifying Objects and Classes:** Determining the entities in the system and their attributes and behaviors.
- **Identify Relationships and Interactions:** Understanding how objects relate to and interact with each other.
- **Object Interaction Analysis:** Analyzing the communication and collaboration between objects to design their interactions.

### Design Techniques:
- **Assigning Responsibilities:** Determining which class should be responsible for each piece of data or behavior.
- **Class-Responsibility-Collaborator (CRC) Cards:** A tool for defining the responsibilities and collaborations of classes.
- **Class Diagrams:** Visual representations of the classes in a system, their attributes, operations, and the relationships between them.

### Conclusion:
OOA&D is a comprehensive approach that helps developers understand complex systems by breaking them down into manageable objects. It emphasizes modularity, reusability, and flexibility, guiding the design of software that is efficient, maintainable, and adaptable. Through gathering and prioritizing requirements, analyzing object interactions, and carefully assigning responsibilities, developers can create robust object-oriented systems that meet users' needs effectively.