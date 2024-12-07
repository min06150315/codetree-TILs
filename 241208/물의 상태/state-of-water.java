import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String res;

        if (a < 0) {
            res = "ice";
        } else if (a >= 100) {
            res = "vapor";
        } else {
            res = "water";
        }
        System.out.println(res);
    }
}