import java.util.Scanner;

class SumCompareWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0) {
            int sumFormula = n * (n + 1) / 2;
            int sumWhile = 0, i = 1;

            while (i <= n) {
                sumWhile += i;
                i++;
            }

            System.out.println("Sum using formula = " + sumFormula);
            System.out.println("Sum using while loop = " + sumWhile);
        }
    }
}
