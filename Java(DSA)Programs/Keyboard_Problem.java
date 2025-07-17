import java.util.*;

public class Keyboard1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input string of words
        String input = sc.nextLine();
        String[] words = input.split(" ");
        
        // Keyboard rows
        String row1 = "qwertyuiopQWERTYUIOP";
        String row2 = "asdfghjklASDFGHJKL";
        String row3 = "zxcvbnmZXCVBNM";
        int c=0;
        for (String word : words) {
            String lowerWord = word.toLowerCase();
            if (isFromOneRow(lowerWord, row1) || isFromOneRow(lowerWord, row2) || isFromOneRow(lowerWord, row3)) {
                System.out.print(word + " ");
                c++;
            }
           
        }
        if(c==0)
        {
            System.out.print("[]");
        }
    }

    // Helper method to check if all characters of the word are in the row
    static boolean isFromOneRow(String word, String row) {
        for (char c : word.toCharArray()) {
            if (row.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}

