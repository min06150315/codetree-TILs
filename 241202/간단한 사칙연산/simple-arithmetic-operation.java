import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a, b;
        int add, sub, mul, div;

        a = sc.nextInt();
        b = sc.nextInt();
        
        add = a + b;
        sub = a - b;
        mul = a / b;
        div = a % b;

        System.out.printf("%d\n%d\n%d\n%d", add, sub, mul, div);
    }
}