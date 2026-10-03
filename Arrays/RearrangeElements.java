import java.util.*;
public class RearrangeElements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        ArrayList<Integer>positive=new ArrayList<>();
        ArrayList<Integer>negative=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                positive.add(nums[i]);
            }
            else{
                negative.add(nums[i]);
            }
        }
        int[]ans=new int[n];
        for(int i=0;i<n/2;i++){
            ans[2*i]=positive.get(i);
            ans[2*i+1]=negative.get(i);
         }
         System.out.print("Rearranged array=");
         for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
         }
        }
    }
