/*  You and your friend are playing a game with hoops. There are NN hoops (where NN is odd) in a row. You jump into hoop 11, and your friend jumps into hoop NN. Then you jump into hoop 22, and after that, your friend jumps into hoop N−1N−1, and so on.

The process ends when someone cannot make the next jump because the hoop is occupied by the other person. Find the last hoop that will be jumped into.
Input

    The first line contains an integer TT, the number of test cases. Then the test cases follow.
    Each test case contains a single line of input, a single integer NN.

Output

For each testcase, output in a single line the answer to the problem.
Constraints

    1≤T≤1051≤T≤105
    1≤N<2⋅1051≤N<2⋅105
    NN is odd
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
		    System.out.println(n/2 +1);
		}

	}
}
