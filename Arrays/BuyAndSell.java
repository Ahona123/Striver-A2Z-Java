  import java.util.Scanner;  
  public class BuyAndSell {
       public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int min=nums[0];
        int maxprofit=0;
        for(int i=1;i<n;i++){
            int profit=nums[i]-min;
            maxprofit=Math.max(maxprofit,profit);
            min=Math.min(nums[i],min);            
        }
        System.out.println(maxprofit);
    }
}
