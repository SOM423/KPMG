1. Bubble Sort :
================
- It compares the adjucent elements, if element present at lower index is > than the element present at higher index then will swap it.
- in 1st iteration will get the maximum value at end.
- in each iteration we will get max index at end.

App : find 1st/2nd highest value
DS : Array
TC : O(n^2)
SC :   O(1)

2. Selection Sort :
=====================
- In this we are comparing the ith index with i+1 elements and finding the minIndex at which minValue is present and we are replacing it with ith index.
	
App : find 1st/2nd lowest value OR Min swaps required to Sort the Array.
DS : Array
TC : O(n^2)
SC :  O(1)

3. Two way Merging :
====================
- works on principle of 2 sorted arrays.
- First calculate the length of both the arrays & create the new Array to store the elements.
- compare the 1st element from both the array whichever is smaller move to the new array and continue.

4. Merge Sort :
================
- Works on principle of 2 way merging

TC : O(n logn)
SC : O(n)
App: used in large dataSets such as external sorting algorithms.
DS : Array

5. Quick Sort(Lomuto's Partition) :
====================================
- In this algo we are considering the last element as Pivot element and try to sort the pivot in such way that before pivot lesser elements will be present (may or may not be sorted) and after the pivot higher element should be present (may or may not be sorted).

TC : O(n^2) --Avg O(log n)
SC : O(logn)
App : used in database to sort records.
DS : Array


6. Quick Sort(Hoare's Partition) :
===================================
- In this we consider 1st element as pivot element and use two indices that starts and ends of the array and move towards each other.
- elements are swappped to ensure all elements less than the pivot are on left side and all greater are on right side, continuing until the indices cross.

7. Heap Sort :
===============
Heap : Heap is a complete binary tree. internal DS is Array
Max Heap : It should be a heap.
- each parent should be > than child

TC : O(n log n)
SC : O(1)
App : employed in priority Queue
DS : Array (Heap)

In array 
=> 0 to n/2 -1   : all parents will be present
=> n/2 to n - 1  : all childs are present.

LC : 2 * i + 1   (left child)
RC : 2 * i + 2   (Right child)

8. Insertion sort :
====================
- It is like sorting playing cards in our hand. we pick up one card at a time and insert it to its correct position amongst the cards which we already sorted.
- will keep doing until cards(or elements) are in right order.

DS : Array
TC : O(n^2)
SC :   O(1)

9. BFS : Bredth first search :
============================
- Breadth-First Search (BFS) is a traversal algorithm used for tree and graph data structures.
- It starts at the root node and explores all neighbouring nodes at current depth level before moving on to nodes at next depth level.
- BFS uses Queue data structure to keep track of nodes to be explored, ensuring that nodes are processed in the order they are discovered.

App : shortest path finding in graph & level order traversal in tree
TC : O(V + E)  -- where V - vertices & E - edges
SC : O(V)
DS : Queue / AdjacencyList


10. DFS : Depth First Search :
==============================
- Depth-First Search (DFS) is a traversal algorithm for trees and graphs.
- It starts the root node and explores as far down a branch as possible before backtracking.
- DFS uses stack data structure, either explicitly with a stack or implicitly with recursion.

App : In trees DFS can be used in in-order , pre-order, post-order traversal.
TC : O(V + E)
SC : O(V)
DS : Stack(Recursion)/ AdjacencyList


11. Recursion :
================
- functiona call itself recursively called as recursion 
- internal DS is Stack


====================================== Searching Algorithms ==================================================
1. Linear search :
===================
- Its sequentially checks each element from the beginning to the end of the array until it finds the target element.
	
TC : O(n) - linear time
SC : O(1)
DS : Array


2. Binary Search :
====================
- It is an efficient algo for finding an item in sorted array.
- It repeatadly divides the search interval in half.
- If the target value is less than the middle element it searches in left half otherwise serches in right half.
	
TC : O(log n) : Logarithmic time
SC : O(1)
DS : Array


#Overflow issue in Binary Search :
=================================
- In general the mid value in binary search is calculated using (l+h)/2 but when we will deal with large element high would be Integer.MAX_VALUE ,so it is possible that it may go beyond the integer limit and will return negative index so its called overflow issue.

Ex: int l=1000;
    int h=Integer.MAX_VALUE;
	int m = (l+h)/2;
	
- to overcome we use the formula as
  int m = l + (h-l)/2;
  
  
================================================ Trees =======================================================
1. Trie :
=======
- If we want to represent data in hierarchical format then will go with tree data structure.
- A trie can have any no. of childrans.

TC : O(m)
SC : O(n*m)

2. Binary Tree :
=================
- A tree in which maximum of 2 childrans are present (it can have 0/1/2 max).



3. Binary Search Tree :
========================
- Its tree in which anything lesser than the root node will go towards left, anything greater than root node will go towards right.

TC : O(n)
SC : O(log n)

4. Full Binary Tree :
======================
- if the height of tree is h & no of nodes equal to 2^h-1 then it is called as FBT.

5. Complete Binary Tree :
==========================
- If the height of tree is h then till (h-1) level it should be FBT and at h level nodes should starts filling from extream left.

6. Tree Traversal Techniques :
============================
1. In Order Traversal :  left -> root -> right   
- Inorder traversal of a BST returns the nodes in ascending order.

2. Pre order Traversal : root -> left -> right
Suitable for creating copies of trees and prefix notation.

3. Post Order Traversal : left -> right -> root
Suitable for deleting trees and postfix notation.

Time Complexity: O(n)
Space Complexity: O(h) for recursion stack, where h is the height of the tree (O(log n) for balanced tree, O(n) for unbalanced tree).

Leaves of Binary Tree :
========================
- A node which does not have left & right child is called leaf node.

min in BST : extream left
max in BST : extream right

Stack - O(1)
Queue - O(1)
Dequeue - O(1)
Heap - log n (Insert/deletion) else O(1) access
Hashset - O(N) due to collision --avg O(1)
HashMap - O(N) due to collision --avg O(1)
HashTable  - O(N) due to collision --avg O(1)
