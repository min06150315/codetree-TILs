import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String res;

        if (a.equals("S")) {
            res = "Superior";
        } else if (a.equals("A")) {
            res = "Excellent";
        } else if (a.equals("B")) {
            res = "Good";
        } else if (a.equals("C")) {
            res = "Usually";
        } else if (a.equals("D")) {
            res = "Effort";
        } else {
            res = "Failure";
        }
        System.out.println(res);
    }
}