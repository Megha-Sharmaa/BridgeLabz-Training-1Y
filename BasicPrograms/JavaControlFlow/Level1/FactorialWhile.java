import java.util.Scanner;

class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fact = 1;
        while (n > 0) {
            fact *= n;
            n--;
        }
        System.out.println("Factorial is " + fact);
    }
}
