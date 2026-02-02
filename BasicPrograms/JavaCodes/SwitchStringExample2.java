public class SwitchStringExample2 {
    public static void main(String[] args) {
        String fruit = "Apple";

        switch (fruit) {
            case "Apple":
                System.out.println("You chose Apple.");
                break;
            case "Banana":
                System.out.println("You chose Banana.");
                break;
            case "Orange":
                System.out.println("You chose Orange.");
                break;
            case "Mango":
                System.out.println("You chose Mango.");
                break;
            default:
                System.out.println("Unknown fruit.");
        }
    }
}