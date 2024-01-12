package loops;

import java.util.Scanner;

public class Assignmentloopquestionnumber3 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter two number:");
        int a=Sc.nextInt();
        int b=Sc.nextInt();
        int gcd=0;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0 )
                gcd=i;
        }
        System.out.println(gcd);
    }
}
