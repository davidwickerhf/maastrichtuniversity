#### Bits
- Just 0 or 1, smallest unit of storage
- Can be stored in anything with two separate states (e.g. eletric charge, magnetism)
- **1 byte: 8 bits**

> [!note] Patterns with n bits
> Number of patterns  $= 2^n$
#### Bytes
- Can store 1 character
- 1 byte can be laid out in **==256==** different patterns
- A single byte can store numbers from **==0 to 255==** 
- Units of measure
	- Kilobyte → 1 thousand bytes
	- Megabyte → 1 million bytes
	- Gigabyte → 1 billion bytes
	- Terabyte → 1 trillion bytes

#### ASCII Code
- Characters are mapped to numbers and stored in 1 byte
- Unicode → characters saved in 2 bytes

#### Numbers in computers
- Integers typically stored with either 4 or 8 bytes
- Leftmost byte of an integer is used to store the sign of the integer
- **==Integer overflow==** → when adding/multiplying integers the bit is carried to the left, but when there are no more available bits, the bit reserved for the sign is utilized
	- When adding 1 to 2147483647, we get -2147483647

#### Gigahertz
- Measure of speed (not bytes)
- 1 GHz → 1 billion cycles per second
- 
