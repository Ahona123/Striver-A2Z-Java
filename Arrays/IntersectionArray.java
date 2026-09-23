import java.util.*;
public class IntersectionArray {
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
        int visited[]= new int[m];
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i]==arr2[j] && visited[j]==0){
                    intersection.add(arr1[i]);
                    visited[j]=1;
                    break;
                }
            }
        }
        Collections.sort(intersection);
        System.out.println("intersection: ");
        for(int i=0; i<intersection.size();i++){
            System.out.print(intersection.get(i)+" ");
        }
    }
}
