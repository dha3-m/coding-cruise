/* You are given two integers NN and KK. You may perform the following operation any number of times (including zero): change NN to N−KN−K, i.e. subtract KK from NN. Find the smallest non-negative integer value of NN you can obtain this way.
Input

    The first line of the input contains a single integer TT denoting the number of test cases. The description of TT test cases follows.
    The first and only line of each test case contains two space-separated integers NN and KK.

Output

For each test case, print a single line containing one integer — the smallest value you can get.
Constraints

    1≤T≤1051≤T≤105
    1≤N≤1091≤N≤109
    0≤K≤1090≤K≤109
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
		    int n = sc.nextInt(), k = sc.nextInt();
		    if(n<k || k==0){
		        System.out.println(n);
		    } else if(n==k){
		        System.out.println(0);
		    } else {
		        System.out.println(n%k);
		    }
		}

	}
}
