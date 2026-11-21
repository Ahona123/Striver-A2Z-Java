import java.util.Scanner;
public class PascalTriangleRow {
    public static int[] PascalTriangleRow(int r){
    int ans[]=new int[r];
    int res=1;
    ans[0]=1;
    for(int i=1;i<r;i++){
        res=res*(r-i);
        res=res/i;
        ans[i]=res;
    }
    return ans;
}
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the row number");
    int r =sc.nextInt();
    int result[]=  PascalTriangleRow(r);
    System.out.print("PascalTriangleRow: ");
    for(int i=0;i<r;i++){
        System.out.print(result[i]+" ");
    }
}
}