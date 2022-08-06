## Day10

**Agenda**
- Graph DS
- Applications of Graph
- Approaches to implement Graph
- Shortest Path Algorithm (Djikstra,Krushkal,prims)
- Suggestions on mutual friend
- DFS and BFS
- AVL Trees, Redblack Trees, Self balancing Trees, Binary Search trees
- Merkel Tree
---

In case if you want to delete data from the Binary search tree delete from the leaf to root always go for postorder.

[Cheat Sheet](https://www.bigocheatsheet.com/) for the Big-O to decide on the data structure.

AVL , Self balancing trees....
AVL-> named after inventors Adelson-Velsky and Landis

Why AVL Trees?
Most of the BST operations (e.g., search, max, min, insert, delete.. etc) take O(h) time where h is 
the height of the BST. The cost of these operations may become O(n) for a skewed Binary tree.
If we make sure that height of the tree remains O(Logn) after every insertion and deletion, 
then we can guarantee an upper bound of O(Logn) for all these operations. 
The height of an AVL tree is always O(Logn) where n is the number of nodes in the tree (See this video lecture for proof).

[Link for AVL Trees Notes](https://www.geeksforgeeks.org/avl-tree-set-1-insertion/) <br>
[Visualization of AVL](https://www.cs.usfca.edu/~galles/visualization/AVLtree.html)

# Quiz Questions

1.Which of the following can not be traversed in a straight line to touch all elements?
- array
- circular linked list
- Queue
- _**Tree**_

2.The possible no. of binary trees that can be created with 3 nodes giving the sequence N,M,L when traversed in post-order
- 1
- 3
- _**5**_
- 8

3.Which of the following graph traversals closely imitates level order traversal of a binary tree?
- Binary search
- _**Breadth first search**_
- Depth & Breadth first search
- Depth first search

4. Which of the following is True
- A binary tree can not be complete and full
- A binary tree is either complete or full
- _**All the options seem to be true**_
- Every full binary tree is also complete

5.The maximum number of the binary trees that can be formed with three unlabelled nodes is:
- 1
- 3
- 4
- _**5**_

---

```
Formula for maximum number of binary trees from n number of node : (2^n)-n
If we have 3 nodes the no. of trees we can get from them are 2^3=8 => 8-3 = 5. 
```