import java.util.Scanner;
public class SecondSmallestLargest {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        int slargest=-1;
        for(int i=0;i<n;i++){
          if(arr[i]>largest){
            slargest=largest;
            largest=arr[i];
          }
          else if(arr[i]!=largest && arr[i]>slargest){
            slargest=arr[i];
          }
        }
        int smallest=arr[0];
        int ssmallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                ssmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]!=smallest && arr[i]<ssmallest){
                ssmallest=arr[i];
              }
            }
            if(slargest==Integer.MIN_VALUE){
              System.out.println("Second largest: -1");
            }else {
                System.out.println(slargest);
              }
              if(ssmallest==Integer.MAX_VALUE){
                System.out.println("Second smallest: -1");
              }
              else{
                System.out.println(ssmallest);
              }
              sc.close();
        }
      }
