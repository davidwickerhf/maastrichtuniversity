# Intro to Programming Languages


# Selection Sort in Python
```Python
numbers = [42, 23, 15, 1, 8, 16, 4]

print(numbers)

for i in range(0,len(numbers)):
    minimum = min(numbers) #find minimum
    min_index = numbers.index(minimum) #find index of minimum
    
    numbers[min_index] = numbers[i] #replace element at min_index with the ith element
    numbers[i] = minimum #replace the ith element with min element
    
    print(numbers)
```
with splicing:
```Python
numbers = [42, 23, 15, 1, 8, 16, 4]

print(numbers)

for i in range(0,len(numbers)):
    minimum = min(numbers[i:])
    min_index = numbers.index(minimum) # MISTAKE
    
    numbers[min_index] = numbers[i]
    numbers[i] = minimum
    
    print(numbers)
```

# Selection Sort in Haskell
The `:` operator in Haskell creates a list out of two elements;
The **base-clause** of a recursive function causes the recursion to stop, otherwise the recursion will be infinite