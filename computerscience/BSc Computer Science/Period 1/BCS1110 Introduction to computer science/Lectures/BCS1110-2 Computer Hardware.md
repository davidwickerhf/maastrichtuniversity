> [!warning] Exam info
> Most important is:
> - Binary number system (and conversion)
> - What CPU is and how it works
> - Basic computer components

## Lecture notes
#### Initial terms
- **==Transistors==** → Can amplify or switch eletronic signals and eletrical power. Made from semiconductors. They can control flow of electricity by applying a small input signal
	- **Collector** → collects the current
	- **Base** → receives the input signal which turns on/off the switch
	- **Emitter** → where the current is released if the base receives an input
- **==Current==** → flow of eletric charge through a current, measured in Ampere. In CS we consider the states when the current flows (1) or when it doesn’t (0)
- **==Circuit==** → Multiple transistors mixed together
- **==Gate==** → combined circuits/transistors 
	- **AND** ( $.$ ) Gate → Both input need to be true
	- **OR** Gate ($+$) → Either input must be true
	- **XOR** Gate ( $\oplus$ )→ Accepts only one true input → $A . B' +A ' . B$
	- **NOT** ( $‘$) → inverts the input

#### Abstraction in hardware design

#### Binary number system
- **==Half adder==** → doesn’t account for the carry bit
	- ![[Screenshot 2023-09-05 at 2.17.53 PM.png]]

#### [[Arithmetic logic unit]]
<u>Abstraction</u> of basic circuits → Somewhat smarter than normal circuits
ALU does not have excess memory → it cannot store the processed information
- **Opcode** (Operation code) → type of operation we want to perform
- **Status** → whether the operation was successful
- **Result** → Result of the operation
- A & B → the two inputs of the operation

> [!warning] Exam info
> Most complicated in the exam will be basic combinational circuits such as XOR (slide 19)

#### Central processing unit
![[Screenshot 2023-09-05 at 2.46.06 PM.png]]
- **[[BCS1110-2 Computer Hardware#Arithmetic logic unit |Arithmetic logic unit]]** 
- **Random Access Memory** → stores data and instructions that the CPU accesses during execution. Volatile memory. 
- **Registers** → Temporary memory that CPU’s have direct access to
- **Control unit** → Receives instruction from memory and controls flow of data within the CPU. Interprets the Opcode to determine the operation to be performed by ALU or memory

## Instructions set and machine code
![[Screenshot 2023-09-05 at 2.59.39 PM.png]]![[Screenshot 2023-09-05 at 2.59.01 PM.png]]
- ==**Instruction set**== → Collections of instructions that the CPU can execute. Operations that you can perform on the computer. They are identified by a certain Opcode.
	- RISC → Reduced Instructions Set → mostly in phones, low computational power
	- CISC → Complex Instructions Set

#### Moore’s Law
> [!note] Moore’s Law
> The number of transistors in a dense integrated circuit doubles about every two years.
- We are reaching a physical limit in Moore’s law


#### CPU components
![[Screenshot 2023-09-05 at 3.10.50 PM.png]]
- L3 memory cache
- integrated graphic processor
- Memory controller
- System agent/platform I/O 

## Lecture slides
![[Lecture 2 Computing Hardware (1).pdf]]

## Tutorial
![[Tutorial Lecture 2.pdf]]

## Required reading
![[Required Reading Lecture 2.pdf]]
