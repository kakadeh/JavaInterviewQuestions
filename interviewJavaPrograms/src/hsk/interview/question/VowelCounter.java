package hsk.StringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Java Program to count vowels in a String. It accept a String from command
 * prompt and count how many vowels it contains. To revise, 5 letters a, e, i, o
 * and u are known as vowels in English.
 */

public class VowelCounter
{
	public static void main(String args[])
	{
		System.out.println("Please enter some text");
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		System.out.println("Number of vowels in String [" + input + "] is : " + usingSwitchCase(input));
		countVowelConsonants(input);
	}
	
	public static int usingSwitchCase(String str)
	{
		char[] letters = str.toCharArray();
		int count = 0;
		for (char c : letters)
		{
			switch (c)
			{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count++;
					break;
				default: // no count increment
			}
		}
		return count;
	}
	
	public static void countVowelConsonants(String str)
	{
		Map<Character, Integer> vowelCount = new HashMap<Character, Integer>();
		Map<Character, Integer> consonantCount = new HashMap<Character, Integer>();
		char[] characters = str.toCharArray();
		for (Character ch : characters)
		{
			if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u'))
			{
				if (vowelCount.containsKey(ch))
				{
					vowelCount.put(ch, vowelCount.get(ch) + 1);
				}
				else
				{
					vowelCount.put(ch, 1);
				}
			}
			else if (ch != ' ')
			{
				if (consonantCount.containsKey(ch))
				{
					consonantCount.put(ch, consonantCount.get(ch) + 1);
				}
				else
				{
					consonantCount.put(ch, 1);
				}
			}
		}
		
		System.out.println("Vowels:- " + vowelCount);
		
		Set<Map.Entry<Character, Integer>> entrySet = vowelCount.entrySet();
		for (Map.Entry<Character, Integer> entry : entrySet)
		{
			System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
			
		}
		
		System.out.println("Consonants:- " + consonantCount);
		
		Set<Map.Entry<Character, Integer>> cEntrySet = consonantCount.entrySet();
		for (Map.Entry<Character, Integer> cEntry : cEntrySet)
		{
			System.out.printf("%s : %d %n", cEntry.getKey(), cEntry.getValue());
		}
	}
}
