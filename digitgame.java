import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class digitgame { 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out); 

        int t = Integer.parseInt(br.readLine()); 

        while (t-- > 0) { 
            int digits = Integer.parseInt(br.readLine()); 
            char[] number = br.readLine().toCharArray(); 

            Boolean odd = false, even = false;
            for (int i = 1; i <= digits; i++) { 
                if (i % 2 == 1) {
                    odd |= ((number[i - 1] - '0') % 2 == 1);
                } else {
                    even |= ((number[i - 1] - '0') % 2 == 0);
                }
            }

            if (digits % 2 == 1) { if (odd) { pw.println(1); } else { pw.println(2); } } 
            else { if (even) { pw.println(2); } else { pw.println(1); } }
        }
        pw.close(); 
        br.close(); 
    }
}

