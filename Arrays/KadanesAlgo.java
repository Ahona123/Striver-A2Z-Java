import java.util.Scanner;
public class KadanesAlgo {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>maxSum){
            maxSum=sum;
        }
        if(sum<0){
            sum=0;
        }
    }
    System.out.println(maxSum);
    }
}

