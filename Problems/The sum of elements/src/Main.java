import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number;
        int sum = 0;
        do {
            number = scanner.nextInt();
            sum += number;

        } while (number != 0);
        System.out.print(sum);
    }
}
