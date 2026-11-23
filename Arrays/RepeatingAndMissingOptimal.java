import java.util.Scanner;
public class RepeatingAndMissingOptimal {
    public static int[] RepeatingAndMissingOptimal(int[]nums){
        int n=nums.length;
        long SN=(long)n*(n+1)/2;
        long S2N=(long)n*(n+1)*(2*n+1)/6;
        long S=0,S2=0;
        for(int i=0;i<n;i++){
            S+=nums[i];
            S2+=(long)nums[i]*nums[i];
        }
        long val1=S-SN;
        long val2=S2-S2N;
        val2=val2/val1;
        long X=(val1+val2)/2;
         long Y=X-val1;
        return new int[]{(int)X,(int)Y};
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int result[]=RepeatingAndMissingOptimal(nums);
        System.out.println("Repeating no:"+result[0]);
        System.out.println("Missing no:"+result[1]);
    }
}
