import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("HomeWork 09");
        int daysInMounth = 30;
        int minimalRandomSalary = 100_000;
        int maximumRandomSalary = 200_000;

        int amountMonthSalary;
        int minimalDaySalary;
        int maximumDaySalary;
        double averageDaySalary;
        int randomSalary[]= generateRandomArray(daysInMounth, minimalRandomSalary, maximumRandomSalary);

        System.out.println("Part1");
        amountMonthSalary = Arrays.stream(randomSalary).sum();
        System.out.println("Сумма трат за месяц составила " + amountMonthSalary);

        System.out.println("\nPart2");
        minimalDaySalary = randomSalary[0];
        maximumDaySalary = randomSalary[0];
        for (int current : randomSalary) {
            if (current < minimalDaySalary) {
                minimalDaySalary = current;
            }
            if (current > maximumDaySalary) {
                maximumDaySalary = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minimalDaySalary);
        System.out.println("Максимальная сумма трат за день составила " + maximumDaySalary);

        System.out.println("\nPart3");
        System.out.print("Средние расходы за день составили ");
        averageDaySalary = (double) amountMonthSalary / daysInMounth;
        if (amountMonthSalary % daysInMounth == 0) {
            System.out.println((int)averageDaySalary);
        } else {
            System.out.println(averageDaySalary);
        }

        System.out.println("\nPart4");
        char[] reverseSurname = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseSurname.length-1; i >= 0; i--) {
            System.out.print(reverseSurname[i]);
        }
    }
    public static int[] generateRandomArray(int days, int minSalary , int maxSalary) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[days];
        for (int i = 0; i < days; i++) {
            arr[i] = (int) random.nextInt(maxSalary - minSalary) + minSalary;
        }
        return arr;
    }
}