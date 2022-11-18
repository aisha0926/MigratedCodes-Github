package apollo.exercises.ch06_classes;

public class ArrayCalculator {
    public static int sum(int[] x){
        int sum=0;
        for(int i = 0; i< x.length;i++){
            sum+=x[i];
        }
        return sum;
    }

    public static float avg(int[] x){
        int test = sum(x) / x.length;
        return test;
    }
}
