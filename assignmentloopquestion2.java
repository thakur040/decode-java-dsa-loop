package loops;

import java.util.Scanner;

public class assignmentloopquestion2 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter n: ");
        int n=Sc.nextInt();

        for (int i = n; i <=n*10 ; i+=n) {
            System.out.println(i);

        }
    }
}
