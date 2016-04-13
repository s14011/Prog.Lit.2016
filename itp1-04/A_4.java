import java.util.Scanner;

class A_4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int d;
        int r;
        double f;

        d = a / b;
        r = a % b;
        f = (double) a / b;

        System.out.println(d + " " + r + " " + String.format("%.5f", f));

    }
}
