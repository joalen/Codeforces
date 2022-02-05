import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class soldierandbananas {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine()); 

        int k = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken()) + 1; 

        int cost = 0; 

        while (w-- > 0) { cost += w * k; }

        if (n - cost < 0) { pw.println(Math.abs(n - cost)); }
        else { pw.println(0); }
        pw.close();
        br.close();
    }
}
