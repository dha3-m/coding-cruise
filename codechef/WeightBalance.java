/* No play and eating all day makes your belly fat. This happened to Chef during the lockdown. His weight before the lockdown was w1w1​ kg (measured on the most accurate hospital machine) and after MM months of lockdown, when he measured his weight at home (on a regular scale, which can be inaccurate), he got the result that his weight was w2w2​ kg (w2>w1w2​>w1​).

Scientific research in all growing kids shows that their weights increase by a value between x1x1​ and x2x2​ kg (inclusive) per month, but not necessarily the same value each month. Chef assumes that he is a growing kid. Tell him whether his home scale could be giving correct results.
Input

    The first line of the input contains a single integer TT denoting the number of test cases. The description of TT test cases follows.
    The first and only line of each test case contains five space-separated integers w1w1​, w2w2​, x1x1​, x2x2​ and MM.

Output

For each test case, print a single line containing the integer 11 if the result shown by the scale can be correct or 00 if it cannot.
Constraints

    1≤T≤1051≤T≤105
    1≤w1<w2≤1001≤w1​<w2​≤100
    0≤x1≤x2≤100≤x1​≤x2​≤10
    1≤M≤101≤M≤10
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
		   int w1 = sc.nextInt(), w2 = sc.nextInt(), x1 = sc.nextInt(), x2 = sc.nextInt(), M = sc.nextInt();
		   x1 = x1* M; x2 = x2*M;
		   int diff = w2-w1;
		   if(diff>=x1 && diff<=x2){
		       System.out.println(1);
		   } else {
		       System.out.println(0);
		   }
		}

	}
}
