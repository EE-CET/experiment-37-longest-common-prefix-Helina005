
    
      import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        if (n == 0) {
            System.out.println("-1");
            return;
        }

        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // While the current word does not start with the prefix
            while (strs[i].indexOf(prefix) != 0) {
                // Shorten the prefix by one character from the end
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If prefix becomes empty, there's no common prefix
                if (prefix.isEmpty()) {
                    System.out.println("-1");
                    return;
                }
            }
        }

        System.out.println(prefix);
        sc.close();
    }
}
