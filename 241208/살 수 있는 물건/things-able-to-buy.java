import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String res;

        if (a >= 3000) {
            res = "book";
        } else if (a >= 1000) {
            res = "mask";
        } else {
            res = "no";
        }
        System.out.println(res);
    }
}