import java.util.*;

public class Day64_1 {
    static int res = 0;
    public static void backtrack(String st,Set<String> s,int ind,int count){
        if(ind == st.length()){
            res = Math.max(res,count);
        }
        for(int i = 0;i<st.length();i++){
            String t = st.substring(ind,ind+i);
            if(!s.contains(t)){
                s.add(t);
                backtrack(st,s,ind+i,count+1);
                s.remove(s.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();

        backtrack(st,new HashSet<>(),0,0);
        System.out.println(res);
    }
}
