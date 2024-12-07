import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        String res;

        if (a >= 1.0) {
            res = "High";
        } else if (a >= 0.5) {
            res = "Middle";
        } else {
            res = "Low";
        }
        System.out.println(res);
    }
}