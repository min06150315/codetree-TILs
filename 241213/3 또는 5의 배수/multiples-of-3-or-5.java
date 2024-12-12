import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String result;
        
        if (a % 3 == 0) {
            result = "YES";
        } else {
            result = "NO";
        }
        System.out.println(result);
        
        if (a % 5 == 0) {
            result = "YES";
        } else {
            result = "NO";
        }
        System.out.println(result);
    }
}