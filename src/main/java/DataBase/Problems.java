public class Problems {

  public static final String p1 = "```Given a list of numbers and a number k, return whether any two numbers from the list add up to k.\n\n" +
                                  "For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.```";

  public static final String p2 = "```A unival tree (which stands for 'universal value') is a tree where all nodes under it have the same value.\n\n" +
                                  "Given the root to a binary tree, count the number of unival subtrees.\n\n" +
                                  "For example, the following tree has 5 unival subtrees: \n```";

  public static final String p2_2 = "https://ci5.googleusercontent.com/proxy/areZQnJdxGc1Vb7ZM-Ri6KZr24EDCHq3GfSXE6w03L1BTx_ZEuKi4QPr4cKdRzf-FrmTMstPOnx6BfXape0HJApD3YXQLug1lj9H44NJ2TrkE2gsUvi9LYi15LzhC_KxTLPUou2kMO3Bkniq1YLPGWCogC1Hyg=s0-d-e1-ft#https://mcusercontent.com/4728a0b0c9cf89abf07c6e32a/images/f6cc4188-523e-483b-a653-1d982ab81ddc.png";

  public static final String p3 = "```The Sieve of Eratosthenes is an algorithm used to generate all prime numbers smaller than N. The method is to take increasingly larger prime numbers, and mark their multiples as composite.\n\n" +
                                  "For example, to find all primes less than 100, we would first mark [4, 6, 8, ...] (multiples of two), then [6, 9, 12, ...] (multiples of three), and so on. Once we have done this for all primes less than N, the unmarked numbers that remain will be prime.\n\n" + 
                                  "Implement this algorithm.```";

  public static final String p4 = "```There are N couples sitting in a row of length 2 * N. They are currently ordered randomly, but would like to rearrange themselves so that each couple's partners can sit side by side.\n\n" +
                                  "What is the minimum number of swaps necessary for this to happen?```";

  public static final String p5 = "```Given a string with repeated characters, rearrange the string so that no two adjacent characters are the same. If this is not possible, return None.\n\n" + 
  								                "For example, given 'aaabbc', you could return 'ababac'. Given 'aaab', return None.```";

  public static final String p6 = "```Given a collection of intervals, find the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.\n\n" +
                                  "Intervals can 'touch', such as [0, 1] and [1, 2], but they won't be considered overlapping.\n\n" +
                                  "For example, given the intervals (7, 9), (2, 4), (5, 8), return 1 as the last interval can be removed and the first two won't overlap.\n\n" +
                                  "The intervals are not necessarily sorted in any order.```";

  public static final String p7 = "```Suppose you are given two lists of n points, one list p1, p2, ..., pn on the line y = 0 and the other list q1, q2, ..., qn on the line y = 1. Imagine a set of n line segments connecting each point pi to qi. Write an algorithm to determine how many pairs of the line segments intersect.```";

  public static final String p8 = "```Write an algorithm that computes the reversal of a directed graph. For example, if a graph consists of A -> B -> C, it should become A <- B <- C.```";

  public static final String p9 = "```Given an array of elements, return the length of the longest subarray where all its elements are distinct.\n\n" +
                                  "For example, given the array [5, 1, 3, 5, 2, 3, 4, 1], return 5 as the longest subarray of distinct elements is [5, 2, 3, 4, 1].```";

  public static final String p10 = "```Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand. Find the minimum element in O(log N) time. You may assume the array does not contain duplicates.\n\n" +
                                   "For example, given [5, 7, 10, 3, 4], return 3.```";

  public static final String p11 = "```Given the head of a singly linked list, swap every two nodes and return its head.\n\n" +
                                   "For example, given 1 -> 2 -> 3 -> 4, return 2 -> 1 -> 4 -> 3```";

  public static final String p12 = "```Determine whether there exists a one-to-one character mapping from one string s1 to another s2.\n\n" +
                                   "For example, given s1 = abc and s2 = bcd, return true since we can map a to b, b to c, and c to d.\n" +
                                   "Given s1 = foo and s2 = bar, return false since the o cannot map to two characters. ```";

  public static final String p13 = "```Given a circular array, compute its maximum subarray sum in O(n) time. A subarray can be empty, and in this case the sum is 0.\n\n" +
                                   "For example, given [8, -1, 3, 4], return 15 as we choose the numbers 3, 4, and 8 where the 8 is obtained from wrapping around.\n" + 
                                   "Given [-4, 5, 1, 0], return 6 as we choose the numbers 5 and 1.```";

  public static final String p14 = "```Implement a stack API using only a heap. A stack implements the following methods:\n" +
                                   "•    push(item), which adds an element to the stack\n" +
                                   "•    pop(), which removes and returns the most recently added element (or throws an error if there is nothing on the stack)\n\n" + 
                                   "Recall that a heap has the following operations:\n" + 
                                   "•    push(item), which adds a new key to the heap\n" + 
                                   "•    pop(), which removes and returns the max value of the heap\n```";

  public static final String p15 = "```Given a list of words, return the shortest unique prefix of each word. For example, given the list:\n" + 
                                   "[dog, cat, apple, apricot, fish]\n\n" +
                                   "Return the list:\n" + 
                                   "[d, c, app, apr, f] ```";

  public static final String p16 = "```Given a word W and a string S, find all starting indices in S which are anagrams of W.\n" +
                                   "For example, given that W is 'ab', and S is 'abxaba', return 0, 3, and 4. ```";

  public static final String p17 = "```Given n numbers, find the greatest common denominator between them.\n" +
                                   "For example, given the numbers [42, 56, 14], return 14. ```";

  public static final String p18 = "```Given a list of elements, find the majority element, which appears more than half the time (> floor(len(lst) / 2.0)).\n\n" + 
                                   "You can assume that such element exists.\n" + 
                                   "For example, given [1, 2, 1, 1, 3, 4, 0], return 1. ```";

  public static final String p19 = "```Given a binary tree, return the level of the tree with minimum sum.```";

  public static final String p20 = "```Given a set of distinct positive integers, find the largest subset such that every pair of elements in the subset (i, j) satisfies either i % j = 0 or j % i = 0.\n\n" +
                                   "For example, given the set [3, 5, 10, 20, 21], you should return [5, 10, 20]. Given [1, 3, 6, 24], return [1, 3, 6, 24]. ```";

  public static final String p21 = "```Given an unsigned 8-bit integer, swap its even and odd bits. The 1st and 2nd bit should be swapped, the 3rd and 4th bit should be swapped, and so on.\n\n" +
                                   "For example, 10101010 should be 01010101. 11100010 should be 11010001.\n\n" +
                                   "Bonus: Can you do this in one line? ```";

  public static final String p22 = "```Find an efficient algorithm to find the smallest distance (measured in number of words) between any two given words in a string.\n\n" +
                                   "For example, given words 'hello', and 'world' and a text content of 'dog cat hello cat dog dog hello cat world', return 1 because there's only one word 'cat' in between the two words. ```";

  public static final String p23 = "```Given a string, determine whether any permutation of it is a palindrome.\n\n" +
                                   "For example, carrace should return true, since it can be rearranged to form racecar, which is a palindrome. daily should return false, since there's no rearrangement that can form a palindrome. ```";

  public static final String p24 = "```Given a set of closed intervals, find the smallest set of numbers that covers all the intervals. If there are multiple smallest sets, return any of them.\n\n" +
                                   "For example, given the intervals [0, 3], [2, 6], [3, 4], [6, 9], one set of numbers that covers all these intervals is {3, 6}. ```";

  public static final String p25 = "```You are given an array of length n + 1 whose elements belong to the set {1, 2, ..., n}. By the pigeonhole principle, there must be a duplicate. Find it in linear time and space. ```";

  public static final String p26 = "```You're given a string consisting solely of (, ), and *. * can represent either a (, ), or an empty string. Determine whether the parentheses are balanced.\n\n" +
                                   "For example, (()* and (*) are balanced. )*( is not balanced. ```";

  public static final String p27 = "```Given a 32-bit integer, return the number with its bits reversed.\n\n" + 
                                   "For example, given the binary number 1111 0000 1111 0000 1111 0000 1111 0000, return 0000 1111 0000 1111 0000 1111 0000 1111. ```";

  public static final String p28 = "```Given a real number n, find the square root of n. For example, given n = 9, return 3.```";

  public static final String p29 = "```Gray code is a binary code where each successive value differs in only one bit, as well as when wrapping around. Gray code is common in hardware so that we don't see temporary spurious values during transitions.\n\n" +
                                   "Given a number of bits n, generate a possible gray code for it.\n\n" + 
                                   "For example, for n = 2, one gray code would be [00, 01, 11, 10].```";

  public static final String p30 = "```The edit distance between two strings refers to the minimum number of character insertions, deletions, and substitutions required to change one string to the other. For example, the edit distance between “kitten” and “sitting” is three: substitute the “k” for “s”, substitute the “e” for “i”, and append a “g”.\n\n" + 
                                   "Given two strings, compute the edit distance between them. ```";

  public static final String p31 = "```Given the head to a singly linked list, where each node also has a “random” pointer that points to anywhere in the linked list, deep clone the list.```";

  public static final String p32 = "```Determine whether a tree is a valid binary search tree.\n\n" +
                                   "A binary search tree is a tree with two children, left and right, and satisfies the constraint that the key in the left child must be less than or equal to the root and the key in the right child must be greater than or equal to the root.```";

  public static final String p33 = "```Given the root of a binary search tree, and a target K, return two nodes in the tree whose sum equals K.\n\n" +
                                 "For example, given the following tree and K of 20\n" +
                                  "    10  \n" +
                                  "   /  \\ \n" +
                                  "  5   15 \n" +
                                 "      / \\  \n" +
                                 "    11   15 \n\n" +
                                  "Return the nodes 5 and 15.```";

  public static final String p34 = "```Given a linked list and a positive integer k, rotate the list to the right by k places.\n\n" +
                                   "For example, given the linked list 7 -> 7 -> 3 -> 5 and k = 2, it should become 3 -> 5 -> 7 -> 7.\n\n" +
                                   "Given the linked list 1 -> 2 -> 3 -> 4 -> 5 and k = 3, it should become 3 -> 4 -> 5 -> 1 -> 2. ```";

  public static final String p35 = "```Implement the singleton pattern with a twist. First, instead of storing one instance, store two instances. And in every even call of getInstance(), return the first instance and in every odd call of getInstance(), return the second instance.```";

  public static final String p36 = "```You are given a starting state start, a list of transition probabilities for a Markov chain, and a number of steps num_steps. Run the Markov chain starting from start for num_steps and compute the number of times we visited each state.\n\n" +
                                   "For example, given the starting state a, number of steps 5000, and the following transition probabilities:\n\n" +
                                   "[\n" +
                                   "('a', 'a', 0.9),\n" +
                                   "('a', 'b', 0.075),\n" +
                                   "('a', 'c', 0.025),\n" +
                                   "('b', 'a', 0.15),\n" +
                                   "('b', 'b', 0.8),\n" +
                                   "('b', 'c', 0.05),\n" +
                                   "('c', 'a', 0.25),\n" +
                                   "('c', 'b', 0.25),\n" +
                                   "('c', 'c', 0.5)\n" +
                                   "]\n\n" +
                                   "One instance of running this Markov chain might produce { 'a': 3012, 'b': 1656, 'c': 332 }.```";

  public static final String p37 = "```You have a large array with most of the elements as zero.\n\n" +
                                   "Use a more space-efficient data structure, SparseArray, that implements the same interface:\n" +
                                   "init(arr, size): initialize with the original large array and size.\n" +
                                   "set(i, val): updates index at i with val.\n" +
                                   "get(i): gets the value at index i.```";

  public static final String p38 = "```Given a number in the form of a list of digits, return all possible permutations.\n\n" +
                                   "For example, given [1,2,3], return [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]. ```";

  public static final String p39 = "```Given a binary tree, find a minimum path sum from root to a leaf.\n" +
                                  "For example, the minimum path in this tree is [10, 5, 1, -1], which has sum 15.\n\n" +  
                                  "     10     \n" +
                                  "    /  \\     \n" +
                                  "   5    5   \n" +
                                  "    \\    \\   \n" +
                                  "     2    1 \n" +
                                  "         /  \n" +
                                  "       -1```";

  public static final String p40 = "```Given an array of integers in which two elements appear exactly once and all other elements appear exactly twice, find the two elements that appear only once.\n\n" +
                                   "For example, given the array [2, 4, 6, 8, 10, 2, 6, 10], return 4 and 8. The order does not matter.\n\n" + 
                                   "Follow-up: Can you do this in linear time and constant space? ```";

  public static final String p41 = "```A graph is minimally-connected if it is connected and there is no edge that can be removed while still leaving the graph connected. For example, any binary tree is minimally-connected.\n\n" +
                                   "Given an undirected graph, check if the graph is minimally-connected. You can choose to represent the graph as either an adjacency matrix or adjacency list. ```";

  public static final String p42 = "```You are given an array of nonnegative integers. Let's say you start at the beginning of the array and are trying to advance to the end. You can advance at most, the number of steps that you're currently on. Determine whether you can get to the end of the array.\n\n" +
                                   "For example, given the array [1, 3, 1, 2, 0, 1], we can go from indices 0 -> 1 -> 3 -> 5, so return true.\n"+
                                   "Given the array [1, 2, 1, 0, 0], we can't reach the end, so return false.```";

  public static final String p43 = "```You have n fair coins and you flip them all at the same time. Any that come up tails you set aside. The ones that come up heads you flip again. How many rounds do you expect to play before only one coin remains?\n\n" +
                                   "Write a function that, given n, returns the number of rounds you'd expect to play until one coin remains.```";

  public static final String p44 = "```Given a number represented by a list of digits, find the next greater permutation of a number, in terms of lexicographic ordering. If there is not greater permutation possible, return the permutation with the lowest value/ordering.\n\n" +
                                   "For example, the list [1,2,3] should return [1,3,2]. The list [1,3,2] should return [2,1,3]. The list [3,2,1] should return [1,2,3].\n\n" +
                                   "Can you perform the operation without allocating extra memory (disregarding the input memory)?```";

  public static final String p45 = "```Print the nodes in a binary tree level-wise. For example, the following should print 1, 2, 3, 4, 5.```";
  public static final String p45_2 = "https://ci6.googleusercontent.com/proxy/pAjnIq2KjddgHkG5XrQuNf6kiOBb6V_u4YgnJmlW98NpgKxA9luea0j_f1TTZEs_DXpmmR22TykuuepjLvwZuSSAYpDwxUMjPA95Z0MEpcbO3STGrNdABPRAi7cuRa6ND5mM_xLQC35GYudm3poaBrZAYTxCGg=s0-d-e1-ft#https://mcusercontent.com/4728a0b0c9cf89abf07c6e32a/images/722f6c87-d046-4034-97ce-9832b156672a.png";

  public static final String p46 = "```Given an array of numbers and an index i, return the index of the nearest larger number of the number at index i, where distance is measured in array indices.\n\n" +
                                   "For example, given [4, 1, 3, 5, 6] and index 0, you should return 3.\n\n" +
                                   "If two distances to larger numbers are the equal, then return any one of them. If the array at i doesn't have a nearest larger integer, then return null.\n\n" +
                                   "Follow-up: If you can preprocess the array, can you do this in constant time?```";

  public static final String p47 = "```You are given n numbers as well as n probabilities that sum up to 1. Write a function to generate one of the numbers with its corresponding probability.\n\n" +
                                   "For example, given the numbers [1, 2, 3, 4] and probabilities [0.1, 0.5, 0.2, 0.2], your function should return 1 10% of the time, 2 50% of the time, and 3 and 4 20% of the time.\n\n" +
                                   "You can generate random numbers between 0 and 1 uniformly.```";

  public static final String p48 = "```A rule looks like this:\n\n" +
  								   "A NE B\n\n" + 
  								   "This means this means point A is located northeast of point B.\n\n" +
  								   "A SW C\n\n" +
  								   "means that point A is southwest of C.\n\n" +
  								   "Given a list of rules, check if the sum of the rules validate. For example:\n\n" +
  								   "A N B\n" +
  								   "B NE C\n" +
  								   "C N A\n" +
  								   "does not validate, since A cannot be both north and south of C.\n\n" +
  								   "A NW B\n" +
  								   "A N B\n" +
  								   "is considered valid.```";

  public static final String p49 = "```Given a multiset of integers, return whether it can be partitioned into two subsets whose sums are the same.\n\n" +
  								   "For example, given the multiset {15, 5, 20, 10, 35, 15, 10}, it would return true, since we can split it up into {15, 5, 10, 15, 10} and {20, 35}, which both add up to 55.\n\n" +
  								   "Given the multiset {15, 5, 20, 10, 35}, it would return false, since we can't split it up into two subsets that add up to the same sum.```";

  public static final String p50 = "```Given a 2D matrix of characters and a target word, write a function that returns whether the word can be found in the matrix by going left-to-right, or up-to-down.\n" +
  								   "For example, given the following matrix:\n\n" +

								   "[['F', 'A', 'C', 'I'],\n" +
								   "['O', 'B', 'Q', 'P'],\n" +
								   "['A', 'N', 'O', 'B'],\n" +
								   "['M', 'A', 'S', 'S']]\n\n" +

								   " and the target word 'FOAM', you should return true, since it's the leftmost column.\n" + 
								   " Similarly, given the target word 'MASS', you should return true, since it's the last row.```";

  public static final String p51 = "```Given a function f, and N return a debounced f of N milliseconds.\n\n"+
       "That is, as long as the debounced f continues to be invoked, f itself will not be called for N milliseconds.```";

  public static final String p52 = "```A number is considered perfect if its digits sum up to exactly 10.\n\n"+
                                    "Given a positive integer n, return the n-th perfect number.\n\n"+
                                    "For example, given 1, you should return 19. Given 2, you should return 28.```";

  public static final String p53 = "```Given a N by M matrix of numbers, print out the matrix in a clockwise spiral.\n\n"+
                                  "For example, given the following matrix:\n\n"+
                                  "[[1,  2,  3,  4,  5],\n"+
                                  "[6,  7,  8,  9,  10],\n"+
                                  "[11, 12, 13, 14, 15],\n"+
                                  "[16, 17, 18, 19, 20]]\n"+
                                  "You should print out the following:\n\n"+
                                  "1\n"+
                                  "2\n"+
                                  "3\n"+
                                  "4\n"+
                                  "5\n"+
                                  "10\n"+
                                  "15\n"+
                                  "20\n"+
                                  "19\n"+
                                  "18\n"+
                                  "17\n"+
                                  "16\n"+
                                  "11\n"+
                                  "6\n"+
                                  "7\n"+
                                  "8\n"+
                                  "9\n"+
                                  "14\n"+
                                  "13\n"+
                                  "12```";

  public static final String p54 = "```This problem was asked by LinkedIn.\n\n"+
                                  "Given a linked list of numbers and a pivot k, partition the linked list so that all nodes less than k come before nodes greater than or equal to k.\n\n"+
                                  "For example, given the linked list 5 -> 1 -> 8 -> 0 -> 3 and k = 3, the solution could be 1 -> 0 -> 5 -> 8 -> 3.```";

  public static final String p55 = "```This problem was asked by Google.\n\n"+
                                    "Given a sorted list of integers, square the elements and give the output in sorted order.\n\n"+
                                    "For example, given [-9, -2, 0, 2, 3], return [0, 4, 4, 9, 81].```";

  public static final String p56 ="```Given a list of possibly overlapping intervals, return a new list of intervals where all overlapping intervals have been merged.\n\n"+
                                  "The input list is not necessarily ordered in any way.\n\n"+
                                  "For example, given [(1, 3), (5, 8), (4, 10), (20, 25)], you should return [(1, 3), (4, 10), (20, 25)].```";

   public static final String p57 ="```Given a array of numbers representing the stock prices of a company in chronological order, write a function that calculates the maximum profit you could have made from buying and selling that stock once. You must buy before you can sell it.\n\n"+
                                  "For example, given [9, 11, 8, 5, 7, 10], you should return 5, since you could buy the stock at 5 dollars and sell it at 10 dollars.```";

  public static final String p58 = "```Given k sorted singly linked lists, write a function to merge all the lists into one sorted singly linked list.```";

  public static final String p59 = "```Given a string of digits, generate all possible valid IP address combinations.\n\n"+
                                    "IP addresses must follow the format A.B.C.D, where A, B, C, and D are numbers between 0 and 255. Zero-prefixed numbers, such as 01 and 065, are not allowed, except for 0 itself.\n\n"+
                                    "For example, given '2542540123', you should return ['254.25.40.123', '254.254.0.123'].```";

  public static final String p60 = "```This problem was asked by Facebook.\n" + 
                                   "Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).\n" +
                                   "For example, given the string '([])[]({})', you should return true.\n" +
                                   "Given the string '([)]' or '((()', you should return false.```";

  public static final String p61 = "```This problem was asked by Microsoft.\n\n" +
                                   "Given an array of numbers, find the length of the longest increasing subsequence in the array. The subsequence does not necessarily have to be contiguous.\n\n" +
                                   "For example, given the array [0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15], the longest increasing subsequence has length 6: it is 0, 2, 6, 9, 11, 15.```";

  public static final String p62 = "```This problem was asked by Amazon.\n\n" +
                                   "Run-length encoding is a fast and simple method of encoding strings. The basic idea is to represent repeated successive characters as a single count and character. For example, the string 'AAAABBBCCDAA' would be encoded as '4A3B2C1D2A'.\n\n" + 
                                   "Implement run-length encoding and decoding. You can assume the string to be encoded have no digits and consists solely of alphabetic characters. You can assume the string to be decoded is valid.```";

  public static final String p63 = "```Given three 32-bit integers x, y, and b, return x if b is 1 and y if b is 0, using only mathematical or bit operations. You can assume b can only be 1 or 0.```";

  public static final String p64 = "```This problem was asked by Google.\n\n"+
                                   "Given two singly linked lists that intersect at some point, find the intersecting node. The lists are non-cyclical.\n\n" +
                                   "For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10, return the node with value 8.\n\n" +
                                   "In this example, assume nodes with the same value are the exact same node objects.\n\n" +
                                   "Do this in O(M + N) time (where M and N are the lengths of the lists) and constant space.```";

  public static final String p65 = "```This problem was asked by Airbnb.\n\n" +
                                   "Given a list of words, find all pairs of unique indices such that the concatenation of the two words is a palindrome.\n\n" +
                                   "For example, given the list ['code', 'edoc', 'da', 'd'], return [(0, 1), (1, 0), (2, 3)].```";

  public static final String p66 = "```Determine whether a doubly linked list is a palindrome. What if it’s singly linked?\n\n"+
                                  "For example, 1 -> 4 -> 3 -> 4 -> 1 returns True while 1 -> 4 returns False.```";

  public static final String p67 = "```Implement division of two positive integers without using the division, multiplication, or modulus operators. Return the quotient as an integer, ignoring the remainder.```";

  public static final String p68 = "```Implement integer exponentiation. That is, implement the pow(x, y) function, where x and y are integers and returns x^y.\n\n"+
                                  "Do this faster than the naive method of repeated multiplication.\n\n"+
                                  "For example, pow(2, 10) should return 1024.```";

  public static final String p69 = "```Given an array of time intervals (start, end) for classroom lectures (possibly overlapping), find the minimum number of rooms required.\n\n"+
                                  "For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.```";

  public static final String p70 = "```You run an e-commerce website and want to record the last N order ids in a log. Implement a data structure to accomplish this, with the following API:\n\n"+
                                  "record(order_id): adds the order_id to the log\n"+
                                  "get_last(i): gets the ith last element from the log. i is guaranteed to be smaller than or equal to N.\n\n"+
                                    "You should be as efficient with time and space as possible.```";

  public static final String p71 = "```Implement a bit array.\n\n"+
                                    "A bit array is a space efficient array that holds a value of 1 or 0 at each index.\n\n"+
                                    "init(size): initialize the array with size\n"+
                                    "set(i, val): updates index at i with val where val is either 1 or 0.\n"+
                                    "get(i): gets the value at index i.```";

  public static final String p72 = "```Given two strings A and B, return whether or not A can be shifted some number of times to get B.\n\n"+
                                  "For example, if A is abcde and B is cdeab, return true. If A is abc and B is acb, return false.```";

  public static final String p73 = "```Given an unsorted array of integers, find the length of the longest consecutive elements sequence.\n\n"+
                                    "For example, given [100, 4, 200, 1, 3, 2], the longest consecutive element sequence is [1, 2, 3, 4]. Return its length: 4.\n\n"+
                                  "Your algorithm should run in O(n) complexity.```";

  public static final String p74 = "```Find the minimum number of coins required to make n cents.\n\n"+
                                  "You can use standard American denominations, that is, 1¢, 5¢, 10¢, and 25¢.\n\n"+
                                  "For example, given n = 16, return 3 since we can make it with a 10¢, a 5¢, and a 1¢.\n\n"+
                                  "For example, given the array [0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15], the longest increasing subsequence has length 6: it is 0, 2, 6, 9, 11, 15.```";

  public static final String p75 = "```Given a binary tree of integers, find the maximum path sum between two nodes. The path must go through at least one node, and does not need to go through the root.```";

  public static final String p76 = "```Implement the function fib(n), which returns the nth number in the Fibonacci sequence, using only O(1) space.```";

  public static final String p77 = "```Given an array of integers, write a function to determine whether the array could become non-decreasing by modifying at most 1 element.\n\n"+
                                   "For example, given the array [10, 5, 7], you should return true, since we can modify the 10 into a 1 to make the array non-decreasing.\n\n"+
                                   "Given the array [10, 5, 1], you should return false, since we can't modify any one element to get a non-decreasing array.```";

  public static final String p78 = "```Given an integer n and a list of integers l, write a function that randomly generates a number from 0 to n-1 that isn't in l (uniform).```";

  public static final String p79 = "```An sorted array of integers was rotated an unknown number of times.\n\n"+
                                   "Given such an array, find the index of the element in the array in faster than linear time. If the element doesn't exist in the array, return null.\n\n"+
                                   "For example, given the array [13, 18, 25, 2, 8, 10] and the element 8, return 4 (the index of 8 in the array).\n\n"+
                                   "You can assume all the integers in the array are unique.```";

  public static final String p80 = "```Assume you have access to a function toss_biased() which returns 0 or 1 with a probability that's not 50-50 (but also not 0-100 or 100-0). You do not know the bias of the coin.\n\n"+
                                  "Write a function to simulate an unbiased coin toss.```";

  public static final String p81 = "```Given an integer list where each number represents the number of hops you can make, determine whether you can reach to the last index starting at index 0.\n\n"+
                                   "For example, [2, 0, 1, 0] returns True while [1, 1, 0, 1] returns False.```";

  public static final String p82 = "```Write a program that checks whether an integer is a palindrome. For example, 121 is a palindrome, as well as 888. 678 is not a palindrome. Do not convert the integer into a string.```";

  public static final String p83 = "```unavailable```";

  public static final String p84 = "```Let X be a set of n intervals on the real line. We say that a set of points P 'stabs' X if every interval in X contains at least one point in P. Compute the smallest set of points that stabs X.\n\n"+
                                   "For example, given the intervals [(1, 4), (4, 5), (7, 9), (9, 12)], you should return [4, 9].```";

  public static final String p85 = "```Given a positive integer n, find the smallest number of squared integers which sum to n.\n\n"+
                                   "For example, given n = 13, return 2 since 13 = 32 + 22 = 9 + 4.\n\n"+
                                   "Given n = 27, return 3 since 27 = 32 + 32 + 32 = 9 + 9 + 9.```";

  public static final String p86 = "```Given an undirected graph represented as an adjacency matrix and an integer k, write a function to determine whether each vertex in the graph can be colored such that no two adjacent vertices share the same color using at most k colors.```";

  public static final String p87 = "```A permutation can be specified by an array P, where P[i] represents the location of the element at i in the permutation. For example, [2, 1, 0] represents the permutation where elements at the index 0 and 2 are swapped.\n\n"+
                                   "Given an array and a permutation, apply the permutation to the array. For example, given the array ['a', 'b', 'c'] and the permutation [2, 1, 0], return ['c', 'b', 'a'].```";

  public static final String p88 = "```Given an array and a number k that's smaller than the length of the array, rotate the array to the right k elements in-place.```";

  public static final String p89 = "```Spreadsheets often use this alphabetical encoding for its columns: 'A', 'B', 'C', ..., 'AA', 'AB', ..., 'ZZ', 'AAA', 'AAB', ....\n\n"+
                                   "Given a column number, return its alphabetical column id. For example, given 1, return 'A'. Given 27, return 'AA'.```";

  public static final String p90 = "```The ancient Egyptians used to express fractions as a sum of several terms where each numerator is one. For example, 4 / 13 can be represented as 1 / 4 + 1 / 18 + 1 / 468.\n\n"+
                                   "Create an algorithm to turn an ordinary fraction a / b, where a < b, into an Egyptian fraction.```";

  public static final String p91 = "```Given a linked list, sort it in O(n log n) time and constant space.\n\n"+
                                   "For example, the linked list 4 -> 1 -> -3 -> 99 should become -3 -> 1 -> 4 -> 99.```";

  public static final String p92 = "```unavailable```";

  public static final String p93 = "```unavailable```";

  public static final String p94 = "```unavailable```";

  public static final String p95 = "```unavailable```";

  public static final String p96 = "```unavailable```";

  public static final String p97 = "```unavailable```";

  public static final String p98 = "```unavailable```";

  public static final String p99 = "```unavailable```";

  public static final String p100 = "```unavailable```";
}