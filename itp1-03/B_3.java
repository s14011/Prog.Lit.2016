import java.util.Scanner;

class B_3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x;
        int i = 1;

        while(true) {
            x = scan.nextInt();
            if (x == 0){
                    break;
            }
            System.out.println("Case" +" " + i + ":" + " " + x);
            i++;
        }
    }
}
