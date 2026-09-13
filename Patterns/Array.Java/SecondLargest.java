import java.util.Scanner;
public class SecondLargest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }    
        int largest=Integer.MIN_VALUE;
        int SecondLargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                SecondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>SecondLargest && arr[i]!=largest){
                SecondLargest=arr[i];
            }
        }
        if(SecondLargest==Integer.MIN_VALUE){
            System.out.println(-1);
        }
        else{
            System.out.println(SecondLargest);
        }
            }
        }

