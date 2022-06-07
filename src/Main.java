import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        System.out.print("Введите к-ство строк в ромбе: ");
        Scanner scan = new Scanner(System.in);
        int rhombus = scan.nextInt();
        int center = rhombus / 2;
        for (int i = 0; i < rhombus; i++) {
            for (int j = 0; j < rhombus; j++) {
                if (i <= center) {
                    if (j >= center - i && j <= center + i) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                } else {
                    if (j >= center + i - rhombus + 1 && j <= center - i + rhombus - 1) {
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