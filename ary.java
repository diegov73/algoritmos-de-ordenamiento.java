import java.io.*;
import java.util.Random;

class arreglo{
    int C = 40;
    int[] B = new int[C];
    Random srand = new Random();

    void arrre(){
        for(int i = 0; i<C; i++){
            int x = srand.nextInt(100);
            B[i] = x;
            System.out.println(B[i]);
        }
    }
}

public class ary {
    public static void main(String [] args) throws IOException{
        
        BufferedWriter BR = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader BW = new BufferedReader(new InputStreamReader(System.in));
        arreglo base = new arreglo();
        boolean T = true;      

        base.arrre();
    }
}
