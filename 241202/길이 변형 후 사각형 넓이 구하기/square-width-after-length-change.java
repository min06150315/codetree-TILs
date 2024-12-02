import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n, m, nm;

        n = sc.nextInt();
        m = sc.nextInt();

        n += 8;
        m *= 3;
        nm = n * m;

        System.out.printf("%d\n%d\n%d\n", n, m, nm);

    }
}