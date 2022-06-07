package sometesting;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Test2Main {

    public static void main(String[] args) {

//        //Способ через передачу параметров
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Входные параметры: ");
//        System.out.println("Высота: \nШирина: ");
//        final int height = scanner.nextInt();
//        final int width = scanner.nextInt();
//        printDiamond(height, width);

        //Тестовый способ для отладки
        printDiamondTest();
    }

    private static void printDiamondTest() {
        int size = 5;
        int center = size / 2;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i <= center) {
                    // Верхняя половина ромба
                    if (j == center - i || j == center + i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                } else {
                    // Нижняя половина ромба
                    if (j == center + i - size + 1 || j == center - i + size - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printDiamond(int height, int width) {
        int centerHeight = height / 2;
        int centerWidth = width / 2;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i <= centerHeight) {
                    // Верхняя половина ромба
                    if (j == centerWidth - i || j == centerWidth + i)
                        System.out.print("#");
                    else
                        System.out.print(" ");
                } else {
                    // Нижняя половина ромба
                    if (j == centerWidth + i - height + 1 || j == centerWidth - i + height - 1)
                        System.out.print("#");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}