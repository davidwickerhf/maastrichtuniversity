---
date: 2023-xx-xx
type: lecture
tags:
  - type/lecture
course: BCS11X0
period: 1
lecture-slides: true
notes-complete:
---
- [[#Lecture notes|Lecture notes]]
	- [[#Lecture 1 (Introduction)|Lecture 1 (Introduction)]]
	- [[#Lecture 2 (Hardware)|Lecture 2 (Hardware)]]
	- [[#Lecture 3 & 4|Lecture 3 & 4]]
	- [[#Lecture 5|Lecture 5]]
	- [[#Lecture 6|Lecture 6]]
	- [[#Lecture 7|Lecture 7]]
	- [[#Lecture 8|Lecture 8]]
	- [[#Lecture 9|Lecture 9]]
	- [[#Demo exam paper|Demo exam paper]]
- [[#Key takeaways|Key takeaways]]
- [[#Lecture slides|Lecture slides]]

## Lecture notes
#### Lecture 1 (Introduction)
[[BCS1110-1 Intro lecture]]
- Is computer science a science? Engineering? Why?
- Read Required Reading → Why social aspects matter in computer science problems
- HTML example of creativity and logic intertwined in computer science
- Standardization & Non-Standardization → e.g. standardized protocols, or mishaps with non-Standardization
- Steps of computational thinking, abstraction, problem solving, decomposition
	- Level of abstractions (e.g. tutorial sheet question about a penguin)
	- Applying decomposition to a problem

#### Lecture 2 (Hardware)
[[BCS1110-2 Computer Hardware]]
- Building blocks of computing → (logic gates)
- Transistors are made of basic gates (AND, OR, NOT)
- Combinational Circuits (and designing them from boolean expressions)
	- e.g. Exclusive OR (XOR) → Level of complexity 
- Abstraction in Hardware
- Converting units (e.g. binary and decimal)  from and to another → won’t need a calculator
	- Required reading on storage units
- ALU, opcodes, status → Don’t memorize opcodes
- Structure of CPU, Instruction Sets, Moore’s Law (number of transistors on computer doubles every 2 years)
	- Control Unit, ALU, Registers, RAM
	- Questions similar to tutorial sheet (calculate size of a hardware x years back in time applying Moore’s Law)

#### Lecture 3 & 4
[[BCS1110-3 Algorithms and Command Line]] & [[BCS1110-4 Command Line and Git]]
- Read through Tom’s lecture slide
- Ignore historical facts
- Don’t memorize command line, but understand what basic ones do
- No git commands required in the exam → but maybe need to explain what a git command does 

#### Lecture 5
> [!warning] Exam material
> Everything in lecture slides of Week 3 is required for the exam

[[BCS1110-5 Theory of Computation]]
- Formal theory of computation
	- Why do we need it?
- Definitions of String, Language, Relationship, Alphabet, Character
- Finite Automata, design and recognition
	- ==Know how to design an automata== → few questions about this, look at tutorial sheets
- Deterministic Finite Automata

#### Lecture 6
[[BCS1110-5 Theory of Computation]]
- Design tabular automata out of a DFA (table of transitions and states)
- Design a automata from a language and then a tabular DFA from it
- Decipher existing DFA and design tabular DFA or language
- Regular language and Compliment of Regular Language (and relationship)
	- Can you design a DFA for a regular language?
	- Can you design a DFA for a complement of a regular language? 
- Design NFA → BUT you can design a DFA instead
	- You cannot design a NFA is a DFA is required!
	- When does an NFA accept, what are Epsilon transitions

#### Lecture 7
> [!warning] Exam materials
> You can ignore everything in Part 3 of the slides (71-83)
> But everything in part 4 is important (slides 85-90

[[BCS1110-7 Computer Networks]]
- Definitions of network, Shannon’s model, DNS, DNS Spoofing
- Network topologies (point to point, star, mesh, bus)
- What the internet is, how it started (university network)
- Different types of IP addresses (e.g. static, dynamic, private, public)
- Client-Server model, recognize them and explain why they are (or not) client-server models
- TCP/IP protocol and layers and protocols within each layer
	- HTTP, SMTP
	- TCP protocol
	- What protocols are in the transport layer, why do we need such layer?

#### Lecture 8
[[BCS1110-8 Practical Network Applications]]
- Go through lecture notes and look for the theory

#### Lecture 9
[[BCS1110-9 Information Security and Privacy]]
- Importance of security in computing and networks
- Encryption 
	- Difference between encryption and decryption
	- Symmetric vs Asymmetric encryption
	- Applications
- Misconceptions vs. Reality (don’t memorize)
	- End-to-end encryption, password managers
	- *Recognize if a practice implemented by a website is good or not and explain*
- Passwords
	- Hashing, Multi-factor Auth, password Attacks and prevention
	- Phishing and Dictionary Attacks
- Social engineering (look at Tom’s slides)

#### Demo exam paper
- 25 questions → multiple choice or open ended
- 2 hours to solve everything, some questions are harder or easier
- Properly motivate answers
- Name a type of algorithm that is not a program → "Baking a cake"
- Designing flowcharts (Tutorial sheet week 2)
- Explain the concept of closure properties of regular languages → 
	- Regular languages are ==**closed under complements**== (Complement of a Regular Language is still a Regular Language)
	- The constraints and the space of the problem is still the same
- When designing DFAs think about **Edge Cases**
- JavaCraft Project
	- Review project javacraft functions for exam (more abstract in the actual exam)
	- ==**Review JavaCraft Project FSA Submission**==
	- Review newly implemented blocks (Diamond, TNT, Iron Sword)

## Key takeaways

- - - 
## Lecture slides
![[Exam Prep - Introduction to Computer Science.pdf]]

![[Exam Prep Introduction.pdf]]

![[Sample Paper Intro to CS.pdf]]