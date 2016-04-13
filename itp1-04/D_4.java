import java.util.Scanner;

class D_4{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int ai = scan.nextInt();
        int min;
        int max;
        long sum = 0;

        min = ai;
        max = ai;
        sum += ai;


        for (int i = 1; i < n; i++){
            ai = scan.nextInt();
            min = Math.min(min, ai);
            max = Math.max(max, ai);
            sum += ai;
        }
         System.out.println(min + " " + max + " " + sum);
    }
}
