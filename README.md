# Company-Q
Practice Questions <br>
Questions asked by Company during Placements<br>
Epam1: Coin Flipping
>Count how many heads are present at the end of the 'N' rounds of flipping a coin.<br>First round: every coin turns to head<br> Second round: every 2nd coin turns from head to tail or vice-versa<br> Third round: every 3rd coin turns from head to tail or vice-versa and so on...<br> Nth round: every nth coin turns from head to tail or vice-versa.<br> At the end count number of heads present.<br>
Input: Number of rounds: 3<br>
Output: Total number of heads: 1<br>

Eygds1: Count number of Anagrams<br>
>Check whether the elements in the array is anagram or not. If yes, then count how many anagrams are present in the array.<br>
Input: Array: {'abc','bca','cdf'}<br>
Output: 2<br>

Eygds2: Traingle Equality Triplet<br>
>Count the number of triplets present and those triplet can only become valid if it satisfies the Triangle Equality. Triangle Equality means the sum of the two elements is greater than the third element. Note: Triplet must contain numbers in ascending order.<br>
Input: Array: {3, 3, 4, 5}<br>
Output: 1<br>

GyanSYS:<br>
>Find the unique way to make the combination of colors/paints given.<br>
Input:<br>
input1: 5 (number of colors i.e., {1,2,3,4,5} )<br>
input2: 2 (number of pairing can be done)<br>
Output:<br>
15 i.e.,<br>
(1,2),(1,3),(1,4),(1,5),(2,3),(2,4),(2,5),(3,4),(3,5),(4,5) = 10<br>
(1),(2),(3),(4),(5) = 5<br>  so, 10+5=15<br>

PS1:<br>
>Ritik wants a magic board, which displays a character for a corresponding number for his science project.<br> 
Help him to develop such an application. Assume the number of inputs should be always 4.<br>
Input: 65, 66, 67, 68<br>
Output: 65-A, 66-B, 67-C, 68-D<br>

PS2:<br>
>Given an integer array of size N. The task is to find the count of elements whose value is greater than all of its prior<br>
elements. Note: 1st element of the array should be considered in the count of the result.<br>
Input: <br>
Array: {7,4,8,2,9}<br>
Output: 3 (as 8 and 9 are greater than previous element as well as 7 as we need to include 1st element)

PS3:<br>
At a fun fair, a street vendor is selling different colors of balloons. He sells N number of different colors of balloons.<br>
The task is to find the odd color of the balloon which is present odd number of times in the bunch of balloons.<br>
Note: If there is more than one color which is odd in number, then the first color in the array which is present odd number <br>
of times is displayed. The colors of the balloons can all be either upper case or lower case in the array. If all the inputs<br>
are even in number, display the message "All are even".<br>
Input: N: 7<br>
arr[]={r, g, b, b, g, y, y}<br>
Output: r (as red is the only color which is present odd number of times)

UST_PQ: Nearest Smaller Tower<br>
>Given an array representing the heights of towers, the task is to find, for each tower, the index of the nearest tower that is shorter than it. The search for a shorter tower can be performed by looking to the left and right sides of each tower.<br>
Input : Array : {4, 8, 3, 5, 3} <br>
Output : Indexes: {2, 2, -1, 2, -1}<br>

UST_PQ2: Loki's Mind Stone<br>
>Loki, the God of mischief can brainwash any living person by touching him/her with his Mind stone, and has decided to break the avengers (a warrior group) to face into each other, so that they can turn against each other and make Loki’s evil plans easier. Now all the avengers have some amount of strength that is denoted in integers. Loki wants to brainwash the least amount of people possible, because he is lazy. But he wants his team of avengers to win the battle. What is the number of avengers Loki will get brainwashed?<br>
Input:<br>
Number of avengers members: 6<br>
Amount of strength: {9, 3, 1, 2, 4, 2} <br>
Output:<br>
2<br>

UST_PQ3: Airport Authority<br>
>In an airport, the Airport authority decides to charge a minimum amount to the passengers who are carrying luggage with them. They set a threshold weight value, say, T, if the luggage exceeds the weight threshold you should pay double the base amount. If it is less than or equal to threshold then you have to pay $1. <br>
Input: <br>
Number of luggage: 4<br>
Weight of each luggage: {1, 2, 3, 4}<br>
Output: 5<br>

UST_PQ4: Minimizing String<br>
>Given a string, obtain the alphabetically smallest string possible by swapping either adjacent ‘a’ and ‘b’ characters or adjacent ‘b’ and ‘c’ characters, any number of times.<br>
Input: s="abaacbac"<br>
Output: "aaabbcac"<br>

UST_Q: Find the Sub-string<br>
>Given two strings: String A contains a number and String B contains a number which will get matched with the String A and return a unmatched string from String A which is a contiguous number.<br>
Input: String A: 23873437289<br>
       String B: 22378897<br>
Output: 343<br>

UST_Q2: Find Median of sub-array<br>
>Given an array of numbers and a nested list. According to the nested list, each inner list will define the sub-array from the given array and find the median of the sub-array. At the end, print the sum of all median obtained by the sub-array which are generated by inner list of nested list.<br>
Input: Array: {1, 2, 2}<br>
       Nested List: [ [1,2], [1,3] ]<br>
Output: Total median: 3<br>
