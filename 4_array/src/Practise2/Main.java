package Practise2;

public class Main {
    public static void main(String[] args) {
        int[] x = {2,4,6,8,10};
        int[] y = {-4,-5,-7,0,2};
        int[] result = new int[x.length];

        for (int i = 0, n = result.length; i<n; i++){
            result[i] = x[i] + y[i];
            System.out.println(result[i]);
        }
        for (int i = 0, n = result.length; i<n; i++) {
            System.out.println(result[i]);

        }

    }
}
