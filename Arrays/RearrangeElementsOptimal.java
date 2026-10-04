import java.util.Scanner;
public class RearrangeElementsOptimal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int posIndex=0;
        int negIndex=1;
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ans[posIndex]=nums[i];
                posIndex+=2;
            }
            else{
                ans[negIndex]=nums[i];
                negIndex+=2;
            }
        }
        System.out.print("Rearranged array=");
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+"  ");
        }
    }
}
