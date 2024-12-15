import java.util.*;
class a{
    public void p(){
        System.out.println("HELLO I'am grand parent class");
    }
}
    class b extends a{
    public void p1(){
        super.p();
        System.out.println("HELLO i'am parent class ");
    }
}
public class superinherit{
        public static void main(String args[]){
            // using super inheritance
            b t=new b();
            t.p1();
        }
}/*
HELLO I'am grand parent class
HELLO i'am parent class    */