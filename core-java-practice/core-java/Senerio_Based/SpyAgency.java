import java.util.*;
public class SpyAgency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter secret message: ");
        String msg = sc.nextLine();
        String rev = "";
        for (int i = msg.length() - 1; i >= 0; i--) {
            rev += msg.charAt(i);
        }
        System.out.println("Reversed String: " + rev);
        if (msg.equalsIgnoreCase(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        int vowels = 0, consonants = 0;

        for (int i = 0; i < msg.length(); i++) {
            char ch = Character.toLowerCase(msg.charAt(i));

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        char[] a = s1.toLowerCase().toCharArray();
        char[] b = s2.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

        System.out.print("Enter surveillance log: ");
        String log = sc.nextLine();

        for (int i = 0; i < log.length(); i++) {
            if (log.indexOf(log.charAt(i)) == log.lastIndexOf(log.charAt(i))) {
                System.out.println("First Non-Repeating Character: " + log.charAt(i));
                break;
            }
        }
    }
}
