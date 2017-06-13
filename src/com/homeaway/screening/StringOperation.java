package com.homeaway.screening;

import java.util.HashMap;
import java.util.Map;

public class StringOperation
{
	/**
	 * 
	 * @param str is an ASCII character
	 * @return first non repeating character starting from left.
	 * we do two passes to get this algorithm, first is building the count,
	 * the second pass is to determine the character which has a count of 1 and it
	 * occurs first traversing from left to right.
	 * runtime complexity is O(n) + O(n) + c ~ O(n)
	 * space complexity is O(n), as we consider only 256 ASCII chars
	 */
	public static char findFirstNonRepatingCharFromString(String str)
	{
		if(str == null || str == "")
		{
			throw new IllegalArgumentException("empty string or input invalid ..."); 
		}
		
		Map<Character, Integer> count = new HashMap<>();
		
		for (int i = 0; i < str.length(); i++) // first pass
		{
			char c = str.charAt(i);
			
			if(count.containsKey(c))
            {
				count.put(c, count.get(c) + 1);
            }
			else
			{
				count.put(c, 1);
			}
		}
		
		
		for(int i = 0; i < str.length(); i++)// second pass
		{
			char c = str.charAt(i);
			if(count.get(c) == 1)
			{
				return c;
			}
		}
		
		throw new IllegalArgumentException("it looks like every string repeats");
		
	}
	
	public static void main(String[] args)
	{
		String input = "";
		System.out.println(findFirstNonRepatingCharFromString(input));
	}

}
