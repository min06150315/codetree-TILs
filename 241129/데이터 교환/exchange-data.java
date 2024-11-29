public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a = 5, b = 6, c = 7;
        int temp;

        temp = c;
        c = b;
        b = a;
        a = temp;
        
        System.out.printf("%d\n%d\n%d", a, b, c);
    }
}