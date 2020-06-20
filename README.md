# NOMATEN interview problems

The project contains the classes with solutions to three interview problems (Brackets, SemiEquilibrium, Tree) jointly with
the corresponding unit tests. Below you will find summaries of the approaches (unless the code is self-explanatory).


## Brackets
The program ignores every character except for opening and closing brackets. We iterate through the string and keep track
of the current number of open brackets. When the opening (closing) bracket comes up, the counter is increased (decreased).
If at any point the counter value falls below 0, it means that we are closing a non-existing bracket, therefore the
sequence is incorrect. If, after processing the whole string, the number of open brackets is not equal to 0, it means
that the sequence is unbalanced therefore incorrect. Otherwise the sequence is correct.

## SemiEquilibrium
(see comments in the code)

## Tree
I have provided two different solutions as either has its strengths and weaknesses.
In the file TreeProblemRecursive you will find a recursive approach to the problem. Starting from the root,
the program traverses the whole tree and for each call the actual length of currently processed straight path is
passed (increased by one) and the max value of the length is updated. As a result each node is associated with a pair
of numbers: accumLeft and accumRight which denote the lengths of paths ending at a given node, directed to the left or
to the right correspondingly. Note that one of the values in such a pair is always 0 (because each node has only one
parent and is its left or right child). For the root node both accumLeft and accumRight are 0).
Advantages: cleaner and easy to read code, declarative in nature
Disadvantages: possible stack overflow for large data.

In the file TreeProblemIterative you will find an iterative solution. Starting from the root the program traces all nodes
from the level below: for each node at a given level we also keep track of the longest path up to this node
directed to the left and the longest path directed to the right (note that either of the two has to be 0, for the root node
they are both 0). In a given iteration we process all nodes at a given level (in particular we find max) and then
produce a set of data for a subsequent level. The process continues until there are nodes on the subsequent level.
Advantages: more robust, works for larger datasets
Disadvantages: the code is less elegant and more cluttered with details.