/* Chef will have NN guests in his house today. He wants to serve at least one dish to each of the NN guests. Chef can make two types of dishes. He needs one fruit and one vegetable to make the first type of dish and one vegetable and one fish to make the second type of dish. Now Chef has AA fruits, BB vegetables, and CC fishes in his house. Can he prepare at least NN dishes in total?
Input Format

    First line will contain TT, number of testcases. Then the testcases follow.
    Each testcase contains of a single line of input, four integers N,A,B,CN,A,B,C.

Output Format

For each test case, print "YES" if Chef can prepare at least NN dishes, otherwise print "NO". Print the output without quotes.
Constraints

    1≤T≤1001≤T≤100
    1≤N,A,B,C≤1001≤N,A,B,C≤100

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
		    int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		    int sum = a+c,total=0;
		    String output = "NO";
		    if(a+c>=b){
		        total = b;
		    } else if(a+c<b){
		        total = a+c;
		    }
		    if(total>=n){
		        output = "YES";
		    }
		    System.out.println(output);
		}

	}
}
