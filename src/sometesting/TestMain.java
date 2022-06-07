package sometesting;

public class TestMain {

    public static void main(String[] args) {
        int height = 5;// вводим размер
        byte height_2 = (byte) (height / 2);

        // Заполненный
        // Верхня сторона
        for (byte y = 0; y <= height_2; y++) {
            for (byte x = 0; x <= height; x++) {

                if (x <= height_2 + y && x >= height_2 - y) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

        // Нижняя сторона
        for (byte y = height_2; y < height; y++) {
            for (byte x = 0; x < height; x++) {
                if (x <= height_2 + height - y - 1 && x >= y - height_2 + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("\n");
        }

        // Карскас
        // Верхня сторона
        for (byte y = 0; y <= height_2; y++) {
            for (byte x = 0; x <= height; x++) {

                if (x == height_2 + y || x == height_2 - y) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        // Нижняя сторона
        for (byte y = height_2; y < height; y++) {
            for (byte x = 0; x < height; x++) {
                if (x == height_2 + height - y - 1 || x == y - height_2 + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("\n");
        }
    }
}
