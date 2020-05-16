import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double area;
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.next();

        switch (figure) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();

                double p = (a + b + c) / 2;
                area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                break;

            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                area = a * b;
                break;

            case "circle":
                a = scanner.nextDouble();
                area = 3.14 * a * a;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + figure);
        }

        System.out.print(area);
    }
}
