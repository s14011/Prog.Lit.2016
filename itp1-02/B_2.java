import java.util.Scanner;

class B_2{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a < b && b < c){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
