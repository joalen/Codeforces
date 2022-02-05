import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class bmailnetwork {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
		
        int n = Integer.parseInt(br.readLine());
		StringTokenizer str = new StringTokenizer(br.readLine());
		
        int originalPath[] = new int[n + 1];
		int index = 2;

        while(str.hasMoreTokens()){
		    originalPath[index++] = Integer.parseInt(str.nextToken());
		} 

		index = n;
		LinkedList<Integer> path = new LinkedList<Integer>();
		path.add(n);

		while(index != 1){
		    path.add(originalPath[index]);
		    index = originalPath[index];
		}

        Collections.reverse(path); 
        
		pw.println(path.toString().replace("[", "").replace("]", "").replace(",", ""));
        pw.close();
        br.close();
    }
}