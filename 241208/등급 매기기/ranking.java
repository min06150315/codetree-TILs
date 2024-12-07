import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String res;

        if (a >= 90) {
            res = "A";
        } else if (a >= 80) {
            res = "B";
        } else if (a >= 70) {
            res = "C";
        } else if (a >= 60) {
            res = "D";
        } else {
            res = "F";
        }
        System.out.println(res);
    }
}