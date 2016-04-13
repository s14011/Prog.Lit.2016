import java.util.Scanner;

class B_4{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    double r = scan.nextDouble();
    double en = 3.141592653589;

    System.out.println(String.format("%.6f", r * r * en) + " " +String.format("%.6f", 2 * en * r));

    }
}
