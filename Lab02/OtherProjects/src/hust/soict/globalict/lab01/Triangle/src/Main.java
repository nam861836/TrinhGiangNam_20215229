import java.util.Scanner;

class Triangle{
    public static void main(String[] args){
        int n, k = 0;
        Scanner num = new Scanner(System.in);
        System.out.print("Insert triangle height: ");
        n = num.nextInt();
        for (int i = 1; i <= n; ++i, k = 0) {
            for (int space = n - i; space >= 1; --space) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.print("\n");
        }
    }
}