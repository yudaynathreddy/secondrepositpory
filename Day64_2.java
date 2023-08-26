import java.util.*;


class Day64_2 {
    static List<List<Integer>> res=new ArrayList<>();
    public static void rec(int start,int n,List<Integer> l){
        if(n<=1){
            if(l.size()>1){
                res.add(new ArrayList<>(l));
            }
           
        }
        for(int i = start;i<=n;i++){
            if(n%i==0){
                l.add(i);
                rec(i,n/i,l);
                l.remove(l.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rec(2,n,new ArrayList<>());
        System.out.println(res);
    }
}
