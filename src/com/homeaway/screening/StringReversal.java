package com.homeaway.screening;

/**
 *  time complexity of both implementaiton 
 *  is O(n/2) ~ O(n)
 *  the recursive one is short, but can cause a stack overflow if the string to be reversed is big..... 
 *
 */
public class StringReversal
{	
   public static char[] reverseString(String string)
   {
	   if(string == null || string.isEmpty())
	   {
		   return null;
	   }
	   
	   char[] array = string.toCharArray();
	   int start = 0;
	   int end = array.length -1;
	   
	   while(start < end)
	   {
		   swap(array, start, end);
		   start++;
		   end--;
	   }
	   
	   return array;
   }
   
   public static void reverseStringRecursive(char[] string, int start, int end)
   {
	   if(start >= end) // Base case
	   {
		   return;
	   }
	   
	   swap(string, start, end);
	   reverseStringRecursive(string, start + 1, end -1); // reduce the problem to sub problems, the overlapping part.....
   }
   
   

	private static void swap(char[] array, int start, int end) 
	{
		char tmp = array[end];
		array[end] = array[start];
		array[start] = tmp;
	}
	
	public static void main(String[] args)
	{
		String input = "test";
		System.out.println(String.valueOf(reverseString(input)));
		
		char[] charInput = input.toCharArray();
		
		reverseStringRecursive(charInput, 0, input.length() -1);
        System.out.println(String.valueOf(charInput));	
	}
}
