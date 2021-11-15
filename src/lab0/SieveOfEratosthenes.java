package lab0;

import java.util.Scanner;

/**
* <b>Title:</b> Lab 0:<br>
* <b>Filename:</b> SieveOfEratosthenes.java<br>
* <b>Date Written:</b> January 23, 2017<br>
* <b>Due Date:</b> January 28, 2017<br>
* <p>
* <b>Description:</b><br>
* Displays prime numbers using The Sieve of Eratosthenes.
* </p>
* <p>
* The user is permitted to enter a value for n, and then all prime numbers
* in the range 2 to n are displayed.
* </p>
* <p><b>Algorithm:</b></p>
* <p>
* We start with a table of numbers (e.g., 2, 3, 4, 5, . . ., n) and progressively
* cross off numbers in the table until the only numbers left are primes. </p>
* <p>Specifically, we begin with the first number, p, in the table, and<br>
* 1. Declare p to be prime, then display it<br>
* 2. Cross off all the multiples of that number in the table, starting from p^2<br>
* 3. Find the next number in the table after p that is not yet crossed off and
* set p to that number; and then repeat steps 1 to 3.
*</p>
*@author Anibal Ruiz and Nicholas Mayorga
*/
public class SieveOfEratosthenes {
	
public static void main(String[] args) {
	
// declare and initialize variables
	int p = 2; //prime number
	int n; //ask the user
	boolean[] primes; //array of prime numbers
	
	
// permit the user to input a value for n
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	n = scan.nextInt(); //get the user input
	primes = new boolean[n + 1]; //make an array boolean
	
// create a loop for p = [2, n]
	
	for(int i = 0; i < n; i++) //make every number in the array a prime
	{
		primes[i] = true;
	}
	
	//make every divisible number false in order to cross it out
	
	for(int i = p; i*i <= n; i++) 
	{
		if(primes[i] == true)
		{
			for(int j = i*i; j <=n; j = j+i) 
			{
				primes[j] = false; //if i is a divisible number, then make it false to take it out of the array
			}
		}
	}
	
	
	System.out.println("\nPrime numbers in the range 2 to " + n);
	
	//print out the prime numbers while the number is less or equal to he user input
	int i = 2;
	while(i <= n)
	{
		if(primes[i] == true) //if i is equal true; is because it is a prime
		{
			
			System.out.println(i); //print out that number
			
		}
		i++; //increase i to the next number in the array
	}
	scan.close();
	
	//I COULDN'T FIND A WAY TO PRINT OUT THE NUMBERS IN ONE LINE.
}
}