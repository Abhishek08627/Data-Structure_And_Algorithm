

// Check Weather a String is Palindrome or Not.

import java.util.*;
public class Palindrom 
{
	static boolean isPalindrome(String str)
	{
		int i=0;
		int j=str.length()-1;
		while(i<j)
		{
			if(str.charAt(i) != str.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
	return true;
	}
	public static void main(String str[])
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String st= sc.nextLine();
        if(isPalindrome(st))
        {
        	System.out.println("Yes");
        }
        else
        {
        	System.out.println("No");
        }
		
        sc.close();
	}
}
