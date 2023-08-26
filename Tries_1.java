// import java.util.*;

// import javax.print.event.PrintJobListener;


// public class Tries_1{
// static class TrieNode{
//     TrieNode children[] = new TrieNode[26];
//     boolean iseow;
//     TrieNode(){
//         iseow = false;
//         for(int i = 0;i<26;i++){
//             children[i]=null;
//         }
//     }
// }
// static TrieNode root=new TrieNode();
// static int insert(String str){
//     int index;
//     TrieNode temp=root;
//     int len = str.length();
//     for(int i = 0;i<len;i++){
//         index = str.charAt(i)-'a';
//         if(temp.children[index]==null){
//             temp.children[index]=new TrieNode();

//         }
//         temp = temp.children[index];
        
        
//     }
//     if(temp.iseow==true){return 0;}
//     else{
//         temp.iseow=true;
//         return 1;
//     }

// }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String a = sc.next();
//         int ans = 0;
//         for(int i = 0;i<a.length();i++){
//             for(int j=0;j+i+1<=a.length();j++){
//                 ans = ans+insert(a.substring(j, j+i+1));
//             }
//         }
//         System.out.println(ans);
//     }
// }