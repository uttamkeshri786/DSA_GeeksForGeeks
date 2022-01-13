//More Efficient Solution : Time Complexity : O(sqrt(n))

import java.io.*;
import java.util.*;

public class Main {

	
	static void printPrimeFactors(int n)
	{
		if(n <= 1)
			return;

		while(n % 2 == 0)
		{
			System.out.print(2+" ");

			n = n / 2;
		}

		while(n % 3 == 0)
		{
			System.out.print(3+" ");

			n = n / 3;
		}

		for(int i=5; i*i<=n; i=i+6)
		{
			while(n % i == 0)
			{
				System.out.print(i+" ");

				n = n / i;
			}

			while(n % (i + 2) == 0)
			{
				System.out.print((i + 2)+" ");

				n = n / (i + 2);
			}
		}

		if(n > 3)
			System.out.print(n+" ");

		System.out.println();
	}

	public static void main (String[] args) {
		
		int n = 450;

		printPrimeFactors(n);

	}
}


//Efficient Code : 

import java.io.*;
import java.util.*;

public class Main {

	static void printPrimeFactors(int n)
	{
		if(n <= 1)
			return;

		for(int i=2; i*i<=n; i++)
		{
			while(n % i == 0)
			{
				System.out.print(i+" ");

				n = n / i;
			}
		}

		if(n > 1)
			System.out.print(n+" ");

		System.out.println();
	}

	public static void main (String[] args) {
		
		int n = 450;

		printPrimeFactors(n);

	}
}


// Naive Method : Time Complexity : O(n^2(logn))

import java.io.*;
import java.util.*;

public class Main 
{
    
	static boolean isPrime(int n)
	{
	    if(n == 1)
	        return false;
		for(int i=2; i<n; i++)
		{
		    if(n%i == 0)
	            return false;
		}
		return true;
	}

	static void PrimeFactors(int n)
	{
		for(int i=2; i<n; i++)
		{
		    if(isPrime(i))
		    {
		        int x = i;
		        while(n%x == 0)
		        {
		            System.out.print(i+" ");
		            x = x*i;
		        }
		    }
		}
	}

	public static void main (String[] args) {
		
		int n = 315;

		PrimeFactors(n);

	}
}