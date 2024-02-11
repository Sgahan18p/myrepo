import java.util.Scanner;

public class Q32_fibonaci_number {
    public static void main(String[] args) {
        int a0=0,a1=1,a2;
        System.out.println("enter the number to which fibonaci series will print :- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            a2=a0+a1;
            a0=a1;
            a1=a2;
            System.out.println(a2+" ");

        }
    }
}
