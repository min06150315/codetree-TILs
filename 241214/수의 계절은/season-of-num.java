import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        String res;

        if (m >= 3 && m <= 5) {
            res = "Spring";
        }else if (m >= 6 && m <= 8) {
            res = "Summer";
        }else if (m >= 9 && m <= 11) {
            res = "Fall";
        } else {
            res = "Winter";
        }

        System.out.println(res); 
    }
}