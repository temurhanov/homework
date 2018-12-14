package SR1;

public class Main {
    public static void main(String[] args) {
        int[] x ={2,8,12,-7,4,};
        int[] y ={6,-3,2,14,-5};
        int[] result = new int[x.length];

        for (int i=0, n=x.length; i<n; i++){
            result[i] = x[i] + y[i];
            System.out.println(result[i]);

        }
        for (int i=x.length, n=y.length; i<n; i--){
            System.out.println(result[i]);
        }


    }
}
