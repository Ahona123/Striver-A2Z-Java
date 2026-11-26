import java.util.Scanner;
import java.util.Arrays;
public class LongestConsecutiveSequence {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=LongestConsecutiveSequence(arr);
        System.out.println("longest consecutive sequence is:" + result);
    }
     public static int LongestConsecutiveSequence(int[]arr){
        int n=arr.length;
        if(n==0){
            return 0;
        }
        Arrays.sort(arr);
        int longest=1;
        int count=1;
        int lastSmaller=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
             if(arr[i]-1==lastSmaller){
                count=count+1;
                lastSmaller=arr[i];
             }
             else if(arr[i]==lastSmaller){

             }
             if(arr[i]!=lastSmaller){
                 count=1;
                 lastSmaller=arr[i];
                 }
                  longest=Math.max(longest,count);
                }
                 return longest;
            }
        }
