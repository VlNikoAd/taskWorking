package sometesting;

public class Test2Main {
    static int N = 3;

    public static void main(String[] args) {
        System.out.println(printAnIsoscelesTriangle(N));
    }

    public static String printAnIsoscelesTriangle(int N) {
        StringBuilder result = new StringBuilder();
        for (int r = 1; r <= N; r++) {
            for (int sp = 1; sp <= N - r; sp++) {
                result.append(" ");
            }
            for (int c = 1; c <= (r * 2) - 1; c++) {
                result.append("*");
            }
            result.append(System.lineSeparator());
        }
        return result.toString();
    }
}
