import java.util.Scanner;
import java.util.HashSet;
public class LongestSequenceII {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[]nums=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int result=LongestSequenceII(nums);
        System.out.println("longest consecutive sequence is:" + result);
    }
    public static int LongestSequenceII(int[] nums) {
          int n = nums.length;
        if(n==0){
            return 0;
        }
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);

        }
        int longest=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int count=1;
                 int x=num;
            while(set.contains(x+1)){
                x++;
                count++;
            }
            longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}
