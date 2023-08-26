import java.util.*;
public class LC_323{
    public static void union(int a,int b,int[] arr){
        int p = arr[a];
        int q = arr[b];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==q){
                arr[i]=p;
            }
        }
    }
    public static void main(String[] args) {
       // System.out.println("hello world");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
       for(int i = 0;i<n;i++){
        arr[i]=i;
       }
       List<List<Integer>> l1= Arrays.asList(Arrays.asList(0,1),Arrays.asList(1,2),Arrays.asList(2,3),Arrays.asList(3,4));
       System.out.println(l1);
       for(List<Integer> l:l1){
        union(l.get(0),l.get(1),arr);

       }
       Set<Integer> s1 = new HashSet<>();
       for(int i = 0;i<arr.length;i++){
        s1.add(arr[i]);
       }
       System.out.println(s1.size());
    }
}