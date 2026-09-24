import java.util.Scanner;
public class MajorityElement {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int count=0;
        int element=0;
        for(int i=0;i<n;i++){
            if(count==0){
                element=nums[i];
            }
            if(nums[i]==element){
            count++;
        }
        else{
             count--;
        }
        }
        System.out.print(element);
    }
}

