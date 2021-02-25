

// Weather a String is a valid Shuffle of two Strings or not.

import java.util.*;
public class Shuffle {
	static boolean ShuffleCheck(String first,String second,String result)
	{
		if(first.length()+second.length() != result.length())
		{
			return false;
		}
		int i=0,j=0,k=0;
		while(k != result.length())
		{
			if(i<first.length()&& first.charAt(i)==result.charAt(k))
				i++;
			else if(j<second.length() && second.charAt(j)==result.charAt(k))
				j++;
			else
				return false;
			k++;
		}
		if(i<first.length() ||j<second.length())
			return false;
		return true;
	}
	public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String1 : ");
        String first=sc.next();
        System.out.println("Enter the String2 : ");
        String second=sc.next();
        System.out.println("Enter the Result : ");
        String result=sc.next();
        if(ShuffleCheck(first,second,result)==true)
        {
        	System.out.println(result+" is a valid shuffle of "+first+" and "+second);
        }
        else
        {
        	System.out.println(result+" is not a valid shuffle of "+first+" and "+second);
        }
        
        sc.close();
    }
}
