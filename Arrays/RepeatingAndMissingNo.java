import java.util.Scanner;
public class RepeatingAndMissingNo {
    public static int[] RepeatingAndMissingNo(int[]nums){
        int n=nums.length;
        int A=-1;
        int B=-1;
        int hash[]=new int[n+1];
        for(int i=0;i<n;i++){
            hash[nums[i]]++;
        }
        for(int i=1;i<=n;i++){
            if(hash[i]==2){
                A=i;
            }
            else if(hash[i]==0){
                B=i;
            }
            if(A!=-1 && B!=-1){
                break;
            }
        }
        return new int[]{A,B};
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int result[]=RepeatingAndMissingNo(nums);
        System.out.println("Repeating Number:"+ result[0]);
        System.out.println("Missing Number:"+ result[1]);
    }
}


