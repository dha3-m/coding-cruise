/* Problem Statement : Chef has taken his first dose of vaccine DD days ago. He may take the second dose no less than LL days and no more than RR days since his first dose.

Determine if Chef is too early, too late, or in the correct range for taking his second dose.
Input Format

    First line will contain TT, number of testcases. Then the testcases follow.
    Each testcase contains of a single line of input, three integers D,L,RD,L,R. */
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
         Scanner sc = new Scanner(System.in);
         int T = sc.nextInt();
         for(int i=0;i<T;i++){
             int d = sc.nextInt(), l = sc.nextInt(), r = sc.nextInt();
             if(d>r){
                 System.out.println("Too Late");
             } else if(d<l){
                 System.out.println("Too Early");
             } else if(d>=l && d<=r){
                 System.out.println("Take second dose now");
             }
         }
	}
}
