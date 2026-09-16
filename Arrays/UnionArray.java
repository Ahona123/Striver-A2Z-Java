import java.util.*;
public class UnionArray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int arr2[]=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        HashSet<Integer>set= new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<m;i++){
            set.add(arr2[i]);
        }
        ArrayList<Integer>union= new ArrayList<>(set);
        Collections.sort(union);
        System.out.println("union: ");
        for(int i=0;i<union.size();i++){
            System.out.print(union.get(i)+" ");
        }
    }
    
}
