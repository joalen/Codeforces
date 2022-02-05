import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList; 

public class badge {

    public static void dfs(LinkedList<String> arrayList, int amount) { 
        PrintWriter pw = new PrintWriter(System.out);
        boolean[] visitedNodes = new boolean[amount + 1]; 

		for (int i = 1; i <= amount; i++) {
			int currentPos=i;
			while(!visitedNodes[currentPos]) {
				visitedNodes[currentPos] = true;
				currentPos = Integer.parseInt(arrayList.get(currentPos));
			}
			System.out.print(currentPos +" ");
            Arrays.fill(visitedNodes, false); 
		}
        pw.close();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int amount = Integer.parseInt(br.readLine());
        LinkedList<String> path = new LinkedList<String>(); 
        path.add("0"); 
        Collections.addAll(path, br.readLine().split(" ")); 

        dfs(path, amount); 
        br.close();
    }
}
