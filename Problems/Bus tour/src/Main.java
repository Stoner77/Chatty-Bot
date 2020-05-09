import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int busHeight = scanner.nextInt();
        int nBridge = scanner.nextInt();
        int bridgeHeight;
        String str = "Will not crash";
        for (int i = 1; i <= nBridge; i++) {
            bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= busHeight) {
                str = "Will crash on bridge " + i;
                break;

            }
        }
        System.out.print(str);
    }
}
