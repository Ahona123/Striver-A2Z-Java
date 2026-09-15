import java.util.Scanner;
public class RightRotateArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
         k =k % n;
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[n-k+i];
        }
        for(int i =n-k-1;i>=0;i--){
            arr[i+k]=arr[i];

        }
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
     }
    
}
