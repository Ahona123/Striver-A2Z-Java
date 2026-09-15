import java.util.Scanner;
public class ZeroesToTheEnd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp[]=new int[n];
        int nz=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[nz]=arr[i];
                nz++;
            }
        }
        for(int i=0;i<nz;i++){
            arr[i]=temp[i];
        }
        for(int i=nz;i<n;i++){
            arr[i]=0;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
