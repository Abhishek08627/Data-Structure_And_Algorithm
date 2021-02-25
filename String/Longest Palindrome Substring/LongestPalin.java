

// Longest Palindrome Substring.

import java.util.*;
public class LongestPalin {
	static int longest(String str)
	{
		int maxlen=1;
		int len=str.length();
		int start=0;
		int low,high;
		for(int i=1;i<len;++i)
		{
			low=i-1;
			high=i;
			while(low>0 && high<len && str.charAt(low)==str.charAt(high))
			{
				if(high-low+1>maxlen)
				{
					start=low;
					maxlen=high-low+1;
				}
			--low;
			++high;
			}
			low=i-1;
			high=i+1;
			while(low>0 && high<len && str.charAt(low)==str.charAt(high))
			{
				if(high-low+1>maxlen)
				{
					start=low;
					maxlen=high-low+1;
				}
			--low;
			++high;
			}
		}
		System.out.print("Longest SubString is : ");
		printsubstr(str,start,start+maxlen-1);
		return maxlen;
	}
	static void printsubstr(String str,int low,int high)
	{
		System.out.println(str.substring(low, high+1));
	}
	public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String st= sc.next();
        System.out.println("Length is : "+ longest(st));
        
        sc.close();
    }
}


// Time Complexity = O(n^2)
// Space Complexity = O(1)




//

