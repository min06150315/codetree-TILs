import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String res = "";

        if (a == 5) {
            res = "A";
        }

        if (a % 2 == 0) {
            res = "B";
        }

        
        System.out.println(res);
    }
}