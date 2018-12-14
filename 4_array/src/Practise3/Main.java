package Practise3;

public class Main {
    public static void main(String[] args) {
        int[] x = {3,7,9,12,5,2};
        int[] y = {-2,-8,4,0,6};
        int[] result = new int[x.length+y.length];

        for (int i=0; i<x.length; i++){
            result[i] = x[i];
        }
         for (int i=0; i<y.length; i++){
             result[i + x.length] = y[i];
         }
        for (int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }

    }
}
