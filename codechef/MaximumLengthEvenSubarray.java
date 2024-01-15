/* You are given an integer NN. Consider the sequence containing the integers 1,2,…,N1,2,…,N in increasing order (each exactly once). Find the maximum length of its contiguous subsequence with an even sum.
Input Format

    The first line of the input contains a single integer TT denoting the number of test cases. The description of TT test cases follows.
    The first and only line of each test case contains a single integer NN.

Output Format

For each test case, print a single line containing one integer --- the maximum length of a contiguous subsequence with even sum.
Constraints

    1≤T≤1041≤T≤104
    1≤N≤1041≤N≤104

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
		    int n = sc.nextInt();
		         long sum=0;
		         sum = (n*(n+1))/2;
		         if(sum%2==0){
		             System.out.println(n);
		         } else {
		             System.out.println(n-1);
		         }
		    
		}

	}
}
