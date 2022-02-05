import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class plusandmultiply {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken()); 

        while (t-- > 0) { 
            st = new StringTokenizer(br.readLine()); 
            Long n = Long.parseLong(st.nextToken()), a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken()); 
            LinkedList<Long> sequence = new LinkedList<Long>();
            sequence.add(1L); 
            int currentPos = 0; 

            while (!sequence.contains(n)) { 
                if (sequence.contains(n)) { pw.println("Yes"); break; } 
                else { 
                    if ((sequence.get(currentPos) * a) == n || (sequence.get(currentPos) + b) == n) { pw.println("Yes"); break; }
                    else if (sequence.get(currentPos) > n) { pw.println("No"); break; } 
                    else { sequence.add(Math.min(sequence.get(currentPos) * a, sequence.get(currentPos) + b)); }
                } 
            }
        }
        pw.close();
        br.close(); 

    }
}
