// wap to calculate compound intrest?
import java.util.*;
public class Q4compound_intrest {
    public static void main(String[] args) {
        System.out.println("program to calculate compound intrest ");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the principal :- ");
        double principal = sc.nextDouble();
        System.out.println("enter the rate :- ");
        double rate =sc.nextDouble();
        System.out.println("enter the time :-");
        double time = sc.nextDouble(); 

        double CI = principal * 
                    (Math.pow((1 + rate / 100), time)); 
          
        System.out.println("Compound Interest is "+ CI); 
    }
}
