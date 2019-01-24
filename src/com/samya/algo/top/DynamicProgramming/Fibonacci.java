/**
 * 
 */
package com.samya.algo.top.DynamicProgramming;

/**
 * @author Samya Ghosh
 *
 */
public class Fibonacci {
	
	final int MAX = 100; 
	  final int NIL = -1; 
	  
	  int lookup[] = new int[MAX]; 
	  
	  /* Function to initialize NIL values in lookup table */
	  void _initialize() 
	  { 
	    for (int i = 0; i < MAX; i++) 
	        lookup[i] = NIL; 
	  } 
	  
	  /* function for nth Fibonacci number */
	  int fib(int n) 
	  { 
	    if (lookup[n] == NIL) 
	    { 
	      if (n <= 1) 
	          lookup[n] = n; 
	      else
	          lookup[n] = fib(n-1) + fib(n-2); 
	    } 
	    return lookup[n]; 
	  } 
	  
	  public static void main(String[] args) 
	  { 
	    Fibonacci f = new Fibonacci(); 
	    int n = 40; 
	    f._initialize(); 
	    System.out.println("Fibonacci number is" + " " + f.fib(n)); 
	  } 

}
