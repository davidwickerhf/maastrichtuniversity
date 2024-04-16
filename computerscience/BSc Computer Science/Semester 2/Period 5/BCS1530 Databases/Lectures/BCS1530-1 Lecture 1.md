---
date: 2024-02-06
type: lecture
tags:
  - type/lecture
course: BCS1530
period: 4
lecture-slides: 
notes-complete:
---
## Lecture notes
```table-of-contents
```

- - - 
#### Introduction to databases
> [!note] Definition
> Databases are collections of information that
> 1. exist over a long period of time
> 2. are stored on a secondary storage in a structured way
> 3. are managed by a computer program called [[Database Management System]] (DBMS)

**Formal definition (Connolly and Begg)**
- A shared collection of logically **related data and its description**, designed to meet the informational needs of an organization
	- minimum duplication
	- self describing nature → data+metadata
	- Data abstraction 
	- Information takes the form of entities, attributes and relationships

**Logically related**
- Entity → Distinct object in an organization
- Attribute → Property describing aspects of an entity
- Relationship → Associations between entities (e.g. [[Entity Relationship Diagrams]])

**Databases and Management Systems**
- **Data-Definition Language**: Should allow users to define the logical structure of a database
- **Data-Modification Language**: Should allow users to modify the data within the database
- Support the storage of large amounts of data over a long period of time, allowing efficient access for **==queries==** and database modifications
- **Durability**: Enable durability, recovery of DBs in case of failures
- **Concurrency**: Control shared access to data from many users at once

**Early DBMS**
- [[Edgar Codd]] → Mathematician at IBM Research in the late 1960s
- Codd saw IBM developers rewriting database programs every time the database schema changed
- He devised the **[[Relational Model]]**

**Evolvement of Databases**
1. File Systems
2. Hierarchical Models → Tree structure
3. Network Data Model
4. **Relational Databases**
5. Object Oriented DB
6. Non-Relational Databases
7. Distributed Systems → New norm nowadays. Rely on the relational model
8. Blockchain 
9. GraphDB


## Key takeaways
- a

- - - 
## Lecture slides