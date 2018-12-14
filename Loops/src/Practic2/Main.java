package Practic2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.println("Ввести числа");
       int n = s.nextInt();
      int a = 0;
      int b = 1;
      int c = a + b ;
      while (n>0){
          c = a + b ;
          System.out.println(c);
          n--;
          a=b;
          b=c;
      }




    }
}
