import java.util.*;
public class Leaders{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
         ArrayList<Integer>ans= new ArrayList<>();
        int maxi=nums[n-1];
        for(int i=n-1;i>=0;i--){
            if(nums[i]>=maxi){
                ans.add(nums[i]);
            }
            maxi=Math.max(maxi,nums[i]);
        }    
        Collections.reverse(ans);
        System.out.print("leaders in an array =" );
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
