import java.io.*;
import java.util.Random;

public class ary {
    public static void main(String [] args) throws IOException{
        
        BufferedWriter BR = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader BW = new BufferedReader(new InputStreamReader(System.in));
        Random srand = new Random();
        boolean T = true;      
        int C = 40;
        int[] B = new int[C];

        for(int i = 0; i<C; i++){
            int x = srand.nextInt(100);
            B[i] = x;
            System.out.println(B[i]);
        }
        while(T!=true){
            
        }
    }
}
