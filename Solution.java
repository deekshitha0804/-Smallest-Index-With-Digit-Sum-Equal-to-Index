import java.util.*;
class Solution {
    public static int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
           int r=0;
           while(nums[i]>0){
            r+=nums[i]%10;
            nums[i]=nums[i]/10;
           }
           if(i==r){
            return i;
           }
        }
        return -1;
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      int r=smallestIndex(a);
      System.out.println(r);
    }

}