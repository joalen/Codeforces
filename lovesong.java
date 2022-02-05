import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class lovesong {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        PrintWriter pw = new PrintWriter(System.out); 
        StringTokenizer st = new StringTokenizer(br.readLine());

        final int originalStrLeg = Integer.parseInt(st.nextToken()); 
        int questions = Integer.parseInt(st.nextToken()); 
        String string = br.readLine(); 
        //final String alphabet = "abcdefghijklmnopqrstuvwxyz"; // If time constraints weren't a limiting factor
        int asciivalues[] = new int[originalStrLeg + 1]; 

        for (int i = 1; i <= originalStrLeg; i++) { asciivalues[i] = asciivalues[i-1] + string.codePointAt(i-1) - 96; }

        while (questions-- > 0) { 
            st = new StringTokenizer(br.readLine());
            int leftBound = Integer.parseInt(st.nextToken()); 
            int rightBound = Integer.parseInt(st.nextToken()); 
            int finalLength = asciivalues[rightBound] - asciivalues[leftBound - 1]; 
            //String newSubstring = ""; 



            /*for (int i = 0; i < 26; i++) { // If time constraints weren't an issue
                String regexFormula = "[^" + String.valueOf(alphabet.charAt(i)) + "]"; 
                // newSubstring += substring.replaceAll(regexFormula, "").repeat(i + 1);
                finalLength += substring.replaceAll(regexFormula, "").repeat(i + 1).length(); 
            }*/

            //for (int i = 0; i < substring.length(); i++) { newSubstring += Character.toString(substring.charAt(i)).repeat(alphabet.indexOf(substring.charAt(i)) + 1); }
            
            pw.println(finalLength); 
        }
        pw.close();
        br.close(); 
    }    
}
