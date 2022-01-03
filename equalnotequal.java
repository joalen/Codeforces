import java.io.*;
import java.util.Collections;
import java.util.Arrays; 

public class equalnotequal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine()); 

        for (int current = 0; current < t; current++) {
            String[] currentLn = br.readLine().split(""); 
            pw.println(Collections.frequency(Arrays.asList(currentLn), "N") == 1 ? "NO" : "YES"); 
        }

        pw.close();
        br.close();
    }    
}
