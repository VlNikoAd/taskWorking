import java.util.Scanner;

public class MyCodeTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту ромба: ");
        System.out.println("Введите ширину ромба: ");

        final int height = scanner.nextInt();
        final int width = scanner.nextInt();

        System.out.println("Построение ромба: ");
        printDiamond(height, width);

    }

    private static void printDiamond(int height, int width) {

        int centerHeight = height / 2;
        int centerWidth = width /2;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (i <= centerHeight) {
                    if (j >= centerWidth - i && j <= centerWidth + i) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                } else {
                    if (j >= centerHeight + i - height + 1 && j <= centerWidth - i + height - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(" ");
        }
    }
}

