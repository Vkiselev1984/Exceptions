# Exceptions
Exceptions in programming and their handling

## Task1

Implement a method that takes an integer array as an argument.

If the length of the array is less than some specified minimum, the method returns -1 as an error code, otherwise - the length of the array.

### Solution

A simple Java program [CheckArrayLength](/CheckArrayLength.java) that asks the user for the length of an array, then fills the array with integers, after which it checks the length of the array using the checkArrayLength method.

In the main method, the program asks the user to enter the length of the array.
Then an array of integers of a given length is created, and the user is prompted to enter each element of the array.
An instance of the CheckArrayLength class is created and the checkArrayLength method is called to check the length of the array.
If the length of the array is less than the specified minimum size (in this case 5), the program displays an error message.
Otherwise, the program outputs a message with the length of the array.

## Task2

Implement a method that takes an integer array as an argument.

If the length of the array is less than some specified minimum, the method returns -1 as an error code, otherwise - the length of the array.

### Solution

Method [DivisionExample](/DivisionExample.java) divides the number 10 by 0. When trying to divide by 0, an ArithmeticException occurs, which is processed in the catch block, displaying the message "Error: division by zero!".

## Task3

Implement a method that takes an integer two-dimensional array as an argument.

It is necessary to calculate and return the sum of the elements of this array.

At the same time, we impose 2 restrictions on the method: the method can only work with square arrays (number of rows = number of columns), and each cell can contain only the value 0 or 1.

If one of the conditions is violated, the method should throw a RuntimeException with an error message.

### Solution

The [ArraySumCalculator](/ArraySumCalculator.java) method accepts a square two-dimensional array, where each element can only be 0 or 1.

The method calculates the sum of all the elements of the array and returns this sum.

If the array is not square or contains a value other than 0 or 1, the method throws a RuntimeException with an appropriate error message.


## Task4


Implement the subArrays method, which takes two integer arrays a and b as arguments, and returns a new array c, each element of which is equal to the difference between the elements of two incoming arrays in the same cell.

If the array lengths are not equal, return a null array of length 1.

Write your code in the subArrays method of the Answer class. The subArrays method accepts two parameters as input:

int[] a is the first array
int[] b is the second array

Example

a = new int[]{4, 5, 6};
b = new int[]{1, 2, 3};

Output: [3, 3, 3]

a = new int[]{4, 5, 6};
b = new int[]{1, 2, 3, 5};

Output: [0]


### Solution

[SubArrays](/SubArrays.java) takes two integer arrays a and b, and returns a new array c, each element of which is equal to the difference of the elements of the two input arrays in the same cell. If the lengths of arrays a and b are not equal, then the method will return an array of length 1 with a zero element.

The main method creates an object of the SubArrays class, sets the input arrays a and b, or reads them from command line arguments, calls the subArrays method to obtain the result, and prints it to the screen.


## Task5

Implement a divArrays method that takes two integer arrays a and b as arguments, and returns a new array c, each element of which is equal to the quotient of the elements of the two input arrays in the same cell.

If the lengths of the arrays are not equal, return a null array of length 1.

Important: When executing a method, the only exception that the user can see is RuntimeException, i.e. yours.

Write your code in the divArrays method of the Answer class. The divArrays method takes two parameters as input:

int[] a - first array
int[] b - second array
Example


a = new int[]{12, 8, 16};
b = new int[]{4, 2, 4};

Output: [3, 4, 4]

a = new int[]{12, 8, 16, 25};
b = new int[]{4, 2, 4};

Output: [0]

### Solution

[DivArrays](/DivArrays.java), performs element-wise division of two arrays of integers.

The divArrays method accepts two arrays of integers a and b.

If the lengths of arrays a and b do not match, the method returns an array of one element equal to 0.
A new array c is created with the same length as the input arrays to store the results of the division.
Then arrays a are divided element-wise by b, and the results are stored in array c. If the divisor of b[i] is 0, a RuntimeException is thrown with the message "Divide by zero".

The method returns an array c with the division results.

The main method creates two arrays a and b, which are either initialized with default values ​​or values ​​passed through command line arguments. An instance of the DivArrays class is then created, the divArrays method is called to perform the division of arrays a and b, and the result is converted to a string and printed to the screen.