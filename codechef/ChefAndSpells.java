/* Chef has three spells. Their powers are AA, BB, and CC respectively. Initially, Chef has 00 hit points, and if he uses a spell with power PP, then his number of hit points increases by PP.

Before going to sleep, Chef wants to use exactly two spells out of these three. Find the maximum number of hit points Chef can have after using the spells.
Input Format

    The first line of the input contains a single integer TT denoting the number of test cases. The description of TT test cases follows.
    The first and only line of each test case contains three space-separated integers AA, BB, and CC.

Output Format

For each test case, print a single line containing one integer — the maximum number of hit points.
Constraints

    1≤T≤1041≤T≤104
    1≤A,B,C≤1081≤A,B,C≤108

*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), sum = 0, max1 = 0, max2 = 0;
		    if(a>=b && a>=c){
		        max1 = a;
		        if(b>=c){
		            max2 = b;
		        } else {
		            max2 = c;
		        }
		        sum = max1 + max2;
		    } else if(b>=a && b >=c){
		         max1 = b;
		         if(a>=c){
		             max2 = a;
		         } else {
		             max2 = c;
		         }
		         sum = max1 + max2;
		    } else if(c>=a && c>=b){
		        max1 = c;
		        if(a>=b){
		            max2 = a;
		        } else {
		            max2 = b;
		        }
		        sum = max1 + max2;
		    }
		    System.out.println(sum);
		}

	}
}
