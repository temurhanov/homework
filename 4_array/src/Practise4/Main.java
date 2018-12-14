package Practise4;

public class Main {
    public static void main(String[] args) {
        int min = (int)Double.POSITIVE_INFINITY;
        int max = (int)Double.NEGATIVE_INFINITY;

        int[] myNumbers={6,20,27,0,-7,8};
        for (int i = 0, n = myNumbers.length; i<n; i++){
            if (myNumbers[i] > max){
                max = myNumbers[i];
            }
        }

        System.out.println("Min=" +min);

    }
}
