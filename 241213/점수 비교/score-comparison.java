import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a_math = sc.nextInt();
        int a_eng = sc.nextInt();
        int b_math = sc.nextInt();
        int b_eng = sc.nextInt();
        int result;
        
        if ((a_math > b_math) && (a_eng > b_eng)) {
            result = 1;
        } else {
            result = 0;
        }
        System.out.println(result);
    }
}