import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        boolean asc = true;
        boolean desc = true;
        int previous = scanner.nextInt();
        int current = scanner.nextInt();
        if (current == 0) {
            System.out.println(true);
        } else {
            while (current != 0){
                asc = asc && current >= previous;
                desc = desc && current <= previous;
                previous = current;
                current = scanner.nextInt();

            }
            System.out.println(asc || desc);
        }

    }
}