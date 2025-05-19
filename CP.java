package cp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author arafa
 */
public class CP {
    int array[];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(i);
        System.out.println("Enter Course");
        String words = b.readLine();
        String words2 = b.readLine();
        
        System.out.println("Edureka" + words);
        
    }
    
}
