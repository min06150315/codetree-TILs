import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a, b, mul, div;
        a = sc.nextInt();
        b = sc.nextInt();
        
        mul = a * b;
        div = a / b;

        System.out.printf("%d * %d = %d\n", a, b, mul);
        System.out.printf("%d / %d = %d\n", a, b, div);
    }
}