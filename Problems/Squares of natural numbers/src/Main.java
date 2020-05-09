import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        int square = 1;
        int i = 1;
        while (square <= number) {
            System.out.println(square);
            i++;
            square = i * i;

        }
    }
}
