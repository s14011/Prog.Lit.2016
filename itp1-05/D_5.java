import java.util.Scanner;

class D_5{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int i = 1;

    while(i <= n){
    if(i % 3 == 0){
        System.out.print(" " + i);
        } else {
        int x = i;
        while(x > 0){
            if(x % 10 == 3){
         System.out.print(" " + i);
                     break;
                    }
            x = x / 10;
                }
            }
        i++;
        }
    System.out.println();
    }
}
