import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int res;

        if (a % 3 == 0 || a % 5 == 0) {
            res = 1;
        } else {
            res = 0;
        }

        System.out.println(res); 
    }
}