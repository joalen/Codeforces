import java.io.*;
import java.util.Arrays; 

public class diversestrings { 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());
        String alpString = "abcdefghijklmnopqrstuvwxyz"; 

        while (t-- > 0) { 
            char[] alphabets = br.readLine().toCharArray(); 
            
            Arrays.sort(alphabets);

            String substring = new String(alphabets); 
            if (alpString.contains(substring) == true) { pw.println("Yes"); }
            else { pw.println("No"); }
        }

        pw.close();
        br.close();
    }
}
