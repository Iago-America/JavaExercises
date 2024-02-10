import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputText;
        int counter = 1;
        
        do{
           inputText = in.nextLine();
           
           System.out.println(counter + " " + inputText);
            
            counter++;
        } while((!(inputText.toLowerCase().contains("end-of-file")) || !(inputText.toLowerCase().contains("eof"))) && in.hasNextLine());
        in.close();
    }
}
