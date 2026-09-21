import java.util.*;
public class LongestSubarray{
public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int nums[]=new int[n];
    for(int i=0;i<n;i++){
        nums[i]=sc.nextInt();
    }
        HashMap<Integer,Integer>map= new HashMap<>();
        int sum=0;
        int maxLen=0;
          int k = sc.nextInt();
        for(int i=0;i<n;i++){  
            sum=sum+nums[i];
                      if(sum==k){
                maxLen=i+1;
            }
            int remaining=sum-k;
            if(map.containsKey(remaining)){
                int length=i-map.get(remaining);
                maxLen=Math.max(maxLen,length);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
       System.out.println(maxLen);
     }
}