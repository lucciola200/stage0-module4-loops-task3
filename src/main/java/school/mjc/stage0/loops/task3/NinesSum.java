package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 9;
        int totalSum = 0;
        for (int j = 0; j < lengthOfLastNumber; j++) {
            if (j != 0) {
                sum = (int) (9 * (Math.pow(10, j)) + sum);
            }
            totalSum += sum;
        }
        System.out.println(totalSum);
    }
}
