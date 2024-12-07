import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String res;

        if (a == 1) {
            res = "John";
        } else if (a == 2) {
            res = "Tom";
        } else if (a == 3) {
            res = "Paul";
        } else {
            res = "Vacancy";
        }
        System.out.println(res);
    }
}