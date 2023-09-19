# Selection Sort
- Find the minimum value of the array
- Move the minimum value to the 1st index of the array
- Move the item that was in the 1st index of the array to the former index of the minimum value
- Repeat for all items

# Testing Selection Sort
## Implementation A
This implementation does not work for all inputs
[Code Implementation](https://replit.com/@ihanou/TestingSelectionSortImplementationA#main.py)

```Python
import sys

def sortA(l):
  for i in range(len(l)):
    mini = sys.maxsize
    index = i
    for j in range(len(l)):
      if (l[j] < mini):
        index = j
        mini = l[j]
    
    temp = l[i]
    l[i] = l[index]
    l[index] = temp
  return l

print(sortA([])) # Expand the list here with numbers separated by commas.
```
## Implementation B
This implementation does not work for all inputs
[Code Implementation](https://replit.com/@ihanou/TestingSelectionSortImplementationB#main.py)
```Python
import sys
    
def sortB(l):
  for i in range(len(l)):
    mini = sys.maxsize
    for j in range(i, len(l)):
      if (l[j] < mini):
        mini = l[j]

    index = l.index(mini)
    temp = l[i]
    l[i] = l[index]
    l[index] = temp
  return l
    

print(sortB([])) # Add items to the list here, separated by commas.
```
## Implementation C
This implementation works for all inputs
```Python
import sys

def sortC(l):
  for i in range(len(l)):
    mini = sys.maxsize
    index = i
    for j in range(i, len(l)):
      if (l[j] < mini):
        index = j
        mini = l[j]
    
    temp = l[i]
    l[i] = l[index]
    l[index] = temp
  return l
```

## Analyzing the implementations

# Testing Unknown Code
## Summation
## Lines
## Statistics
