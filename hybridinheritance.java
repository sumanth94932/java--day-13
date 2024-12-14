import java.util.*;
public class hybridinheritance{
    public static void main (String [] args){
        c n=new c();
        n.s();
        n.s2();
        n.s3();
        n.s4();
    }
}
class gp{
    public void s(){
        System.out.println("i am grand parent ");
    }
}
class p1 extends gp{
    public void s2(){
        System.out.println("i am parent 1 ");
    }
}
interface p2{
    public void s3();   
}
class c extends p1 implements p2{
    public void s3(){
        System.out.println("i am parent 2");
    }
    public void s4(){
        System.out.println("i am child class");
    }
}/*
i am grand parent 
i am parent 1   
i am parent 2   
i am child class  */