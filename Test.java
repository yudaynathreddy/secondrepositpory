import java.util.*; 
class Test
 { 
 public int check(int[] a, int k, int l, int h) 
 { 
 int points = 0; 
 int sum = 0; 
 for (int i = 0; i < k; i++) 
 sum +=a[i]; 
 if (sum > h) 
 points++; 
 else if (sum < l) 
 points--; 
 for (int i = k; i < a.length; i++) { 
 sum += a[i]; 
 sum -= a[i - k]; 
 if (sum > h) 
 points++; 
 else if (sum < l) 
 points--; 
 } 
 return points; 
 } 
 public static void main(String args[]) 
 { 
 Scanner sc=new Scanner(System.in); 
 int n=sc.nextInt(); 
 int a[]=new int[n]; 
 for(int i=0;i<n;i++) 
 { 
 a[i]=sc.nextInt(); 
 } 
 int k=sc.nextInt(); 
 int l=sc.nextInt(); 
 int h=sc.nextInt(); 
 System.out.println(new Test().check(a,k,l,h)); 
 } 
 }