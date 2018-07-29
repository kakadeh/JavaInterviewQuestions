package hsk.interview.question;
import java.util.Scanner;

public class ReverseString
{
	public static Scanner read;
	public String str, reverse;
	public static void main(String[] args)
	{
		ReverseString obj = new ReverseString();
		obj.traditionalWay();
		obj.useOfStringBuilder();
		obj.reverseFunction();
		read.close();
	}

	// This is traditional way to reverse the string
	public void traditionalWay()
	{
		System.out.println("Enter string to reverse:");

		read = new Scanner(System.in);
		str = read.nextLine();
		reverse = "";

		for(int i = str.length() - 1; i >= 0; i--)
		{
			reverse = reverse + str.charAt(i);
		}

		System.out.println("Reversed string is:");
		System.out.println(reverse);
	}

	// This method uses the Java StringBuilder class :
	public void useOfStringBuilder()
	{
		System.out.println("Enter string to reverse:");

		read = new Scanner(System.in);
		str = read.nextLine();

		StringBuilder sb = new StringBuilder();

		for(int i = str.length() - 1; i >= 0; i--)
		{
			sb.append(str.charAt(i));
		}

		System.out.println("Reversed string is:");
		System.out.println(sb.toString());

	}
	// Of course there is still an easier shortcut to do it and that would be to simply use the Java StringBuilder class “reverse” function.
	public void reverseFunction()
	{
		System.out.println("Enter string to reverse:");

		read = new Scanner(System.in);
		str = read.nextLine();

		StringBuilder sb = new StringBuilder(str);

		System.out.println("Reversed string is:");
		System.out.println(sb.reverse().toString());
	}
}