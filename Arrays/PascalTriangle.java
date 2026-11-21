import java.util.Scanner;
public class PascalTriangle {
    public static int pascalTriangle(int r,int c){
        int n=r-1;
        int k=c-1;
        int ans=1;
        for(int i=0;i<k;i++){
            ans=ans*(n-i);
            ans=ans/(i+1);
        }
        return ans;
    }public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the number of rows");
            int r=sc.nextInt();
            System.out.println("Enter the number of columns");
            int c=sc.nextInt();
            int result=pascalTriangle(r,c);
            System.out.println("Answer:"+ result);
        }
    }