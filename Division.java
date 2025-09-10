public class Division {
    public static void main(String[] args) {
        // Example numbers to divide
        int num1 = 20;
        int num2 = 4;

        // Check to avoid division by zero
        if (num2 != 0) {
            int result = num1 / num2;
            System.out.println("Division of " + num1 + " by " + num2 + " is: " + result);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}