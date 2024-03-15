#### Problem 2
Requirements
- Starting lineup → receivers with highest performance

Game information
- g → game timestamp
- r → jersy number (player)
- p → points that jersy scored in a game


Data structure
- O(logn) as worse case operation time, n is the number of games (greater than number of receivers) → ==**Balanced Binary tree**==
- record (g, r, p) → record p points for jersey r in game g
- clear (g, r) → remove any record that jersey r played in game g
- ranked_receiver(k) → return jersey with kth highest performance

Design of the data structure
- Binary tree
