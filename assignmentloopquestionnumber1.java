package loops;

import java.util.Scanner;

public class assignmentloopquestionnumber1 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter n: ");
        int n=Sc.nextInt();
        // here the code//


        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("sum of natural numberis: "+sum);
    }
}
