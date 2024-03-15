#### Tutorial questions
**==Subjective questions==**
1. **Why do we have domain names? What is a real-life example of a domain name? Describe how domain names are hierarchical.** 
	1. Domain names are easier to remember and readable by humans (e.g. google.com)
	2. Domain names are organized in a hierarchical manner (like a tree network model) to facilitate the association between the requested domain name and the corresponding IP Address
	3. A DNS root server stands at the top of the tree. When the user’s device makes a request to the DNS Resolver, this is forwarded to the DNS root server. It then forwards it to the relevant 1st Level Domain Server (e.g. .com, .nl, .it), which then forwards it to the relevant 2nd Level Domain Server (e.g. google, amazon) which then responds by retrieving the specific page or resource the user requested.
	4. This communication is handled within a Client-Server architecture
	5. DNS are subject to DNS Spoofing → the attacker’s server alters a DNS record for a specific domain, hence when a user requests the IP for such domain it obtains the spoofed IP address the attacker inserted
2. **Describe the server/client model. Which is your computer?**
	1. The Client-Server model structures network communications between a client (an **active**, **limited-time process**, which means that the client is able to make requests to a server but it only runs based on user input) and a server (a **passive**, **unlimited-time** **process**, which means that the server program can only respond to incoming requests, and as such needs to be running indefinitely on a server).
	2. A client process can make requests to a server process and expect a response. To contextualize, the client server is most generally the device used by a user (such as a personal computer, a mobile phone, etc.), although any computer can technically be setup to be a server and receive requests.
3. **Who controls the internet?**
	1. No single entity runs the internet, but the internet is gouverned by shared protocols, procedures and technologies
	2. The [ICANN] supervises the development of the internet (internet Corporation for Assigned Names and Numbers)
	3. The infrastructure of the internet is owned and managed by different companies
		1. Tier 1 USO network providers → backbone of the internet
		2. Tier 2 ISP (internet service providers) → maintain the network and manage distribution
		3. Tier 3 ISP → Offer connectivity to end users or companies 
4. **Why is TCP/IP important? What would happen if these protocols didn’t exist? Choose one layer of the protocol and explain what challenges it seeks to overcome.**
	1. 
5. **Why does Google frequently re-crawl the internet? (optional)**
6. **Find an API online - what types of information can you get from that API? (covered in Week 5 Lab)**

**==Objective questions==**
 1. Describe the following terms: 
	 1. a. **LAN** → Local Area Network. Connects devices in a single building (e.g. school, labs)
	 2. b. **API** (covered in Week 5 Lab) → Application Programming Interface. Intermediary between two applications (usually client and server). They define what operations can be performed on the server and how those operations can be executed, as well as the data format used for communication
		 1. Abstraction → the client process and consume the API without knowing how it works
		 2. Definition → The API has a defined set of commands for data access
		 3. Availability → Many companies offer public APIs to their services (e.g. NASA, Twitter, Reddit (not anymore))
	 3. c. **JSON** (covered in Week 5 Lab) → JASON (JavaScript Object Notation) is a standardized data model for the exchange of data through networks and APIs as well as between different programs (different programs may use different programming languages and as such require a common standardized way of exchanging information).
	 4. d. **Ethernet** → Standard of wired network cables within LAN
 2. **Identify the main components of an API and explain their functions. (covered in Week 5 Lab) •** 
 3. **Explain the concept of DNS and its role in the Internet architecture.** 
 4. **Explain the difference between IPv4 and IPv6. Why was there a need to move from IPv4 to IPv6?**
	 1. IPv4 is made up of only 4 bytes (32 bits), so that allows for the unique identification of only about $n^4$ devices (I saw about because 1 IP address is reserved for the router and 1 IP address is reserved for the entire network connected to a router, which is necessary for broadcast communications)
	 2. This is obviously not enough to uniquely identify all of the devices connected to the Internet, so a possible solution to this issue would be to extend the number of bytes an IP is made of from 4 to 16 (allowing around $n^{16}$ unique devices).
	 3. But this new implementation still isn’t supported in most networks so a more immediate solution was necessary, and that is the implementation of Public vs. Private IP Addresses.
 5. **Describe the role of routers in connecting a Local Area Network (LAN) to an Internet Service Provider (ISP). •** 
 6. **Write a simple JSON format to describe a personal profile including name, age, address, and hobbies. (covered in Week 5 Lab)**

**==Multiple choice questions==**
1. Which format represents an IPv6 address? 
	1. a) XX.XX.XX.XX 
	2. b) XXXX:XXXX:XXXX:XXXX:XXXX:XXXX:XXXX:XXXX 
	3. c) XXX.XXX.XXX 
	4. **<mark style="background: #BBFABBA6;">d) None of the above</mark>**

#### Tutorial sheet
![[Tutorial Sheet 5.pdf]]