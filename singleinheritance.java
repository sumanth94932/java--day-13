import java.util.*;
public class singleinheritance{
    public static void main(String args[]){
        b s=new b();
        s.print();
        s.display();
    }
}
class a{
    public void print(){
        System.out.println("hello");
    }
}
class b extends a{
    public void display(){
        System.out.println("shiva");
    }
}
/* 
hello
shiva   */