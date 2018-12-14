package SR2;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {4,-9,6,-8,1,0,7};
        System.out.println(numbers.length);

        for (int i = 0, n = numbers.length; i<n; i++) {
            System.out.println(numbers[i]);
        }
        int sum=0;
        for (int i = 0, n = numbers.length; i<n; i++){
            sum= sum + numbers[i];
        }
        System.out.println(" Sum = " + sum);
    }
}
