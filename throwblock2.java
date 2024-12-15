import java.util.*;
public class throwblock2 {
    public static void a(int a,int b){
        if(b==0){
            throw new ArithmeticException("can't devide");
        }
        System.out.println(a/b);
    }
    public static void main (String args[]){
        try{
            a(10,0);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}/*
can't devide  */