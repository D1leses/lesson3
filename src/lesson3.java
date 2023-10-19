import java.util.Scanner;

public class lesson3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        int c = a + b;
        int d = a - b;
        int r = a * b;
        int q = a / b;
        scanner.nextLine();
        System.out.printf("Результаты:\n%d + %d = %d\n", a, b, c);
        System.out.printf("%d - %d = %d\n", a, b, d);
        System.out.printf("%d * %d = %d\n", a, b, r);
        System.out.printf("%d : %d = %d\n", a, b, q);
        scanner.close();
    }
}