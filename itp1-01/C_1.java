import java.util.Scanner;

class C_1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int menseki = a * b;
        int syuu = a * 2 + b * 2;

        System.out.println(menseki + " " + syuu);
    }
}
