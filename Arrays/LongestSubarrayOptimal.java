import java.util.*;
public class LongestSubarrayOptimal {
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int nums[]=new int[n];
    for(int i=0;i<n;i++){
        nums[i]=sc.nextInt();
    }
    int left=0;
    int right=0;
    int sum=0;
    int maxLen=0;
    int k =sc.nextInt();
    while(right<n){
        sum=sum+nums[right];
        while(left<=right && sum>k){
            sum-=nums[left];
            left++;
        }
        if(sum==k){
            maxLen=Math.max(maxLen,right-left+1);
        }
        right++;
    }
        System.out.println(maxLen);
    }
}
