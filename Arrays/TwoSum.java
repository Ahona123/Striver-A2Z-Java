import java.util.*;
public class TwoSum{
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int nums[]=new int[n];
    for(int i=0;i<n;i++){
        nums[i]=sc.nextInt();
    }
    HashMap<Integer,Integer>map= new HashMap<>();
    int target=sc.nextInt();
    for(int i=0;i<n;i++){
        int remaining=target-nums[i];
        if(map.containsKey(remaining)){
            System.out.println(map.get(remaining)+" "+i);
        }
        map.put(nums[i],i);
    }
}
}
