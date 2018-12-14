package example2;

public class Main {
    public static void main(String[] args) {
      int balance = 10000;
      int goal = 40000;
      int rate = 14;
      int years = 0;
      while(balance<goal){
            balance = balance + balance*rate/100;
            years++;
      }

        System.out.println("Сумму 40000 получим через " +
             years +   "лет ");

}   }






