package apollo.exercises.ch06_classes;

public class CalculatorRunner {
    public static void main(String[] args) {
        int[] num1 = {0,1,2,3,4,5,6,7,8,9,10};

        ArrayCalculator calc = new ArrayCalculator();
        int sum = calc.sum(num1);
        System.out.println(sum);

        float avg = calc.avg(num1);
        System.out.println(avg);
    }
}
