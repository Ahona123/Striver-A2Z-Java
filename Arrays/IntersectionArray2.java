  import java.util.*;
  public class IntersectionArray2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        int arr2[]=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
    ArrayList<Integer>intersection = new ArrayList<> ();
    int i=0;
    int j=0;
    while(i<n && j<m){
        if(arr1[i]<arr2[j]){
            i++;
        }
        else if
            (arr2[j]<arr1[i]){
                j++;
        }
        else{
            intersection.add(arr1[i]);
            i++;
            j++;
        }
    }
    System.out.println("intersection:");
    for(int k =0;k<intersection.size();k++){
        System.out.print(intersection.get(k)+" " );
    }
}
  }
