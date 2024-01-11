/* Chef has been searching for a good motivational movie that he can watch during his exam time. His hard disk has XX GB of space remaining. His friend has NN movies represented with (Si,Ri)(Si​,Ri​) representing (space required, IMDB rating). Help Chef choose the single best movie (highest IMDB rating) that can fit in his hard disk.
Input

    The first line of the input contains a single integer TT denoting the number of test cases. The description of TT test cases follows.
    The first line of each test case contains two space-separated integers NN and XX.
    NN lines follow. For each valid ii, the ii-th of these lines contains two space-separated integers SiSi​ and RiRi​.

Output

For each test case, print a single line containing one integer - the highest rating of an IMDB movie which Chef can store in his hard disk.
Constraints

    1≤T≤101≤T≤10
    1≤N≤5⋅1041≤N≤5⋅104
    1≤X≤1091≤X≤109
    1≤Si,Ri≤1091≤Si​,Ri​≤109 for each valid ii
    X≥SiX≥Si​ for atleast one valid ii
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         for(int i=0;i<t;i++){
             int n = sc.nextInt(), x = sc.nextInt(), result=0;
             for(int j=0;j<n;j++){
                 int space = sc.nextInt(), rating = sc.nextInt();
                 if(space<=x){
                     if(rating>=result){
                         result = rating;
                     }
                 }
             }
             System.out.println(result);
         }
	}
}
