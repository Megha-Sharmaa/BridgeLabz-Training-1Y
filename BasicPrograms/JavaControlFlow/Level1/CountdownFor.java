import java.util.Scanner;

class CountdownFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();

        for (; counter >= 1; counter--)
            System.out.println(counter);
    }
}
