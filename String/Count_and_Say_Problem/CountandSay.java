

//Count and Say Problem.

import java.util.*;
public class CountandSay {
	public static String countandsay(int n)
	{
		if(n==1)
			return "1";
		if(n==2)
			return "11";
		String str="11";
		for(int i=3;i<=n;i++)
		{
			String tmp="";
			str=str+'&';
			int cnt=1;
			char arr[]=str.toCharArray();
			for(int j=1;j<str.length();j++)
			{
				if(arr[j]!=arr[j-1])
				{
					tmp=tmp+ cnt;
					tmp=tmp+arr[j-1];
					cnt=1;
				}
				else 
					cnt++;
			}
			str=tmp;
		}
	return str;
	}
	public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n= sc.nextInt();
        System.out.println(countandsay(n));

        sc.close();
    }
}
