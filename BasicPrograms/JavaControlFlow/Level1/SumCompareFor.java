import java.util.Scanner;

class SumCompareFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sumFormula = n * (n + 1) / 2;
        int sumFor = 0;

        for (int i = 1; i <= n; i++)
            sumFor += i;

        System.out.println("Sum using formula = " + sumFormula);
        System.out.println("Sum using for loop = " + sumFor);
    }
}
