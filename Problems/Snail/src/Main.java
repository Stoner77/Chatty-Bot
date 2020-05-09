import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        
        int height = scanner.nextInt();
        int feetsUp = scanner.nextInt();
        int feetsDown = scanner.nextInt();
        int days = 0;
        int daily = feetsUp - feetsDown;

        while (height > 0) {
            if (height <= feetsUp) {
                days++;
                break;
            }
            height -= daily;
            days++;        
        }
        
       
    System.out.print(days);

    }
}
