import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numbers;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 1; i <= n; i++) {
            numbers = scanner.nextInt();
            if (numbers == 5) {
                a++;
            }
            if (numbers == 4) {
                b++;
            }
            if (numbers == 3) {
                c++;
            }
            if (numbers == 2) {
                d++;
            }
            
        }
        System.out.print(d + " " + c + " " + b + " " + a);  
    }
}
