package Task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ввести сумму чисел");
        int n = s.nextInt();
        int a = 40;
        int b = 60;
        int c = a + b;
        while (n>20){
            c = a + b;
            System.out.println(c);
            n++;
            a=b;
            b=c;



        }


    }
}
