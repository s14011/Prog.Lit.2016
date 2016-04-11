import java.io.*;

class B_1{
    public static void main(String[] args)throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        int x = Integer.parseInt(s);
        int num = x * x * x;
        System.out.print(num);

    }
}

