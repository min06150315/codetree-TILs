import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result;
        
        if (a < b) {
            result = 1;
        } else {
            result = 0;
        }
        System.out.print(result + " ");
        
        if (a == b) {
            result = 1;
        } else {
            result = 0;
        }
        System.out.println(result);
    }
}