import java.util.Scanner;
public class LeftRotateByKplaces {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
         k= k % n;
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }
        for(int i=0;i<k;i++){
            arr[n-k+i]=temp[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
     } 
}
