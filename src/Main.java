import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int c = 0;
        outside: while (scanner.hasNext()) {
            c = scanner.nextInt();
            if (c == 0) {
                break outside;
            } else {
                a += c;
                if (a >= 1000){
                    a = a - 1000;
                    break outside;
                }
            }
        }
        System.out.println(a);
    }
}
