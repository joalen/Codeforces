import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
 
public class LongComparison {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        PrintWriter pw = new PrintWriter(System.out); 
        StringTokenizer st = new StringTokenizer(br.readLine()); 
 
        int t = Integer.parseInt(st.nextToken());
 
        while (t-- > 0) { 
            st = new StringTokenizer(br.readLine()); 
            Long firstInteger = Long.parseLong(st.nextToken()); 
            int zeroAppendFirst = Integer.parseInt(st.nextToken()); 
            st = new StringTokenizer(br.readLine()); 
            Long secondInteger = Long.parseLong(st.nextToken()); 
            int zeroAppendSecond = Integer.parseInt(st.nextToken()); 

            int minimum = Math.min(zeroAppendFirst, zeroAppendSecond); 

            zeroAppendFirst -= minimum;
            zeroAppendSecond -= minimum;

            if (zeroAppendFirst >= 7) { pw.println(">"); }
            else if (zeroAppendSecond >= 7) { pw.println("<"); }
            else { 
                for (int i = 0; i < zeroAppendFirst; ++i) { firstInteger *= 10L; }
                for (int i = 0; i < zeroAppendSecond; ++i) { secondInteger *= 10L; }

                if (firstInteger < secondInteger) { pw.println("<"); }
                else if (firstInteger > secondInteger) { pw.println(">"); }
                else { pw.println("="); }
            }
        }
        pw.close();
        br.close();
    }
}