import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int res;

        if (a >= 90) {
            if (b >= 95) {
                res = 10;
            } else if (b >= 90) {
                res = 5;
            } else {
                res = 0;
            }
        } else {
            res = 0;
        }
        

        System.out.println(res * 10000); 
    }
}