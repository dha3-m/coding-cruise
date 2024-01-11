/* Chef is a software developer, so he has to switch between different languages sometimes. Each programming language has some features, which are represented by integers here.

Currently, Chef has to use a language with two given features AA and BB. He has two options --- switching to a language with two features A1A1​ and B1B1​, or to a language with two features A2A2​ and B2B2​. All four features of these two languages are pairwise distinct.

Tell Chef whether he can use the first language, the second language or neither of these languages (if no single language has all the required features).
Input Format

    The first line of the input contains a single integer TT denoting the number of test cases. The description of TT test cases follows.
    The first and only line of each test case contains six space-separated integers A,B,A1,B1,A2,B2A,B,A1​,B1​,A2​,B2​.

Output Format

For each test case, print a single line containing the integer 11 if Chef should switch to the first language, or 22 if Chef should switch to the second language, or 00 if Chef cannot switch to either language.
Constraints

    1≤T≤2881≤T≤288
    1≤A,B,A1,B1,A2,B2≤41≤A,B,A1​,B1​,A2​,B2​≤4
    A,BA,B are distinct
    A1,B1,A2,B2A1​,B1​,A2​,B2​ are pairwise distinct

*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		for(int i=0;i<t;i++){
		    int a = sc.nextInt(), b = sc.nextInt(), a1 = sc.nextInt(), b1 = sc.nextInt(), a2 = sc.nextInt(), b2 = sc.nextInt();
		     ArrayList<Integer> list1 = new ArrayList<>( Arrays.asList(a1,b1));
		     ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(a2,b2));
		     ArrayList<Integer> list = new ArrayList<>(Arrays.asList(a,b));
		     if(list1.containsAll(list)){
		         System.out.println(1);
		     } else if(list2.containsAll(list)){
		         System.out.println(2);
		     } else {
		         System.out.println(0);
		     }
		}

	}
}
