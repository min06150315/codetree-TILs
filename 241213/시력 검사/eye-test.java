import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String result;
        
        if (a >= 1.0 && b >= 1.0) {
            result = "High";
        } else if (a >= 0.5 && b >= 0.5) {
            result = "Middle";
        } else {
            result = "Low";
        }
        System.out.println(result);
    }
}