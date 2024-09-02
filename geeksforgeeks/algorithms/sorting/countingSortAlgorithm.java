import java.util.Arrays;
public class Sort{
     public static int[] countSort(int[] arr){
       int max = 0;
       for(int i=0;i<arr.length;i++){
         max = Math.max(max,arr[i]);
       }
       int countArr[] = new int[max+1];
       for(int i=0;i<arr.length;i++){
         countArr[arr[i]]++;
       }
       int output[] = new int[arr.length];
       for(int i = arr.length-1;i>0;i--){
         output[countArr[arr[i]]-1] = arr[i];
         countArr[arr[i]]--;
       }
       return output;
     }
  public static void main(String args[]){
    int[] arr = {4,3,10,8,4,7,1,1,0,15};
    int[] result = countSort(arr);
    for(int i=0;i<result.length;i++){
      System.out.print(result[i] + " ");
    }
  }
}
