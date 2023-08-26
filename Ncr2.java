import java.util.*;

class Parent1{
    public int a = 10;
    public void display(){
        System.out.println(a);
    }
}
class Child extends Parent1{
    int a = 50;
    public void display(){
        System.out.println(a);
    }
}
public class Ncr2 {
    
    public static void main(String[] args) {
        Parent1 c = new Child();
        c.display();
        System.out.println(c.a);
    }
}
