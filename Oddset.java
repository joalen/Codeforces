import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Oddset { 

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out); 
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int t = Integer.parseInt(st.nextToken());

        while (t-- > 0) { 
            st = new StringTokenizer(br.readLine()); 
            int n = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine()); 
            int odd = 0, even = 0; 

            for (int i = 0; i < 2 * n; i++) { 
                if (Integer.parseInt(st.nextToken()) % 2 == 0) { even++; }
                else { odd++; }
            }

            if (even == odd) { pw.println("YES"); }
            else { pw.println("NO"); }
        }

        pw.close();
        br.close();
    }
}