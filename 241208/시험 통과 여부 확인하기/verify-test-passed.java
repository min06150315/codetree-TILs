import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int goal = 80;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a >= 80) {
            System.out.println("pass");
        } else {
            System.out.println((goal - a) + " more score");
        }
    }
}