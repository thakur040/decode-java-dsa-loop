package loops;

import java.util.Scanner;

public class Assignmentloopquestionnumber5 {
    public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);

        System.out.println("enter a n number");
        int n=Sc.nextInt();

        int a = 1, b = 1, sum = 0;
        for(int i=1;i<=n-2;i++){
            sum = a+b;
            a =b;
            b= sum  ;
        }
        System.out.println(b);



    }
}
