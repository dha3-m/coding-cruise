/* Chef is playing Need For Speed. Currently, his car is running on a straight road with a velocity UU metres per second and approaching a 90∘90∘ turn which is SS metres away from him. To successfully cross the turn, velocity of the car when entering the turn must not exceed VV metres per second.

The brakes of Chef's car allow him to slow down with a deceleration (negative acceleration) not exceeding AA metres per squared second. Tell him whether he can cross the turn successfully. The velocity vv when entering the turn can be determined from Newton's 2nd law to be v2=U2+2⋅a⋅Sv2=U2+2⋅a⋅S if the car is moving with a uniform acceleration aa.
Input

    The first line of the input contains a single integer TT denoting the number of test cases. The description of TT test cases follows.
    The first and only line of each test case contains four space-separated integers UU, VV, AA and SS.

Output

For each test case, print a single line containing the string "Yes" if Chef can cross the turn successfully or "No" if he cannot (without quotes).

You may print each character of each string in uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).
Constraints

    1≤T≤1051≤T≤105
    1≤U,V,A,S≤1041≤U,V,A,S≤104
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
		    double u = sc.nextDouble(), v = sc.nextDouble(), a = sc.nextDouble(), s = sc.nextDouble();
		    if(u==v){
		        System.out.println("Yes");
		    } else{
		        double velocitySq = u*u - 2*a*s;
		       
		        if(velocitySq<=v*v){
		            System.out.println("Yes");
		        } else {
		            System.out.println("No");
		        }
		    }
		}

	}
}
