/* Chef prepared two dishes yesterday. Chef had assigned the tastinesstastiness T1T1​ and T2T2​ to the first and to the second dish respectively. The tastiness of the dishes can be any integerinteger between 00 and NN (both inclusive).

Unfortunately, Chef has forgotten the values of T1T1​ and T2T2​ that he had assigned to the dishes. However, he remembers the sum of the tastiness of both the dishes - denoted by SS.

Chef wonders, what can be the maximum possible absolute difference between the tastiness of the two dishes. Can you help the Chef in finding the maximum absolute difference?

It is guaranteed that at least one pair {T1,T2}{T1​,T2​} exist such that T1+T2=S,0≤T1,T2≤NT1​+T2​=S,0≤T1​,T2​≤N.
Input Format

    The first line of input contains a single integer TT, denoting the number of testcases. The description of the TT testcases follows.
    The first and only line of each test case contains two space-separated integers NN, SS, denoting the maximum tastiness and the sum of tastiness of the two dishes, respectively.

Output Format

For each testcase, output a single line containing the maximum absolute difference between the tastiness of the two dishes.
Constraints

    1≤T≤1031≤T≤103
    1≤N≤1051≤N≤105
    1≤S≤2⋅1051≤S≤2⋅10
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
		    int n = sc.nextInt(), s = sc.nextInt(), result=0;
		    int jMax = Math.min(n,s);
		    if(n>=s){
		        result = s;
		    }
		    else{
		        int diff = s-n;
		        result = Math.abs(n-diff);
		    }
		    System.out.println(result);
		}

	}
}
