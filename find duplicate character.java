import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        if (s == null || s.trim().isEmpty()) {
            System.out.println("No duplicates");
            return;
        }

        s = s.trim();

        int seen = 0;
        int duplicates = 0;

        for (int i = 0; i < s.length(); i++) {
            int bit = 1 << (s.charAt(i) - 'a');
            if ((seen & bit) != 0) {
                duplicates |= bit; 
            } else {
                seen |= bit;
            }
        }

        int printed = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int bit = 1 << (ch - 'a');

            if ((duplicates & bit) != 0 && (printed & bit) == 0) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(ch);
                printed |= bit; 
            }
        }

        if (result.length() > 0) {
            System.out.println(result.toString());
        } else {
            System.out.println("No duplicates");
        }
    }
}
