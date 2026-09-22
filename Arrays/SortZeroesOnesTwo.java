import java.util.Scanner;
public class SortZeroesOnesTwo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int cnt0=0;
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                cnt0++;
            }
            else if(arr[i]==1){
                cnt1++;
            }
            else{
                cnt2++;
            }
            }
            for(int i=0;i<cnt0;i++){
               arr[i]=0;
                        }
                        for(int i=cnt0;i<cnt0+cnt1;i++){
                           arr[i]=1;
                        }
                        for(int i=cnt0+cnt1;i<cnt0+cnt1+cnt2;i++){
                           arr[i]=2;
                        }
                        for(int i=0;i<n;i++){
                            System.out.print(arr[i]+" ");
                        }
                    }
}
