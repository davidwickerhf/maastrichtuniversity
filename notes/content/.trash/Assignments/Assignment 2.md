---
completed: true
submitted: true
due date: 
points: 
grade:
---
## Requirements
One popular extension of the simple rock-paper-scissors game is the rock-paper-scissors-Lizard-Spock, first mentioned in 2005 and also during an episode of

[The Big Bang Theory in 2008Links to an external site.](https://www.youtube.com/watch?v=x5Q6-wMx-K8)[![](https://canvas.maastrichtuniversity.nl/images/play_overlay.png)](https://www.youtube.com/watch?v=x5Q6-wMx-K8)

Here you are asked to develop a version where the user plays against the computer! The rules are simple (as mentioned in the video in the link above):

- Scissors cut Paper
- Paper covers Rock
- Rock crushes Lizard
- Lizard poisons Spock
- Spock smashes Scissors
- Scissors decapitate Lizard
- Lizard eats Paper
- Paper disproves Spock
- Spock vaporizes Rock
- Rock crushes Scissors

Your program should ask the user to enter a play, and generate a random play for the computer, compare the two and announce the winner (optionally providing the reason!).

Download the empty [RPSLO.java](https://canvas.maastrichtuniversity.nl/courses/15754/files/2799176?wrap=1 "RPSLO.java") [Download RPSLO.java](https://canvas.maastrichtuniversity.nl/courses/15754/files/2799176/download?download_frd=1)file and make sure your game works as follows:

For example, one run of your program might look like this:

```
Enter your play: R, P, S, L, O
> s
Computer play is L
You win!
```


Note that the user should be able to enter **either upper or lower case** r, p, s, l, o (for rock, paper, scissors, lizard, spock respectively). If the input is not one of the valid inputs, the code **must show the message below and finish:**

```
Invalid input (valid inputs: R, P, S, L, O)
```


For the computer’s play, you need to **generate a random number** and use a conditional to convert it to the actual play.

Then you have to (carefully and... painfully) design the conditionals that decide the winner.

Obviously, in the case that the computer play is the same as users play, we have a tie and you should print a message. We are counting on the fact the user will enter correct information and not something irrelevant (e.g. a number or any other letter).

For the computer’s choice print (replacing the _ with the capital letter of the computer’s choice): 

**Computer play is _**

When the player wins print: 

**You win!**

When the computer wins print: 

**Computer wins!**

In case of a tie print: 

**It is a tie!**

Make sure your program matches the output above exactly, even the positions of the spaces and line endings. Once you are happy with your result and it looks like the output shown above, save your code to a file named RPSLO.java and upload it to CodeGrade through Canvas.

To hand in assignments for programming courses at DACS we use an online system named CodeGrade. This system automatically compiles, tests and grades your code after you upload it. 

Every week you will be asked to solve a problem, solving these problems correctly (as determined by CodeGrade) may be a good indicator of your proficiency on the topic with respect to the expected Learning Goals until this point. Because of the way the autograding works, you must carefully follow the submission instructions for every assignment, always check that the written output, method names, file names, parameters, etc. match what was described in the assignment.

Before uploading code to CodeGrade, make sure the program works on your machine. So run it and test it thoroughly. You may upload your submission as often as you like, however, CodeGrade has a limit of 2 submissions every 10 minutes. If your submission fails the autotest, study the error message and try to find a solution by altering and testing your code, before re-submitting.

Although these assignments are not graded, their completion is highly recommended. To maximize the learning experience:

- Do not copy source code from a fellow student or alumni
- Do not copy source code from the internet

This tool needs to be loaded in a new browser window