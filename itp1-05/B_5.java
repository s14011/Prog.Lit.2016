import java.util.Scanner;

class B_5{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(sc.hasNextInt()){
        int H = sc.nextInt();
        int W = sc.nextInt();
        if(H == 0 && W == 0)break;
            for(int i = 0; i < H; i++){
                for(int u = 0; u < W; u++){
                if(i == 0 || i == H-1)
                System.out.print("#");
                else{
                if(u == 0 || u == W-1)
                System.out.print("#");
                else
                System.out.print(".");
                }
                }
                System.out.println();
            }
                System.out.println();
        }
    }
}
